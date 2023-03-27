/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecadiego;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.uaemex.dto.Alumno;
import mx.uaemex.dto.Libro;
import mx.uaemex.dto.Prestamo;

/**
 *
 * @author eq29
 */
public class BibliotecaDiego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Libro libro1 = new Libro();
        libro1.setId(1);
        libro1.setNombre("Fundamentos de programacion");
        libro1.setCategoria("Programación");
        libro1.setEditorial("Alfaomega");
        libro1.setIsbn(2324);
        libro1.setStock(5);
        
        Libro libro2 = new Libro();
        libro2.setId(2);
        libro2.setNombre("Calculo");
        libro2.setCategoria("Matematicas");
        libro2.setEditorial("Alfaomega");
        libro2.setIsbn(344);
        libro2.setStock(2);
        
        Libro libro3=new Libro();
        libro3.setId(3);
        libro3.setNombre("Fisica 1");
        libro3.setCategoria("Ciencias");
        libro3.setEditorial("Patito");
        libro3.setIsbn(4659);
        libro3.setStock(5);
        
        Libro libro4=new Libro();
        libro4.setId(4);
        libro4.setNombre("El principito");
        libro4.setCategoria("Cuentos Infantiles");
        libro4.setEditorial("Deco10");
        libro4.setIsbn(8945);
        libro4.setStock(3);
        
         Libro libro5=new Libro();
        libro5.setId(5);
        libro5.setNombre("La llorona");
        libro5.setCategoria("Leyenda");
        libro5.setEditorial("mexac");
        libro5.setIsbn(8412);
        libro5.setStock(4);
        
        Libro libro6=new Libro();
        libro6.setId(6);
        libro6.setNombre("Oz");
        libro6.setCategoria("Cuentos Infantiles");
        libro6.setEditorial("DUI2");
        libro6.setIsbn(9874);
        libro6.setStock(6);
       
        
        
        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro2);
        listaLibros.add(libro1);
        
        List<Libro> lista2Libros=new ArrayList<>();
        lista2Libros.add(libro3);
        lista2Libros.add(libro4);
        
        List<Libro> lista3Libros=new ArrayList<>();
        lista3Libros.add(libro5);
        lista3Libros.add(libro6);
        
        Alumno alumno1 = new Alumno();
        alumno1.setId(1);
        alumno1.setNombre("Diego");
        alumno1.setApellidoPaterno("Hernadez");
        alumno1.setApellidoMaterno("Ruiz");
        alumno1.setNumeroCuenta(20227102);
        
        Alumno alumno2=new Alumno();
        alumno2.setNombre("Israel");
        alumno2.setId(2);
        alumno2.setApellidoPaterno("Salazar");
        alumno2.setApellidoMaterno("Michel");
        alumno2.setNumeroCuenta(2567122);
        
        Alumno alumno3=new Alumno();
        alumno3.setNombre("Fercho");
        alumno3.setId(3);
        alumno3.setApellidoPaterno("Minina");
        alumno3.setApellidoMaterno("Minina");
        alumno3.setNumeroCuenta(2548922);
        
        Prestamo prestamo1 = new Prestamo();
        Date fechaIni = new Date();
        prestamo1.setId(1);
        prestamo1.setFolio(234);
        prestamo1.setFechainicio(fechaIni);
        prestamo1.setFechaentrega(fechaIni);
        prestamo1.setEstatus("en espera");
        prestamo1.setLibros(listaLibros);
        prestamo1.setPersona(alumno1);
        
        
        Prestamo prestamo2=new Prestamo();
        Date fecha=new Date();
        prestamo2.setId(2);
        prestamo2.setFolio(32323);
        prestamo2.setEstatus("en uso");
        prestamo2.setFechainicio(fecha);
        prestamo2.setFechaentrega(fecha);
        prestamo2.setLibros(lista2Libros);
        prestamo2.setPersona(alumno2);
        
        Prestamo prestamo3=new Prestamo();
        Date fechaInici=new Date();
        prestamo3.setId(3);
        prestamo3.setFolio(4586);
        prestamo3.setEstatus("libre");
        prestamo3.setFechainicio(fechaInici);
        prestamo3.setFechaentrega(fechaInici);
        prestamo3.setLibros(lista3Libros);
        prestamo3.setPersona(alumno3);
        
        
        
        Test1 test1 = new Test1();
        test1.testCrearLibro(libro1);
        test1.testCrearLibro(libro2);
        test1.testCrearLibro(libro3);
        test1.testCrearLibro(libro4);
        test1.testCrearLibro(libro5);
        test1.testCrearLibro(libro6);
        test1.testCrearAlumno(alumno1);
        test1.testCrearAlumno(alumno2);
        test1.testCrearAlumno(alumno3);
        test1.testCrearPrestamo(prestamo1);
        test1.testCrearPrestamo(prestamo2);
        test1.testCrearPrestamo(prestamo3);

        test1.consultarTodos();
        test1.consultarPrestamo();
    }
    }
    
