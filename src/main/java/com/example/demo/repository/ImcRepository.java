/*
    APIREST SPRINGBOOT  : ImcRepository
    AUTORA              : Maria Tchijov Cruz
    FECHA               : 21 abr 2022
    Repositorio principal de la aplicación
*/

package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.Imc;

public interface ImcRepository extends CrudRepository<Imc, Integer> {}
