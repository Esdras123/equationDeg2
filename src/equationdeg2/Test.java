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
public class Test {

    public static boolean verify(Params donnee, ArrayList<Double> results, ArrayList<Double> resultAttendu, double tol) {
        double a = donnee.a, b = donnee.b, c = donnee.c;

        if (resultAttendu == null) {
            return results == null;
        } else {
            if (resultAttendu.isEmpty()) {
                return results == resultAttendu;
            }
            if (resultAttendu.size() == 1) {
                if (resultAttendu.get(0).equals(0.0)) {
                    if (results != null) {
                        for (int i = 0; i < results.size(); i++) {
                            if (!results.get(i).equals(0.0)) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                } else {
                    if (results != null) {
                        for (int i = 0; i < results.size(); i++) {
                            double val = results.get(i);
                            double v = Math.abs((a * Math.pow(val, 2) + b * val - resultAttendu.get(0)) / (-resultAttendu.get(0)));
                            if (v >= tol) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
            }
            if (resultAttendu.size() == 2) {
                if (results != null && results.size() == 2) {
                    for (int i = 0; i < results.size(); i++) {
                        double val = results.get(i);
                        if (val != 0.0 && Math.abs((a * val - resultAttendu.get(1)) / resultAttendu.get(1)) >= tol) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
