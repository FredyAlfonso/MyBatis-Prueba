package com.mybatis.prueba.service;

import com.mybatis.prueba.model.Persona;
import com.mybatis.prueba.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public void  create(Persona persona){
        personaRepository.create(persona);
    }

    public Persona read(Integer numeroDocumento){
        return personaRepository.read(numeroDocumento);
    }
}
