/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.infn.ttlab.javaexamples.interfaces;

/**
 *
 * @author andre
 */
public class MyFormula implements Formula{

    @Override
    public double calculate(int a) {
        return sqrt(a * a);
    }
    
}
