/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equationdeg2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ESDRAS
 */
public class EquationDeg2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader buffer = null;
        String ligne;
        String[] tab = new String[3];
        Double[] val = new Double[3];
        try {
            buffer = new BufferedReader(new FileReader(args[0]));
            while ((ligne = buffer.readLine() != null)) {
                tab = ligne.split(" ");
                for(int i=0; i < tab.length; i++){
                    val[i] = Double.valueOf(tab[i]);
                }
                System.out.println();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EquationDeg2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EquationDeg2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static testEquation(double a, double b,){
        
    }
    
}
