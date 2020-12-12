/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1EVAL.dto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Requejo
 */
public class Carreras {

  
    
    private String nombre;
    private Date fecha;
    private String lugar;
    private String participantes;
 
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    
        public Carreras(String nombre, Date fecha, String lugar, String participantes) 
        {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.participantes = participantes;
      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public String[] toArrayString()
    {
     
      String[] s = new String[4];
      s[0] = nombre;
      s[1] = sdf.format(fecha);
      s[2] = lugar;
      s[3] = participantes;
 
      return s;
      
    }
    
}
