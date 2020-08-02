/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryner
 */
public class ConjuntoLibros {
   
    ClsLibro[] libros= new ClsLibro[5];

    public ClsLibro[] getLibros() {
        return libros;
    }
    
   public void añadir(ClsLibro libro){
       try {
         for (int i = 0; i < 4 ; i++) {
             if (libros[i]== null) {
              libros[i]=libro;
              break;
             }
                         
    
       }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "No se añadio el libro " + e);
       }
      
       
   }
          
    
  public void eliminarLibro(String nombre){
      try {
           for (int i = 0; i < 4; i++) {
          if (libros[i].titulo== nombre || libros[i].autor == nombre) {
              libros[i]= null;
          }
      }
      } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "No se eliminó el libro" + e);
      }
        
     
     }  
  public void mostar(){
      for (int i = 0; i < 4; i++) {
          JOptionPane.showMessageDialog(null,"Autor " + libros[i].getAutor() + "\n" + "Titulo " + libros[i].getTitulo() + "\n" + "Numero de paginas " + libros[i].getNumpag() + "\n" + "Calificacion " + libros[i].getNum() );
      }
      
  }
    public void ordenar(){
        Arrays.sort(libros);
        
    }
   
}
