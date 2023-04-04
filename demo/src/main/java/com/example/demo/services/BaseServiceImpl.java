package com.example.demo.services;

import com.example.demo.models.Base;
import com.example.demo.repositories.BaseRepository;

import java.io.Serializable;
import java.util.List;


public abstract class BaseServiceImp <E extends Base, ID extends Serializable> implements BaseService<E, ID>{
    
    protected BaseRepository<E, ID> baseRepository;
    
    public BaseServiceImp(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }
    @Override
    public E update(ID id, E entity) throws Exception {
        try {
            E e = baseRepository.findById(id).get();
            e = entity;
            return baseRepository.save(e);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    @Override
    public E save(E entity) throws Exception {
        try {
            return baseRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    @Override
    public E findById(ID id) throws Exception {
        try {
            return baseRepository.findById(id).get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    @Override
    public List<E> findAll() throws Exception {
        try {
            return baseRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
