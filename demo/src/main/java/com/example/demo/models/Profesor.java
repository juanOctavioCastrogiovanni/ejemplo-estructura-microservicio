package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "profesores")
@Setter
@Getter
@AllArgsConstructor
public class Profesor extends Base{
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni")
    private String dni;

    @ManyToMany
    @JoinTable(
            name = "profesor_materia",
            joinColumns = @JoinColumn(name = "profesor_id"),
            inverseJoinColumns = @JoinColumn(name = "materia_id")
    )
    private List<Materia> materias;

    public void addMateria(Materia materia){
        this.materias.add(materia);
    }

    public Profesor(String nombre, String apellido, String dni, Materia materia) {
        this.materias = new ArrayList<>();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.addMateria(materia);
    }

    public Profesor() {
        this.materias = new ArrayList<>();
    }

    public Profesor(String nombre, String apellido, String dni) {
        this.materias = new ArrayList<>();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;

    }
}
