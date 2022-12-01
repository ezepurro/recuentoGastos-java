/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ezequ
 */
public class Gasto implements Comparable<Gasto> {
    private float monto;
    private String fechaRealizado, categoria, comentarioAdicional;

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getFechaRealizado() {
        return fechaRealizado;
    }

    public void setFechaRealizado(String fechaRealizado) {
        this.fechaRealizado = fechaRealizado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getComentarioAdicional() {
        return comentarioAdicional;
    }

    public void setComentarioAdicional(String comentarioAdicional) {
        this.comentarioAdicional = comentarioAdicional;
    }

    public Gasto(float monto, String fechaRealizado, String categoria, String comentarioAdicional) {
        this.monto = monto;
        this.fechaRealizado = fechaRealizado;
        this.categoria = categoria;
        this.comentarioAdicional = comentarioAdicional;
    }

    @Override
    public String toString() {
        return "Gasto{" + "monto=" + monto + ", fechaRealizado=" + fechaRealizado + ", categoria=" + categoria + ", comentarioAdicional=" + comentarioAdicional + '}';
    }

      @Override
     public int compareTo(Gasto o) {
    //implement comparison here
    return 0;
  }
    
    
    
}
