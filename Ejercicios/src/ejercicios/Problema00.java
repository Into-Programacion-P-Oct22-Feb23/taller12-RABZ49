/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        double[][] resultado = new double[4][2];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                resultado[i][j]= factorial(datos[i][j]);
                System.out.printf("El factorial de %.0f es %.0f \n",datos[i][j],
                        resultado[i][j]);
            }
        }
    }

    public static double factorial(double numero) {
        if (numero <= 1) { // aquí se evalua el caso base
            
            return 1; // 0! = 1 
            // 1! = 1
        } else {
            
            
            return numero * factorial(numero - 1);

        }
    }
}
