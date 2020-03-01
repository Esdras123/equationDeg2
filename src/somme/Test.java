/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somme;

/**
 *
 * @author ESDRAS
 */
public class Test {

    public static boolean verify(Double results, Double resultAttendu, Double x, double tol) {

        if (results == null) {
            return resultAttendu == null;
        } else {
            if (resultAttendu != 0)
                return Math.abs(((results - x) - resultAttendu) / resultAttendu) < tol;
            else{
                return results.equals(x);
            }
        }
    }
}
