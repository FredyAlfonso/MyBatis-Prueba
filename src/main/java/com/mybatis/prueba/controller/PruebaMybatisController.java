package com.mybatis.prueba.controller;

import com.mybatis.prueba.model.Persona;
import com.mybatis.prueba.service.PersonaService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("prueba/mybatis")
public class PruebaMybatisController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/prueba")
    public ResponseEntity<Object> prueba(){
        ResponseEntity<Object> respuesta;
        try{
            respuesta=ResponseEntity.ok("Holi");
        }catch(Exception e){
            respuesta= ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return respuesta;
    }

    @GetMapping("obtener")
    public ResponseEntity<Persona> obtener(@RequestParam("numeroDocumento") Integer numeroDocumento){
        ResponseEntity<Persona> respuesta;
        try{
            respuesta=ResponseEntity.ok(personaService.read(numeroDocumento));
        }catch(Exception e){
            respuesta= ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return respuesta;
    }

    @PostMapping("crear")
    public ResponseEntity<Object> crear(@RequestBody Persona persona){
        ResponseEntity<Object> respuesta;
        try{
            personaService.create(persona);
            respuesta=ResponseEntity.ok("ok");
        }catch(Exception e){
            respuesta= ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return respuesta;
    }
}
