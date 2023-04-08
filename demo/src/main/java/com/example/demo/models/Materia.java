package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "materias")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Materia extends Base{
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "codigo")
    private String codigo;

}
