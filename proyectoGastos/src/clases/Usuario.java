/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author ezequ
 */
public class Usuario extends Informacion{
    
    private ArrayList gastos;
    private float saldo;
    private String contrasenia;

    public ArrayList getGastos() {
        return gastos;
    }

    public void setGastos(ArrayList gastos) {
        this.gastos = gastos;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Usuario(ArrayList gastos, float saldo, String contrasenia, String nombre, String edad, String celular) {
        super(nombre, edad, celular);
        this.gastos = gastos;
        this.saldo = saldo;
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Usuario{" + "gastos=" + gastos + ", saldo=" + saldo + ", contrasenia=" + contrasenia + '}';
    }


}
