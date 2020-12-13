/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1EVAL.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Requejo
 */
public class Corredor {
    
    private String nombre;
    private String DNI;
    private Date fechaNacimiento;
    private String direccion;
    private String telefonoContacto;
    private int dorsal;
    private String marca;
    private String carrera;

   
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public Corredor(String nombre, String DNI, Date fechaNacimiento, String direccion, String telefonoContacto, int dorsal, String carrera, String marca) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefonoContacto = telefonoContacto;
        this.dorsal = dorsal;
        this.carrera = carrera;
        this.marca = marca;
    }



 
 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
  
    
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String[] toArrayString()
    {
      String[] s = new String[8];
      s[0] = nombre;
      s[1] = DNI;
      s[2] = sdf.format(fechaNacimiento);
      s[3] = direccion;
      s[4] = telefonoContacto;
      s[5] = Integer.toString(dorsal);
      s[6] = carrera;
      s[7] = marca;
      
      return s;
      
    }
    
    
}
