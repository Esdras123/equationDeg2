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
public class DonneeTest {

    public String nomScenario; //nom du scénario
    public Params donneeEntree; //donnée d'entrée
    public String fonctionATester; //fonction à tester
    public String fonctionTest; //fonction de test
    public double tolerance; //tolerance
    public ArrayList<Double> resultatAttendu;
    
    public DonneeTest(String nomScenario, Params donneeEntree, String fonctionATester, String fonctionTest, double tolerance, ArrayList<Double> resultatAttendu) {
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
    
    public void genererResultat(){
        this.resultatAttendu = generer(donneeEntree.a, donneeEntree.b, donneeEntree.c);
    }
    
    private ArrayList<Double> generer(double a, double b, double c){
        ArrayList<Double> liste=new ArrayList();  
        
           if (a==0 && b==0 && c==0)
             {
               liste.add(null);
             }
           if (a!=0 && b==0 && c==0)
             {
               liste.add(0.0);
             }
           if (a!=0 && b!=0 && c==0)
             {
               liste.add(0.0);
               liste.add(((-1)*b));
             }
           if (a!=0 && b!=0 && c!=0)
             {
               liste.add(((-1)*c));
              
             }
             
           /* for(Object elem: liste)
             {
       	          System.out.println (elem);
             }
           */
             
        return liste;
    }
    
}
