package com.example.demo.controllers;

import com.example.demo.models.Base;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

public interface BaseController <E extends Base, ID extends Serializable>{
    public ResponseEntity<?> guardarEntidad(E entity);
    public ResponseEntity<?> actualizarEntidad(ID id, E entity);
    public ResponseEntity<?> encontrarPorId(ID id);
    public ResponseEntity<?> traerTodos();
}
