/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatosproyecto;

import java.util.ArrayList;

/**
 *
 * @author JAIRO MENDOZA
 */
public class Control {
 public ArrayList<Cliente> c=new ArrayList();
 public ArrayList<Producto> p =new ArrayList();
  
public void AgregarCliente(int cc, String n){
    Cliente cli=new Cliente(cc,n);
    c.add(cli);
}
public void AgregarProducto(int c, String des, String n,double pre){
    Producto pro=new Producto(c,des,n,pre);
    p.add(pro);
}
public int buscarPersona(int cc){
    for(int i=0;i<c.size();i++){
        if(c.get(i).getCedula()==cc){
            return i;
        }
    }
    return -1;
}
public void Eliminar(int cc){
    int b=buscarPersona(cc);
    for(int i=0;i<c.size();i++){
        if(c.get(i).getCedula()==cc){
            c.remove(i);
            p.remove(i);
            return;
        }
    }
}
public boolean buscar(int cc){
    
    for(int i=0;i<c.size();i++){
        if(c.get(i).getCedula()==cc){
            return true;
        }
            
    }
    return false;
}
public String imprimirMatriz(){
    String rta="";
    rta=rta+"\tCedula"+"\tNombre"+"\tCodigo producto"+"\tDescripcion"+"\tNombre"+"\tPrecio"+"\n";
    for(int i=0;i<c.size();i++){
       rta=rta+(i+1)+")"+"\t"+c.get(i).getCedula()+"\t"+c.get(i).getNombre()+"\t"+p.get(i).getCodigo()+"\t\t"+p.get(i).getDescripcion()
               +"\t"+p.get(i).getNombre()+"\t"+p.get(i).getPrecio()+"\n";
    }
    return rta;
}
}
