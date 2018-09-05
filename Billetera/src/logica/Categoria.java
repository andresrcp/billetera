/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author X550Z
 */
class Categoria {

    private boolean tipo = false;//ingresos o gastos.
    private String nombre;
    private double monto;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.monto = 0;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void agregarMonto(double mas) {
        this.monto += mas;
    }

    public void tipoGoE(boolean arg) {
        this.tipo = arg;
    }
}
