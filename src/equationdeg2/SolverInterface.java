/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equationdeg2;

import java.util.ArrayList;


public interface SolverInterface {
    /*renvoie :
    ****null dans le cas ou a=b=c=0
    **** liste  {0, -b} dans le cas ou a, b différents de 0 et c=0
    **** liste {-c} dans le cas ou tous c!=0
    *** liste {0} dans le cas ou a !=0 et b=c=0*/
    ArrayList<Double> resolve(double a, double b, double c);
}
