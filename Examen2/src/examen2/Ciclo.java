/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Ciclo {    
       
    //Intento de matriz
     Habitacion habitacion1 [] [] = new Habitacion[3][3];
    
        int cantidadFilas   = 3;
        int cantidadColumnas   = 3;
        int matriz[][] = new int [cantidadFilas][cantidadColumnas];
        
       
        
        //Intento de informacion precargada
        
        habitacion1[0][0] = new Habitacion(101; "simple"; 100.0; "libre");
        habitacion[1] = new Habitacion(101; "simple"; 100.0; "libre");
        habitacion[2] = new 
        

      //Intento de modificar info
    public void modificarinfo(){
        
      int x;
      for(x=0;x<3;x++){
          Habitacion h=new Habitacion(int=0 String; int 100);
          h.setDescripcion(JOptionPane.showInputDialog(null,"Digite la descripción del producto:"));
          h.setCantidad(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la cantidad existente:")));
          h.setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el precio del producto:")));
          habitacion[x]=p;
      }
        
     
    }  
      
      
      //Intento de mostrar la informacion resumida
    public void Resumen(){
       
        String Resumen = "";
        for (int i = 0; i < contador; i++) {
            Resumen = Resumen + habitacion1[i].toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, Resumen);
    }
    
    
   }
    

