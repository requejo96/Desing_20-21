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
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public Corredor(String nombre, String DNI, Date fechaNacimiento, String direccion, String telefonoContacto) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefonoContacto = telefonoContacto;
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
    
    public String[] toArrayString()
    {
      String[] s = new String[5];
      s[0] = nombre;
      s[1] = DNI;
      s[2] = sdf.format(fechaNacimiento);
      s[3] = direccion;
      s[4] = telefonoContacto;
      
      return s;
      
    }
    
    
}
