package com.example.demo;

import com.example.demo.models.Materia;
import com.example.demo.models.Profesor;
import com.example.demo.repositories.MateriaRepository;
import com.example.demo.repositories.ProfersorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private ProfersorRepository profesorRepository;

	@Autowired
	private MateriaRepository materiaRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner init() {
		return (args) -> {
			List<Materia> materias = new ArrayList<>();

			Materia discreta = materiaRepository.save(new Materia("Discreta","K1091"));
			Materia analisis = materiaRepository.save(new Materia("analisis","K1091"));
			Materia analisisSistemas = materiaRepository.save(new Materia("analisis de sistemas","K1091"));

			materias.add(discreta);
			materias.add(analisis);
			materias.add(analisisSistemas);

			Profesor profesor = new Profesor("Juan", "Perez", "12345678");
			profesor.setMaterias(materias);

			profesorRepository.save(profesor);
			//profesorRepository.save(new Profesor("Juan", "Perez", "12345678", discreta));
		};
	}

}
