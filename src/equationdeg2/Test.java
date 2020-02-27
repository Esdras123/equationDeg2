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

/**
 *
 * @author ESDRAS
 */
public class Test {
    public static boolean testMethode(DonneeTest donneeT){
        //Solver solverInterface = (SolverInterface) Class.forName(donneeT.fonctionATester);
	/*
    public static boolean testMethode(DonneeTest donneeT){
        Solver solverInterface = (SolverInterface) Class.forName(donneeT.fonctionATester);
    */
        return false;
    }
    public ArrayList<DonneeTest> getDonneesTest(String nomFichier,ArrayList<ArrayList<Double>> donnees, double tolerance,String fonctionAtester, String fonctionTest ){
    	if(donnees.size()!=0) {
    		ArrayList<DonneeTest> donneeTest = new ArrayList();
    		FileSystem fs = FileSystems.getDefault();
    		
   		 
   		 Path chemin = fs.getPath(System.getProperty("user.dir" )+ fs.getSeparator() + "src"+ fs.getSeparator() + nomFichier);
   		 
   		try{
   			InputStream flux=new FileInputStream(chemin.toAbsolutePath().toString()); 
   			InputStreamReader lecture=new InputStreamReader(flux);
   			BufferedReader buff=new BufferedReader(lecture);
   			String ligne;
   			while ((ligne=buff.readLine())!=null){
   				ArrayList<Double> params = new ArrayList<Double>();
   				int p=2;
   				int k=0;
   				System.out.print("\n");
   				for( int i=0;i<donnees.get(0).size();i+=1) {
   					k=k+p;
   					double valeur = donnees.get(((int)ligne.charAt(k)-97)).get(i);
   					params.add(valeur);
   					p=3;	
   				}
   				
   				Params pa = new Params();
   				pa.a=params.get(0);
   				pa.b=params.get(1);
   				pa.c=params.get(2);
   				DonneeTest donneTest = new DonneeTest("nomScenario", pa,  fonctionAtester, fonctionTest, tolerance, null);
   				donneeTest.add(donneTest);
   				
   			}
   			buff.close(); 
   			return donneeTest;
   			}		
   			catch (Exception e){
   			System.out.println(e.toString());
   			return null;
   			}
       	
    	}else {
    		return null;
    	}
		
    }
}
