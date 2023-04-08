package com.example.demo.services;

import com.example.demo.models.Profesor;
import com.example.demo.repositories.BaseRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ProfesorServiceImpl extends BaseServiceImpl<Profesor, Long> implements ProfesorService{
    public ProfesorServiceImpl(BaseRepository<Profesor, Long> baseRepository) {
        super(baseRepository);
    }
    
}
