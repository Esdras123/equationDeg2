/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equationdeg2;

import java.util.ArrayList;

/**
 *
 * @author ESDRAS
 */
public class Solver implements SolverInterface{

    @Override
    public ArrayList<Double> resolve(double a, double b, double c) {
        ArrayList<Double> sol = new ArrayList<>();

        if (a != 0) {
            double delta = (Math.pow(b, 2) - (4 * a * c));
            if (delta == 0) {
                sol.add((-b / (2 * a)));
                return sol;
            } else if (delta < 0) {
                return sol;
            } else {
                sol.add(((-b + Math.sqrt(delta)) / (2 * a)));
                sol.add(((-b - Math.sqrt(delta)) / (2 * a)));
                return sol;
            }
        } else {
            if (b != 0) {
                sol.add((-c / b));
                return sol;
            } else {
                if (c!=0)
                    return sol;
                else
                    return null;
            }
        }
    }
    
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
        System.out.println(solver.resolve(0, 0, 0));
    }
    
}
