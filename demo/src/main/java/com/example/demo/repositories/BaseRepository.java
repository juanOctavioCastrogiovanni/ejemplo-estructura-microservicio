package com.example.demo.repositories;


import com.example.demo.models.Base;
import com.example.demo.models.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BaseRepository <Entidad extends Base, ID extends Serializable> extends JpaRepository<Entidad, ID> {
   
}
