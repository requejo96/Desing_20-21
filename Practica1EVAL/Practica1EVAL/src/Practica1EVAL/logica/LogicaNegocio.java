/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1EVAL.logica;

import Practica1EVAL.dto.Corredor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Requejo
 */
public class LogicaNegocio {
    
    //corredores
    private static List<Corredor> listaCorredores = new ArrayList<>();
    
    public static void addCliente(Corredor corredor)
    {
    
        listaCorredores.add(corredor);
    
    }
    
    public static List<Corredor> getListaCorredores() 
    {
        
        return listaCorredores;
        
    }
    
    //carreras
}
