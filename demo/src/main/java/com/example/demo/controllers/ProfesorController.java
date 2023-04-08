package com.example.demo.controllers;

import com.example.demo.models.Profesor;
import com.example.demo.services.ProfesorServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/profesor")
public class ProfesorController extends BaseControllerImpl<Profesor, ProfesorServiceImpl>{
    
}
