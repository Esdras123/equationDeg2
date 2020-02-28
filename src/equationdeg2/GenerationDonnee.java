/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equationdeg2;

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
    public static ArrayList<ArrayList<Double>> genererDonneesEntree() {
        ArrayList list1 = new ArrayList(Arrays.asList(0.0, 10e-7, -10e-6, 10e18, -10e14, Math.PI, (double) 55 / 12, 30.0));
        ArrayList list2 = new ArrayList(Arrays.asList(0.0, 10e-7, -10e-8, 10e25, -10e23, Math.exp(1), (double) 22 / 7, 97.0));
        ArrayList list3 = new ArrayList(Arrays.asList(0.0, 10e-13, -10e-9, 10e20, -10e-21, Math.sqrt(7), (double) 22 / 21, 143.0));
        ArrayList<ArrayList<Double>> list = new ArrayList<ArrayList<Double>>();

        list.add(list1);
        list.add(list2);
        list.add(list3);

        return list;
    }

    public static ArrayList<DonneeTest> getDonneesTest(String nomFichier, ArrayList<ArrayList<Double>> donnees, double tolerance, String fonctionAtester, String fonctionTest) {
        if (donnees.size() != 0) {
            ArrayList<DonneeTest> donneeTest = new ArrayList();
            FileSystem fs = FileSystems.getDefault();

            Path chemin = fs.getPath(System.getProperty("user.dir") + fs.getSeparator() + "src" + fs.getSeparator() + nomFichier);

            try {
                InputStream flux = new FileInputStream(chemin.toAbsolutePath().toString());
                InputStreamReader lecture = new InputStreamReader(flux);
                BufferedReader buff = new BufferedReader(lecture);
                String ligne;
                while ((ligne = buff.readLine()) != null) {
                    //System.out.println(ligne.length());

                    ArrayList<Double> params = new ArrayList<Double>();
                    int p = 2;
                    int k = 0;
                    //System.out.print("\n");
                    for (int i = 0; i < donnees.size(); i += 1) {
                        k = k + p;
                        double valeur = (double) donnees.get(i).get(((int) ligne.charAt(k) - 97));
                        params.add(valeur);
                        p = 3;

                    }

                    Params pa = new Params();
                    pa.a = params.get(0);
                    pa.b = params.get(1);
                    pa.c = params.get(2);
                    DonneeTest donneTest = new DonneeTest("nomScenario", pa, fonctionAtester, fonctionTest, tolerance);
                    donneeTest.add(donneTest);

                }
                buff.close();
                return donneeTest;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }

        } else {
            return null;
        }

    }
}
