package com.example.demo.services;

import com.example.demo.models.Materia;
import com.example.demo.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class MateriaServiceImpl extends BaseServiceImpl<Materia, Long> implements MateriaService{
    public MateriaServiceImpl(BaseRepository<Materia, Long> baseRepository) {
        super(baseRepository);
    }
}
