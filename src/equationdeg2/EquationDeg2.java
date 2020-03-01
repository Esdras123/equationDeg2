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
		System.out.println(Afficharge.titre("Donnees de test pour la résolution de l'�qution aX^2+bX+c=0"));
        ArrayList<DonneeTest> donneesTest = GenerationDonnee.getDonneesTest("scennarios.txt", GenerationDonnee.genererDonneesEntree(), 10e-6, "Solver", "Test");

        Class solverInterface = Class.forName("equationdeg2.Solver");
        SolverInterface solv = (SolverInterface) solverInterface.newInstance();
        int total = 0, totFalse = 0;
       
        System.out.println( Afficharge.separation());
        System.out.println(Afficharge.creerLigne("a", "b", "c", "Tolérance", "Résultat attendu", "Résultat obtenu", "Oracle"));
        for (int i=0; i<donneesTest.size(); i++){
            ArrayList<Double> results = solv.resolve(donneesTest.get(i).donneeEntree.a, donneesTest.get(i).donneeEntree.b, donneesTest.get(i).donneeEntree.c);
            boolean decision = Test.verify(donneesTest.get(i).donneeEntree, results, donneesTest.get(i).resultatAttendu, donneesTest.get(i).tolerance);
          
           System.out.println(Afficharge.creerLigne( Double.toString(donneesTest.get(i).donneeEntree.a), Double.toString(donneesTest.get(i).donneeEntree.b),Double.toString(donneesTest.get(i).donneeEntree.c) ,Double.toString(donneesTest.get(0).tolerance) , donneesTest.get(i).resultatAttendu.toString(), results.toString(), Boolean.toString(decision)));
            if (!decision)
                totFalse += 1;
            total += 1;
           
        }
        
    	System.out.println(Afficharge.titre("Total Tests Ratés: "+totFalse+"/"+" "+total + "             Total Tests Réussis: "+(total - totFalse)+"/"+" "+total));
        

    }
}
