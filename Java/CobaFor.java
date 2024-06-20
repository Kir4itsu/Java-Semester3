import java.util.ArrayList;
import java.util.Iterator;

public class CobaFor {
       public static void main(String[] args) { 
           String[] namaOrang = {"Budi", "Andri", "Ujang", "Dadang", "Rudi", "Joni" };
       System.out.println("Isi Array: ");
       // Iterate over array
       for (String nama: namaOrang) { 
           System.out.println(nama);
       }

       ArrayList<String> namaOrangCollection = new ArrayList<String>();
       namaOrangCollection.add("AndriCol");
       namaOrangCollection.add("BudiCel");
       namaOrangCollection.add("UjangCol"); 
       namaOrangCollection.add("DadangCol");

       System.out.println("\nIsi Collection: "); 
       // Iterate over collection
       for (String nama : namaOrangCollection) {
           System.out.println(nama);
       }

       System.out.println("\nCara lain (iterate over iterator):");
       // Iterate over iterator (pakai 3 parameter)
       for (Iterator<String> iterator = namaOrangCollection.iterator();
       iterator.hasNext(); ) {
       String string = (String) iterator.next();
       System.out.println(string);
       }
   }
}