package com.example.demo.controllers;

import com.example.demo.models.Materia;
import com.example.demo.services.MateriaServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/materia")
public class MateriaController extends BaseControllerImpl<Materia, MateriaServiceImpl>{
}
