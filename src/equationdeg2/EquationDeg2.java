/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equationdeg2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ESDRAS
 */
public class EquationDeg2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solver solver = new Solver();
        System.out.println(solver.resolve(1, 4, 4));
        System.out.println(solver.resolve(1, 0, 4));
        System.out.println(solver.resolve(1, 6, 8));
        System.out.println(solver.resolve(1, 4, 0));
        System.out.println(solver.resolve(0, 6, 0));
        System.out.println(solver.resolve(0, 0, 4));
    }

}
