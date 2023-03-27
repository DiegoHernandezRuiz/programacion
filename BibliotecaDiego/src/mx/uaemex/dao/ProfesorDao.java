/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uaemex.dto.Profesor;

/**
 *
 * @author eq29
 */
public class ProfesorDao {
    
     public  List<Profesor> profesores = new ArrayList<>();

     
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);

    }
    
    public void eliminarProfesor( Profesor profesor) {
        profesores.remove(profesor);
    }
    
    public Profesor buscarProfesor(int id) {
        for (int i = 0; i < profesores.size(); i++) {
            Profesor p= profesores.get(i);
            if(p.getId()== id ){
//                 System.out.println(a.getId());
                 return p;
            }
        }
         return null;
     
    }
    
    public void  actualizarProfesor(Profesor profesor) {
        for (int i = 0; i < profesores.size(); i++) {
          if(profesores.get(i).getId()== profesor.getId()){
              profesores.get(i).setNombre(profesor.getNombre());
               profesores.get(i).setApellidoMaterno(profesor.getApellidoMaterno());
          }
            }
        }
    
    public void imprimirProfesor (ArrayList<Profesor> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
         
       

    }
     
}
