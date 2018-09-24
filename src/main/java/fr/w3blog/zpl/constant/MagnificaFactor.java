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
public enum MagnificaFactor {
    _150(1), _200(2), _300(3), _600(6);

    Integer numero;

    private MagnificaFactor(Integer numero) {
        this.numero = numero;
    }

    public Integer getMagnificaFactor() {
        return numero;
    }
}
