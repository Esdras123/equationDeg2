/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equationdeg2;

import java.util.ArrayList;

/**
 * @author ESDRAS
 */
public class EquationDeg2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
  
        ArrayList<DonneeTest> donneesTest = GenerationDonnee.getDonneesTest("scennarios.txt", GenerationDonnee.genererDonneesEntree(), 10e-6, "Solver", "Test");
        System.out.println(donneesTest);
        Class solverInterface = Class.forName("equationdeg2.Solver");
        SolverInterface solv = (SolverInterface) solverInterface.newInstance();
        
        for (int i=0; i<donneesTest.size(); i++){
            ArrayList<Double> results = solv.resolve(donneesTest.get(i).donneeEntree.a, donneesTest.get(i).donneeEntree.b, donneesTest.get(i).donneeEntree.c);
            boolean decision = Test.verify(donneesTest.get(i).donneeEntree, results, donneesTest.get(i).tolerance);
            System.out.println(donneesTest.get(i).toString() + " RO: " + results.toString() + "Oracle: " + decision);
        }

    }
}
