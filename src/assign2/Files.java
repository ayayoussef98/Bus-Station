/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.nio.file.Files.write;
import static java.nio.file.Files.write;
import static java.nio.file.Files.write;
import java.util.ArrayList;
import java.util.Scanner;
import sun.applet.Main;
import java.lang.String;
import java.util.logging.Level;
import java.util.logging.Logger;

/**     ArrayList<Internal> internaltrips= new ArrayList<>();
 *
 */
public class Files {
      public ArrayList<Internal> intern = new ArrayList<>();
      public ArrayList<External > extern = new ArrayList<>();
       
       public static ArrayList<Internal> Readintern() throws FileNotFoundException
	{
           ArrayList<Internal> intern = new ArrayList<>();  
	   
           FileReader fr= new FileReader("internal.txt");
	   Scanner sc= new Scanner(fr);
        while(sc.hasNextLine())
        {
        
            String line= sc.nextLine(); 
        
            String Seperated[]=line.split(",");
            Internal inter= new Internal();
            inter.setNooftrip(Seperated[0]);
            inter.setCurrentloc(Seperated[1]);
            inter.setDestination(Seperated[2]);
            inter.setTraveldate(Seperated[3]);
            //inter.setReturndate(Seperated[3]);
            inter.setPrice(Double.parseDouble(Seperated[4]));
            inter.setDrivername(Seperated[5]);
            inter.setNoofavab(Integer.parseInt(Seperated[6]));
            inter.setNoofStops(Integer.parseInt(Seperated[7]));
            inter.setMethodoftrans(Seperated[8]);
             intern.add(inter);      
        }
           return intern;
}
       
       public ArrayList<External> Readextern() throws FileNotFoundException
	{
           ArrayList<External> extern = new ArrayList<>();  
	   
           FileReader fr= new FileReader("external.txt");
	   Scanner sc= new Scanner(fr);
        while(sc.hasNextLine())
        {
        
            String line= sc.nextLine(); 
            String Seperated[]=line.split(",");
            External exter= new External();

            exter.setNooftrip(Seperated[0]);
            exter.setCurrentloc(Seperated[1]);
            exter.setDestination(Seperated[2]);
            exter.setTraveldate(Seperated[3]);
            //exter.setReturndate(Seperated[3]);
            exter.setPrice(Double.parseDouble(Seperated[4]));
            exter.setDrivername(Seperated[5]);
            exter.setNoofavab(Integer.parseInt(Seperated[6]));
            exter.setNoofStops(Integer.parseInt(Seperated[7]));
            exter.setMethodoftrans(Seperated[8]);
             extern.add(exter);    
        }
           return extern;
}       
       public ArrayList<External> Appendextern(ArrayList<External> extern) throws IOException{
           File f= new File("external.txt");
          // ArrayList<External> extern= new ArrayList<>();
           FileWriter fw= new FileWriter(f);
           try (BufferedWriter bw = new BufferedWriter(fw)) {
              // for(External S: extern){
              for(int i=0;i<extern.size();i++){
               bw.write(extern.get(i).getNooftrip());
               bw.write(",");
               bw.write(extern.get(i).getCurrentloc());
               bw.write(",");
               bw.write(extern.get(i).getDestination());
               bw.write(",");
               //bw.write(S.getReturndate());
               //bw.write(",");
               bw.write(extern.get(i).getTraveldate());
               bw.write(",");
               bw.write(Double.toString(extern.get(i).getPrice()));
               bw.write(",");
               bw.write(extern.get(i).getDrivername());
               bw.write(",");
               bw.write(Integer.toString(extern.get(i).getNoofavab()));
               bw.write(",");
               bw.write(Integer.toString(extern.get(i).getNoofStops()));
               bw.write(",");
               bw.write(extern.get(i).getMethodoftrans());
             bw.newLine();
               }
           bw.close();           
       }
       return extern;
       }
       
               public void Addextern(External S) throws IOException{
           File f= new File("external.txt");
           FileWriter fw= new FileWriter(f,true);
           try (BufferedWriter bw = new BufferedWriter(fw)) {
             
               bw.write(S.getNooftrip());
               bw.write(",");
               bw.write(S.getCurrentloc());
               bw.write(",");
               bw.write(S.getDestination());
               bw.write(",");
               //bw.write(S.getReturndate());
               //bw.write(",");
               bw.write(S.getTraveldate());
               bw.write(",");
               bw.write(Double.toString( S.getPrice()));
               bw.write(",");
               bw.write(S.getDrivername());
               bw.write(",");
               bw.write(Integer.toString(S.getNoofavab()));
               bw.write(",");
               bw.write(Integer.toString(S.getNoofStops()));
               bw.write(",");
               bw.write(S.getMethodoftrans());
             bw.newLine();
               bw.close();           
       }}
       public ArrayList<Internal> Appendintern(ArrayList<Internal> intern) throws IOException{
           File f= new File("internal.txt");
          // ArrayList<External> extern= new ArrayList<>();
           FileWriter fw= new FileWriter(f);
           try (BufferedWriter bw = new BufferedWriter(fw)) {
              // for(External S: extern){
              for(int i=0;i<intern.size();i++){
               bw.write(intern.get(i).getNooftrip());
               bw.write(",");
               bw.write(intern.get(i).getCurrentloc());
               bw.write(",");
               bw.write(intern.get(i).getDestination());
               bw.write(",");
               //bw.write(S.getReturndate());
               //bw.write(",");
               bw.write(intern.get(i).getTraveldate());
               bw.write(",");
               bw.write(Double.toString(intern.get(i).getPrice()));
               bw.write(",");
               bw.write(intern.get(i).getDrivername());
               bw.write(",");
               bw.write(Integer.toString(intern.get(i).getNoofavab()));
               bw.write(",");
               bw.write(Integer.toString(intern.get(i).getNoofStops()));
               bw.write(",");
               bw.write(intern.get(i).getMethodoftrans());
             bw.newLine();
               }
           bw.close();           
       }
       return intern;
       
           
               }
       public void Appendcust(Customer C) throws IOException{
           File f= new File("customers.txt");
           FileWriter fw= new FileWriter(f,true);
           BufferedWriter bw= new BufferedWriter(fw);
       
           bw.write(C.getName());
           bw.write(",");
           bw.write(Integer.toString(C.getAge()));
           bw.write(",");
           bw.write(Integer.toString(C.getNoofBooked()));
           bw.write(",");
           bw.write(C.getCodet());
           bw.write(",");
           bw.write(Double.toString(C.getTprice()));
            bw.newLine();
           bw.close();
           
       }
               public void Addintern(Internal S) throws IOException{
           File f= new File("internal.txt");
           FileWriter fw= new FileWriter(f,true);
           try (BufferedWriter bw = new BufferedWriter(fw)) {
          
               bw.write(S.getNooftrip());
               bw.write(",");
               bw.write(S.getCurrentloc());
               bw.write(",");
               bw.write(S.getDestination());
               bw.write(",");
               //bw.write(S.getReturndate());
               //bw.write(",");
               bw.write(S.getTraveldate());
               bw.write(",");
               bw.write(Double.toString(S.getPrice()));
               bw.write(",");
               bw.write(S.getDrivername());
               bw.write(",");
               bw.write(Integer.toString(S.getNoofavab()));
               bw.write(",");
               bw.write(Integer.toString(S.getNoofStops()));
               bw.write(",");
               bw.write(S.getMethodoftrans());
             bw.newLine();
           bw.close();           
       }}


        

}


             
        
            
//ArrayList<Internal> interDisplay=new ArrayList<>();
//
//        public ArrayList<Internal> search(String s){
//            
//            for(int i=0;i<intern.size();i++ )
//            {
//                if(intern.get(i).contains(s));{
//                interDisplay.add(intern.get(i));
//            }
//            }
//               return interDisplay;
//                }

        
      //ublic static void main(String[] args) throws FileNotFoundException, IOException
       //
      //Files f =new Files();
         // ArrayList<Internal> s=f.Readintern();
//            for (Internal s1 : s) {
//                System.out.println("test");
//                System.out.println(s1.getDrivername());
//            f.Appendintern(s1);
//            }
         //tring als="Alexnadria";
           
         //rrayList<Internal> s=ArrayList<Internal> search(als);
          

            
       //

//    void Appendintern(ArrayList<Internal> intern) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//}        

        
        
      
