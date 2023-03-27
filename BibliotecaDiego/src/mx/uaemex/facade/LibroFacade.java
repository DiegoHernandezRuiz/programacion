/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uaemex.facade;

import java.util.List;
import mx.uaemex.dao.LibroDao;
import mx.uaemex.dto.Libro;
import mx.uaemex.servicios.ServicioBiblioteca;

/**
 *
 * @author Diego
 */
public abstract class LibroFacade implements ServicioBiblioteca{
    LibroDao libroDao = new LibroDao();

   
    public void agregarLibro(List<Libro> lista, Libro libro) {
       libroDao.Agregar(libro);
    }

  
    
    public void actualizarLibro(List<Libro> lista, Libro libro) {
        libroDao.Actualizar(libro);
    }
    

    public void eliminarLibro(List<Libro> lista, Libro libro) {
        libroDao.Eliminar(libro);
    }

   
    public void buscarLibro(List<Libro> lista, Libro libro) {
        libroDao.Buscar(1);
    }

}
