/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import static java.lang.Math.abs;
import static java.lang.Math.floor;
import static java.lang.Math.max;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author hdsot
 */
public class MatematicaServicio {

    public double devolverMayor(double num1, double num2) {
        double mayor;
        mayor = max(num1, num2);
        return mayor;
    }
    public double calcularPotencia(double num1, double num2) {
        double numero1, numero2, resultado;
        numero1 = floor(num1);
        numero2 = floor(num2);
        System.out.println("numero 1 : " + numero1);
        System.out.println("numero 2 : " + numero2);
        if (numero2 > numero1) {
            resultado = pow(numero2, numero1);

        } else {
            resultado = pow(numero1, numero2);
        }
        return resultado;
    }
    public double calcularRaiz(double num1, double num2) {
        double raiz, numero;
        if (num2 > num1) {
            numero = abs(num1);
            System.out.println(numero);
        } else {
            numero = abs(num2);
            System.out.println(numero);
        }
        raiz = sqrt(numero);
        return raiz;
    }
}
