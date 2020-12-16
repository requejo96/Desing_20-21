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
    //añadimos la variable corredor;
    private String equipo;

   
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    //añadimos String equipo al contructor Corredor
    public Corredor(String nombre, String DNI, Date fechaNacimiento, String direccion, String telefonoContacto, int dorsal, String carrera, String marca,String equipo) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefonoContacto = telefonoContacto;
        this.dorsal = dorsal;
        this.carrera = carrera;
        this.marca = marca;
        //añadimos el equipo
        this.equipo = equipo;
    }

    //añadimos Getter y setter del equipo
    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
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
      String[] s = new String[9];
      s[0] = nombre;
      s[1] = DNI;
      s[2] = sdf.format(fechaNacimiento);
      s[3] = direccion;
      s[4] = telefonoContacto;
      s[5] = Integer.toString(dorsal);
      s[6] = carrera;
      s[7] = marca;
      //añado equipo en la posicion 8
      s[8]= equipo;
      
      return s;
      
    }
    
    public String[] toArrayStringTiempo()
    {
       String [] c = new String[4];
       c[0]= Integer.toString(dorsal);
       c[1]= DNI;         
       c[2]= carrera;
       //añado el equipo para la tabla de los tiempos
       c[3]= equipo;
       c[4]= marca;
                
       return c;
                
    }
    
    
}
