/*
    PRUEBA SPRINGBOOT   : ImcService
    AUTORA              : Maria Tchijov Cruz
    FECHA               : 11 abr 2022
    Servicio principal de la aplicación
*/

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Imc;
import java.util.Optional;
import com.example.demo.repository.ImcRepository;

@Service
public class ImcService 
{
    @Autowired
    ImcRepository imcRepository;

    public Iterable<Imc> getImc() {return imcRepository.findAll();}
    
    public Optional<Imc> getImcById(Integer id) {return imcRepository.findById(id);}

    public Imc guardarImc(Imc imc) {return imcRepository.save(imc);}

    public Imc actualizarImc(Integer id, Imc imc) 
    {
        imc.setId(id);
        return imcRepository.save(imc);
    }

    public void borrarImc(Integer id) 
    {
        Optional<Imc> persona = imcRepository.findById(id);
        imcRepository.delete(persona.get());
    }
}
