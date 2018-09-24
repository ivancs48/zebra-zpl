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
public enum Modelo {

    ORIGINAL(1), ENHANCED(2);

    Integer numero;

    private Modelo(Integer numero) {
        this.numero = numero;
    }

    public Integer getModelo() {
        return numero;
    }

}
