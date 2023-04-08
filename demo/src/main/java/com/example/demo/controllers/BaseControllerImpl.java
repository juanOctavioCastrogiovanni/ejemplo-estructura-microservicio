package com.example.demo.controllers;

import com.example.demo.models.Base;
import com.example.demo.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

public abstract class BaseControllerImpl <E extends Base,S extends BaseServiceImpl<E,Long>> implements BaseController<E, Long>{
    @Autowired
    private S service;
    
    @Override
    @PutMapping("/{id}")
    public ResponseEntity<?> actualizarEntidad(@PathVariable Long id,@RequestBody E entity){
        try {
            return ResponseEntity.ok(service.update(id, entity));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @Override
    @GetMapping("/{id}")
    public ResponseEntity<?> encontrarPorId(@PathVariable Long id){
        try {
            return ResponseEntity.ok(service.findById(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @Override
    @PostMapping("/guardar")
    public ResponseEntity<?> guardarEntidad(@RequestBody E entity){
        try
        {
            return ResponseEntity.ok(service.save(entity));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @Override
    @GetMapping({"","/"})
    public ResponseEntity<?> traerTodos(){
        try {
            return ResponseEntity.ok(service.findAll());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
