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

    public static boolean verify(Params donnee, ArrayList<Double> results, double tol) {
        double a = donnee.a, b = donnee.b, c = donnee.c;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return results == null;
                } else {
                    return results == new ArrayList<Double>();
                }
            } else {
                if (c == 0) {
                    if (results != null && results.size() == 1) {
                        return results.get(0).equals(0.0);
                    } else {
                        return false;
                    }
                } else {
                    if (results != null && results.size() == 1) {
                        return Math.abs((b * results.get(0) + c) / c) < tol;
                    } else {
                        return false;
                    }
                }
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta >= 0) {
                if (c != 0) {
                    if (results != null && results.size() >= 1) {
                        for (int i = 0; i < results.size(); i++) {
                            if (Math.abs((a * Math.pow(results.get(i), 2) + b * results.get(i) + c) / c) >= tol) {
                                return false;
                            }
                        }
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    if (results != null && results.size() >= 1) {
                        if (b != 0) {
                            for (int i = 0; i < results.size(); i++) {
                                if (!results.get(i).equals(0.0) && Math.abs((a * results.get(i) + b) / b) >= tol) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        else{
                            for (int i = 0; i < results.size(); i++) {
                                if (!results.get(i).equals(0.0)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            }
            else{
                return results != null && results.isEmpty();
            }
        }
    }
}
