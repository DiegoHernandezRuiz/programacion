/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uaemex.facade;

import java.util.List;
import mx.uaemex.dao.PrestamoDao;
import mx.uaemex.dto.Prestamo;
import mx.uaemex.servicios.ServicioBiblioteca;

/**
 *
 * @author Diego
 */
public abstract class PrestamoFacade implements ServicioBiblioteca {
    PrestamoDao prestamoDao = new PrestamoDao();

   
    @Override
    public void agregarPrestamo(Prestamo prestamo) {
       prestamoDao.Agregar(prestamo);
    }

   public void buscarPrestamo(List lista, Prestamo prestamo) {
       prestamoDao.Buscar(1);
   }
    
    @Override
    public void actualizarPrestamo(List<Prestamo> lista, Prestamo prestamo) {
       prestamoDao.Actualizar(prestamo);
    }
    

  
    @Override
    public void eliminarPrestamo(Prestamo prestamo) {
        prestamoDao.Eliminar(prestamo);
    }

}
