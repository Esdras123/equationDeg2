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

        Class solverInterface = Class.forName("equationdeg2.Solver");
        SolverInterface solv = (SolverInterface) solverInterface.newInstance();
        int total = 0, totFalse = 0;
        System.out.println("Tolérance:  " + donneesTest.get(0).tolerance);
        for (int i=0; i<donneesTest.size(); i++){
            ArrayList<Double> results = solv.resolve(donneesTest.get(i).donneeEntree.a, donneesTest.get(i).donneeEntree.b, donneesTest.get(i).donneeEntree.c);
            boolean decision = Test.verify(donneesTest.get(i).donneeEntree, results, donneesTest.get(i).resultatAttendu, donneesTest.get(i).tolerance);
            System.out.println(donneesTest.get(i).toString() + " RO: " + results.toString() + " Oracle: " + decision);
            System.out.println("\n");
            if (!decision)
                totFalse += 1;
            total += 1;
        }
        System.out.println("\n\nTotal Tests Ratés: "+totFalse+"/"+" "+total);
        System.out.println("Total Tests Réussis: "+(total - totFalse)+"/"+" "+total);

    }
}
