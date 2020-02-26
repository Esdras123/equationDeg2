/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equationdeg2;

/**
 *
 * @author ESDRAS
 */
public class Test {
    public static boolean testMethode(DonneeTest donneeT){
        Solver solverInterface = (SolverInterface) Class.forName(donneeT.fonctionATester);
    }
}
