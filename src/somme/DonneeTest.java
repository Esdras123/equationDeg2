/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somme;

import racine.*;

/**
 *
 * @author ESDRAS
 */
public class DonneeTest {

    public String nomScenario; //nom du scénario
    public Params donneeEntree; //donnée d'entrée
    public String fonctionATester; //fonction à tester
    public String fonctionTest; //fonction de test
    public double tolerance; //tolerance
    public Double resultatAttendu;

    public DonneeTest(String nomScenario, Params donneeEntree, String fonctionATester, String fonctionTest, double tolerance, Double resultatAttendu) {
        this.nomScenario = nomScenario;
        this.donneeEntree = donneeEntree;
        this.fonctionATester = fonctionATester;
        this.fonctionTest = fonctionTest;
        this.tolerance = tolerance;
        this.resultatAttendu = resultatAttendu;
    }

    public DonneeTest(String nomScenario, Params donneeEntree, String fonctionATester, String fonctionTest, double tolerance) {
        this.nomScenario = nomScenario;
        this.donneeEntree = donneeEntree;
        this.fonctionATester = fonctionATester;
        this.fonctionTest = fonctionTest;
        this.tolerance = tolerance;

        this.genererResultat();

    }

    public void genererResultat() {
        this.resultatAttendu = donneeEntree.y;
    }

    @Override
    public String toString() {
        String chaine = donneeEntree.toString() + "   " + " RA: ";
        if (resultatAttendu == null) {
            return chaine + "null";
        }

        return chaine + resultatAttendu.toString();
    }
}
