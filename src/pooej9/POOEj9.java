/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej9;

import Entidad.Matematica;
import Servicio.MatematicaServicio;
import static java.lang.Math.random;

/**
 *
 * @author hdsot
 */
public class POOEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, mayor;
        Matematica matematica = new Matematica();
        MatematicaServicio mat = new MatematicaServicio();

        num1 = random() * 10;
        num2 = random() * 10;
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        matematica.setNum1(num1);
        matematica.setNum2(num2);
        mayor = mat.devolverMayor(num1, num2);
        System.out.println("El mayor numero es : " + mayor);
        System.out.println("El resultado de la potenciacion es :"
                             + mat.calcularPotencia(num1, num2));
        System.out.println("El resultado de la raiz cuadra del menor numero es: "
                + mat.calcularRaiz(num1, num2));
    }
    
}
