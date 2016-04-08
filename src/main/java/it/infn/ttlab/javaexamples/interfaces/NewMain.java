/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.infn.ttlab.javaexamples.interfaces;

import static java.lang.Math.sqrt;

/**
 *
 * @author andre
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //NewMain app = new NewMain();

        Formula formula1 = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        Formula formula2 = (int a) -> sqrt(a * 100);
    }

}
