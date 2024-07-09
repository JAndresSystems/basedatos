/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatosproyecto;

public class Producto {
   private int codigo;
   private String descripcion;
   private String nombre;
   private double precio;
   Producto(int c, String s, String n,double p){
       this.codigo=c;
       this.descripcion=s;
       this.nombre=n;
       this.precio=p;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   public Double getPrecio(){
       return precio;
   }
}
