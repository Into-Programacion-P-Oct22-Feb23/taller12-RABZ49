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
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];
        double sumaTotal;
        for (int i = 0; i < bases.length; i++) {
            resultado[i] = obtenerPotencia(bases[i], potencias[i]);
            System.out.printf("El valor  %.0f elevado a %.0f es: %.0f\n",
                    bases[i], potencias[i], resultado[i]);

        }
        sumaTotal = misterio(resultado, resultado.length);
        System.out.printf("\nEl resultado de la suma de los valores elevados "
                + "es %.0f\n", sumaTotal);
    }

    public static double obtenerPotencia(double base, double exponente) {

        if (exponente == 1) {
            return base;
        } else {

            return base * obtenerPotencia(base, exponente - 1);
        }
    }

    public static double misterio(double[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }
}
