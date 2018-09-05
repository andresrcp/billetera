/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author X550Z
 */
public class Cuenta {

    private String nombre;
    private double saldo;
    private ArrayList<Categoria> listaCatego = new ArrayList<Categoria>();

    public Cuenta(String nom) {
        this.nombre = nom;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void addCateg(Categoria nueva) {
        listaCatego.add(nueva);
    }

    public double modifSaldo(double a) {
        double nueSaldo = this.saldo + a;
        return nueSaldo;
    }

}
