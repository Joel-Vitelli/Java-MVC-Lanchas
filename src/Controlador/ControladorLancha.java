/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Lancha;


/**
 *
 * @author Dante
 */
public class ControladorLancha {
    
    private Lancha reflancha;

    public ControladorLancha() {
        
    }

    public ControladorLancha(Lancha reflancha) {
        this.reflancha = reflancha;
        reflancha = new Lancha();
        
    }
    

    public Lancha getReflancha() {
        return reflancha;
    }

    public void setReflancha(Lancha reflancha) {
        this.reflancha = reflancha;
    }
    
    
    
    public void agregarLancha(Integer id, String motor, String marca, String color){
        Lancha lancha1 = new Lancha();
        System.out.println("Agrege Lancha a la base de dato");
    }
    public void eliminarLancha(){
        System.out.println("Elimine Lancha de la base de datos");
    }
    public void modificarLancha(){
        System.out.println("Modifique Lancha de la base de datos");
    }
    
}
