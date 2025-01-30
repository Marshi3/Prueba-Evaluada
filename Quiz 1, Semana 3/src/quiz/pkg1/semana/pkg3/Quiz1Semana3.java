/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.pkg1.semana.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Quiz1Semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   // Determinar el monto total que debe pagar la caja-
   // Calcule monto basado en el salario para un empleado especifico
   // salario individual 
   // calcular el monto total a pagar aplicando los rubros
   
   
   // SEM 9.25% del salario
   // IVM 5.08% del salario
   
   // La empresa deberá pagar a la CCSS un total de 42990. 
   // La empresa deberá abonar ala CCSS el monto ### por concepto de SEM y IVM.
   
   
   // Variables 
   String nombreEmpleado = ""; 
   double salarioIndividual = 0.0; 
   String variableTemporal = "";
   
   double montoTotal = 0.0;
   double salarioSEM = 0.0;
   double salarioIVM = 0.0; 
   double totalDeduccion = 0.0;
   
   double SEM = 0.0925;
   double IVM = 0.0508;
           
 
        nombreEmpleado = JOptionPane.showInputDialog("Nombre de empleado");
        variableTemporal = JOptionPane.showInputDialog("¿Cual es el salario?");
        
   
   salarioIndividual = Double.parseDouble(variableTemporal);
   salarioSEM = salarioIndividual * 0.0925;
   salarioIVM = salarioIndividual * 0.0508;
   //montoTotal = salarioIndividual - (salarioIVM + salarioSEM);
   totalDeduccion = salarioIVM + salarioSEM;
   
   
   
   JOptionPane.showMessageDialog(null,"La empresa debera pagar un total " + totalDeduccion + "\n" +
                                      "La empresa deberá abonar ala CCSS el monto" + "\n" + 
                                       "Por concepto de SEM " + salarioSEM  + "\n" +
                                       "Por concepto IVM debera abonar: " + salarioIVM );
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
