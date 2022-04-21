/*
    APIREST SPRINGBOOT  : ImcDTO
    AUTORA              : Maria Tchijov Cruz
    FECHA               : 21 abr 2022
    DTO principal de la apirest
*/

package com.example.demo.dto;

import java.util.Date;
import lombok.Data;

@Data
public class ImcDTO 
{
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    private float estatura;
    private float peso;
    private float imc;
    private Date fecha;
}
