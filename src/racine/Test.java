/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racine;

/**
 *
 * @author ESDRAS
 */
public class Test {

    public static boolean verify(Double results, Double resultAttendu, double tol) {

        if (results == null) {
            return resultAttendu == null;
        } else {
            return Math.abs(Math.pow(results, 2) - resultAttendu) < tol;
        }
    }
}
