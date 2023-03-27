/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uaemex.servicios;

import java.util.List;
import mx.uaemex.dto.Prestamo;
import mx.uaemex.dto.Profesor;

/**
 *
 * @author Diego
 */
public interface ServicioBiblioteca {
    void agregarPrestamo ( Prestamo prestamo);
    void actualizarPrestamo ( List<Prestamo> lista, Prestamo prestamo);
    void buscarPrestamo ( List lista, Prestamo prestamo);
    void eliminarPrestamo (Prestamo prestamo);
    
    void agregarProfesor (List<Profesor> lista, Profesor profesor);
    void actualizarProfesor (List<Profesor> lista, Profesor profesor);
    void buscarProfesor (List<Profesor> lista, Profesor profesor);
    void eliminarProfesor (List<Profesor> lista, Profesor profesor);
    
    
}
