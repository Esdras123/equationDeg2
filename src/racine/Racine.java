/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racine;

import java.util.ArrayList;

/**
 *
 * @author ESDRAS
 */
public class Racine {
    public static void main(String... args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        System.out.println(Afficharge.titre("Donnees de test pour la recherche de la racine de x"));
        ArrayList<DonneeTest> donneesTest = GenerationDonnee.genererDonneesEntree(1e-8);

        Class solverInterface = Class.forName("racine.Solver");
        SolverInterface solv = (SolverInterface) solverInterface.newInstance();
        int total = 0, totFalse = 0;
        
        System.out.println(Afficharge.separation());
        System.out.println(Afficharge.creerLigne("x", "Tolérance", "Résultat attendu", "Résultat obtenu", "Oracle"));
        for (int i = 0; i < donneesTest.size(); i++) {
            Double results = solv.resolve(donneesTest.get(i).donneeEntree.x);
            boolean decision = Test.verify(results, donneesTest.get(i).resultatAttendu, donneesTest.get(i).tolerance);
            String ra = "null", ro = "null";
            if(donneesTest.get(i).resultatAttendu != null)
                ra = donneesTest.get(i).resultatAttendu.toString();
            if (results!= null)
                ro = results.toString();
            
            System.out.println(Afficharge.creerLigne(Double.toString(donneesTest.get(i).donneeEntree.x), Double.toString(donneesTest.get(0).tolerance), ra, ro, Boolean.toString(decision)));
            if (!decision) {
                totFalse += 1;
            }
            total += 1;

        }

        System.out.println(Afficharge.titre("Total Tests Ratés: " + totFalse + "/" + " " + total + "             Total Tests Réussis: " + (total - totFalse) + "/" + " " + total));

    }
}
