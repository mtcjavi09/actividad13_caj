/*
    APIREST SPRINGBOOT  : Imc
    AUTORA              : Maria Tchijov Cruz
    FECHA               : 21 abr 2022
    Entidad principal de la api rest
*/

package com.example.demo.entity;

//Se importan las librerías necesarias para la entidad
import com.example.demo.dto.ImcDTO;
import static java.lang.Math.sqrt;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "imc")
@Data
public class Imc 
{
    //Columnas que contendrá la base de datos
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    private int id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="edad")
    private int edad;
    
    @Column(name="genero")
    private char genero;

    @Column(name="estatura")
    private float estatura;
    
    @Column(name="peso")
    private float peso;
    
    @Column(name="imc")
    private float imc;
    
    @Column(name="fecha")
    @CreationTimestamp
    private Date fecha;
    
    //Se generan los constructores necesarios para la aplicación
    //Constructor vacío
    public Imc() {}
    
    //Constructor con datos

    public Imc(ImcDTO imcDto) 
    {
        
        this.nombre = imcDto.getNombre();
        this.apellido = imcDto.getApellido();
        this.edad = imcDto.getEdad();
        this.genero = imcDto.getGenero();
        this.estatura = imcDto.getEstatura();
        this.peso = imcDto.getPeso();
        this.imc = imcDto.getImc();
        this.fecha = imcDto.getFecha();
    }
    
    
    //Getters y setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
    public char getGenero() {return genero;}
    public void setGenero(char genero) {this.genero = genero;}
    public float getEstatura() {return estatura;}
    public void setEstatura(float estatura) {this.estatura = estatura;}
    public float getPeso() {return peso;}
    public void setPeso(float peso) {this.peso = peso;}
    public float getImc() {return imc;}
    public void setImc() {this.imc = (float) (peso / sqrt(estatura));}
    public Date getFecha() {return fecha;}
    public void setFecha(Date fecha) {this.fecha = fecha;}
    
    //Método toString()
    @Override
    public String toString() 
    {
        return "Calculo [id= " + id + ", nombre= " + nombre + " " + apellido + 
                ", edad= " + edad + ", género= " + genero + ", estatura= " + estatura
                + ", peso= " + peso + ", imc= " + imc + ", fecha= " + fecha +"]";
    }
}
