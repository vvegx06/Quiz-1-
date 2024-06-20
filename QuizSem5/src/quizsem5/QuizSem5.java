/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizsem5;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class QuizSem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numempleados;
        numempleados = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de empleados:"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite el salario de los empleados:"));
        // aqui lo que hice fue coger un salario promedio
        double totalsalarios = salario*numempleados;
        double sem = totalsalarios*0.0925;
        double ivm = totalsalarios*0.0508;
        double total = sem+ivm; 
        double salariouni = salario*0.0925;
        double salariodos = salario*0.0508;
        double empleado = salariouni+salariodos;
        System.out.println("quizsem5.QuizSem5.main()"+numempleados);
        System.out.println("quizsem5.QuizSem5.main()"+salario);   
        JOptionPane.showMessageDialog(null,"La empresa debe de abonar a la CCSS "+ total+"por concepto de SEM e IVM lo que seria un total de "+empleado+"por cada empleado");
    }
}
