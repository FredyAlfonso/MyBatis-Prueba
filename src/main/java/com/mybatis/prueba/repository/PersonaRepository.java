package com.mybatis.prueba.repository;

import com.mybatis.prueba.model.Persona;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonaRepository {
    void create(Persona persona);
    Persona read(Integer numeroDocumento);
}
