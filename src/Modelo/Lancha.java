/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Dante
 */
public class Lancha {
    
    private String motor;
    
    private String marca;
    
    private String color;

    public Lancha() {
    }

    public Lancha(String motor, String marca, String color) {
        this.motor = motor;
        this.marca = marca;
        this.color = color;
    }
    

    /**
     * Get the value of color
     *
     * @return the value of color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     */
    public void setColor(String color) {
        this.color = color;
    }


    /**
     * Get the value of marca
     *
     * @return the value of marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Set the value of marca
     *
     * @param marca new value of marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }


    /**
     * Get the value of motor
     *
     * @return the value of motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * Set the value of motor
     *
     * @param motor new value of motor
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    
}
