/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.w3blog.zpl.constant;

/**
 *
 * @author Desarrollo2
 */
public enum Correcion {
    ULTRAHIGH("H"), HIGH("Q"), STANDAR("M"), HIGH_DENSITY("L");

    String letter;

    private Correcion(String letter) {
        this.letter = letter;
    }

    /**
     * @return the letter
     */
    public String getCorrecion() {
        return letter;
    }
}
