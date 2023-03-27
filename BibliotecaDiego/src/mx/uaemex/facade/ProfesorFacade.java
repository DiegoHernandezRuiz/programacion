/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uaemex.facade;

import java.util.List;
import mx.uaemex.dao.ProfesorDao;
import mx.uaemex.dto.Profesor;
import mx.uaemex.servicios.ServicioBiblioteca;

/**
 *
 * @author Diego
 */
public abstract class ProfesorFacade implements ServicioBiblioteca{
    ProfesorDao profesorDao = new ProfesorDao();

   
    @Override
    public void agregarProfesor(List<Profesor> lista, Profesor profesor) {
       profesorDao.agregarProfesor(profesor);
    }

  
    
    @Override
    public void actualizarProfesor(List<Profesor> lista, Profesor profesor) {
        profesorDao.actualizarProfesor(profesor);
    }
    

    @Override
    public void eliminarProfesor(List<Profesor> lista, Profesor profesor) {
        profesorDao.eliminarProfesor(profesor);
    }

   
    @Override
    public void buscarProfesor(List<Profesor> lista, Profesor profesor) {
        profesorDao.buscarProfesor(1);
    }
}
