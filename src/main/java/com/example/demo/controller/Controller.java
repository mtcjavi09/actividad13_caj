/*
    APIREST SPRINGBOOT  :   Controller
    AUTORA              :   Maria Tchijov Cruz
    FECHA               :   21 abr 2022
    Controlador de la api rest
*/

package com.example.demo.controller;

import com.example.demo.dto.ImcDTO;
import com.example.demo.entity.Imc;
import com.example.demo.service.ImcService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("imc")
public class Controller 
{

    @Autowired
    ImcService imcService;

    @GetMapping()
    public Iterable<Imc> getImc() {return imcService.getImc();}

    @GetMapping("{id}")
    public Optional<Imc> getImcById(@PathVariable Integer id) {return imcService.getImcById(id);}

    @PostMapping()
    public ResponseEntity<String> guardarImc(@RequestBody ImcDTO imcDTO) 
    {
        try 
        {
            imcService.guardarImc(new Imc(imcDTO));
            return new ResponseEntity<>("IMC guardado", HttpStatus.OK);
        } 
        catch (Exception e) 
        {return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);}

    }

    @PutMapping("{id}")
    public ResponseEntity<String> actualizarImc(@PathVariable Integer id, @RequestBody ImcDTO imcDTO) 
    {
        try 
        {
            imcService.actualizarImc(id, new Imc(imcDTO));
            return new ResponseEntity<>("IMC actualizado", HttpStatus.OK);
        } 
        catch (Exception e) 
        {return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);}
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> borrarImc(@PathVariable Integer id) 
    {
        try 
        {
            imcService.borrarImc(id);
            return new ResponseEntity<>("IMC borrado", HttpStatus.OK);
        } 
        catch (Exception e) 
        {return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);}
    }
}
