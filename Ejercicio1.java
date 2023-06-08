/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String data=JOptionPane.showInputDialog("digite la cantidad de empleados");
         int empleados= Integer.parseInt(data);
         int suma= 0;
         
         for (int i=1; i <= empleados; i++) {
             String data2= JOptionPane.showInputDialog("ingrese el salario del empleado" + i + ":");
             int salario= Integer.parseInt(data2);
         
         
            
             suma+=salario;
            
             
             double montosem;
             montosem= suma*0.0925;
             double montoivm;
             montoivm= suma*0.0508;
             double totalfinal;
             totalfinal=montosem + montoivm;
         
             
             
 
           
           System.out.println("el total que la empresa abonara a la CCSS ES DE:" +totalfinal);
        
           
        
         }
    }
}
