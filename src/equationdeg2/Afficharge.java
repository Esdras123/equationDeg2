package equationdeg2;

import java.io.IOException;
import java.util.ArrayList;

public class Afficharge {

public static void main(String[] args) throws IOException {
		
		
		
		String debut="*******************************************************************************************************************************\n";
		System.out.println(titre("Donnees de test pour le r�solution de l'�qution aX^2+bX+c=0"));
		System.out.print(separation());
		System.out.print(creerLigne("0225","Chambre","11454848884","4444444444444444","788881547","0255488","true"));
		System.out.print(creerLigne("Chambre","INDEX","","","","",""));
		System.out.print(creerLigne("Chambre","INDEX","","","","",""));
		System.out.print(creerLigne("Chambre","INDEX","","","","",""));
		System.out.print(creerLigne("Chambre","INDEX","","","","",""));
		System.out.print(creerLigne("Chambre","INDEX","","","","",""));
		
	}
	
	
	public static String titre(String titre) {
	//	System.out.println(titre.length());
		String affiche="";
			String debut="*************************************************************************************************************************************************************************************************************************\n";
		
		   StringBuilder sb = new StringBuilder();
		   sb.append(debut);
		   sb.append("*");
		   sb.append(espaces(debut.length()-3));
		   sb.append("*\n");
		   sb.append("*");
		  if(titre.length()%2==0) {
			  sb.append(espaces(debut.length()/2-titre.length()/2-1));
		  }else {
			  sb.append(espaces(debut.length()/2-titre.length()/2-2));
		  }
		   sb.append(titre);
		   sb.append(espaces(debut.length()/2-titre.length()/2-2));
		   sb.append("*\n");
		   sb.append("*");
		   sb.append(espaces(debut.length()-3));
		   sb.append("*\n");
		   sb.append(debut);
		   affiche+=sb.toString()+"\n";
		   return affiche;
		
		
	}
	
	public static String espaces(int nombre){
		   StringBuilder sb = new StringBuilder();
		   for(int i=0; i<nombre; i++){
		      sb.append(" ");
		   }
		   return sb.toString();
		}

		public static String creerLigne(String a,String b, String c, String tol, String ra, String ro, String oracle){
			String affiche="";
		   StringBuilder sb = new StringBuilder();
		   sb.append("| ");
		   sb.append(a);
		   sb.append(espaces(26-a.length()));
		   
		   sb.append("| ");
		   sb.append(b);
		   sb.append(espaces(26-b.length()));
		 
		   sb.append("| ");
		   sb.append(c);
		   sb.append(espaces(26-c.length()));
		   
		   sb.append("| ");
		   sb.append(tol);
		   sb.append(espaces(20-tol.length()));
		   
		   sb.append("| ");
		   sb.append(ra);
		   sb.append(espaces(50-ra.length()));
		   
		   sb.append("| ");
		   sb.append(ro);
		   sb.append(espaces(50-ro.length()));
		   
		   sb.append("| ");
		   sb.append(oracle);
		   sb.append(espaces(8-oracle.length()));
		  
		   affiche+=sb.toString()+"|\n";
		   affiche+=separation();
		   return affiche;
		}
		public static String separation() {
			
			String a="+";
			for(int i=1 ;i<220;i++) {
				switch(i) {
				case 28: a+="+";
				break;
				case 56: a+="+";
				break;
				case 84: a+="+";
				break;
				case 106: a+="+";
				break;
				case 158: a+="+";
				break;
				case 210: a+="+";
				break;
				default: a+="-";
				
				}	
			}
			
		return a+"+\n";
		}
		
}
