/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uaemex.facade;

import java.util.List;
import mx.uaemex.dao.AlumnoDao;
import mx.uaemex.dto.Alumno;
import mx.uaemex.servicios.ServicioBiblioteca;

/**
 *
 * @author Diego
 */
public abstract class AlumnoFacade implements ServicioBiblioteca{
    
    AlumnoDao alumnoDao = new AlumnoDao();

   
    public void agregarAlumnos(List<Alumno>  lista, Alumno alumno) {
        alumnoDao.agregarAlumno(alumno);
    }

  
    public void actualizarAlumnos(List<Alumno> lista, Alumno alumno) {
        alumnoDao.actualizarAlumno(alumno);
    }
    
    public void eliminarAlumnos(List<Alumno> lista, Alumno alumno) {
        alumnoDao.eliminarAlumno(alumno);
    }

  
    public void buscarAlumnos(List<Alumno> lista, Alumno alumno) {
        alumnoDao.buscarAlumno(1);
    }
    
}
