/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racine;

import equationdeg2.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ESDRAS
 */
public class GenerationDonnee {

    /*generer les valeurs données pour chaque */
    public static ArrayList<DonneeTest> genererDonneesEntree(Double tolerance) {
        ArrayList list1 = new ArrayList(Arrays.asList(0.0, 10e-7, -10e-6, 10e40, -10e14, Math.PI, (double) 55 / 12, 30.0));
        
        ArrayList<DonneeTest> donneeTest = new ArrayList();
        
        for(int i=0; i<list1.size();i++){
            DonneeTest donneTest = new DonneeTest("nomScenario", new Params((double)list1.get(i)), "fonctionAtester", "fonctionTest", tolerance);
            donneeTest.add(donneTest);
        }
        return donneeTest;
    }
}
