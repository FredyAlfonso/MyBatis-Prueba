package com.mybatis.prueba.model;

import lombok.Data;

@Data
public class Persona {
    private Integer numeroDocumento;
    private String tipoDocumento;
    private String nombres;
    private String apellidos;
}
