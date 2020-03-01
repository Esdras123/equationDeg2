package racine;

import equationdeg2.*;
import java.io.IOException;
import java.util.ArrayList;

public class Afficharge {

    public static String titre(String titre) {
        //	System.out.println(titre.length());
        String affiche = "";
        String debut = "**************************************************************************************************************\n";

        StringBuilder sb = new StringBuilder();
        sb.append(debut);
        sb.append("*");
        sb.append(espaces(debut.length() - 3));
        sb.append("*\n");
        sb.append("*");
        if (titre.length() % 2 == 0) {
            sb.append(espaces(debut.length() / 2 - titre.length() / 2 - 1));
        } else {
            sb.append(espaces(debut.length() / 2 - titre.length() / 2 - 2));
        }
        sb.append(titre);
        sb.append(espaces(debut.length() / 2 - titre.length() / 2 - 2));
        sb.append("*\n");
        sb.append("*");
        sb.append(espaces(debut.length() - 3));
        sb.append("*\n");
        sb.append(debut);
        affiche += sb.toString() + "\n";
        return affiche;

    }

    public static String espaces(int nombre) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nombre; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public static String creerLigne(String a, String tol, String ra, String ro, String oracle) {
        String affiche = "";
        StringBuilder sb = new StringBuilder();
        sb.append("| ");
        sb.append(a);
        sb.append(espaces(20- a.length()));

        sb.append("| ");
        sb.append(tol);
        sb.append(espaces(20 - tol.length()));

        sb.append("| ");
        sb.append(ra);
        sb.append(espaces(20 - ra.length()));

        sb.append("| ");
        sb.append(ro);
        sb.append(espaces(30 - ro.length()));

        sb.append("| ");
        sb.append(oracle);
        sb.append(espaces(8 - oracle.length()));

        affiche += sb.toString() + "|\n";
        affiche += separation();
        return affiche;
    }

    public static String separation() {

        String a = "+";
        for (int i = 1; i < 108; i++) {
            switch (i) {
                case 22:
                    a += "+";
                    break;
                case 44:
                    a += "+";
                    break;
                case 66:
                    a += "+";
                    break;
                case 98:
                    a += "+";
                    break;
                case 108:
                    a += "+";
                    break;
                default:
                    a += "-";

            }
        }

        return a + "+\n";
    }

}
