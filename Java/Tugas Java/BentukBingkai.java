public class BentukBingkai {
    public static void main(String[] args) {
        // Variabel bertipe data string Nama dan Nim
        String Nama = "Robert Baz Kiyosaki";
		 String NIM = "221552018154075";
		 
         // Menampilkan Variabel nama dan nim dulu
		 System.out.println("\nNama: " + Nama);
		 System.out.println("NIM : " + NIM + "\n\n");
		 
         // Menampilkan penjelasan Bentuk Frame Persegi
		 System.out.println("Bentuk Frame Persegi\n");
		 
         // Buat perulangan bertingkat buat pola bintang
        // Perulangan luar i buat baris, perulangan dalam j buat kolom
            for(int i = 1; i <= 9; i++) {
                for(int j = 1; j <= 9; j++){
				 // Kondisi buat cetak "*" 
                 if((i == 1 || i == 9) || (i == 9 || i == 9)) {
                    System.out.print("*");
	                 // Kondisi buat baris kosong     
                    } else if(i == 2 || i == 4 || i == 6 || i == 8) {
                    System.out.print("");
	                 // Kondisi cetak "*" di tengah  
                    } else if((i == 3 || i == 5 || i == 7) && (j == 1 || j == 9)) {
                    System.out.print("*");
               
                // Yang lain cetak spasi
                } else {
                    System.out.print(" ");
                }
            }
          
            // Ganti baris setiap perulangan luar selesai
            System.out.println();
        }
		 
		 // Menampilkan penjelasan Bentuk Frame Layangan
		 System.out.println("\n\nBentuk Frame Layangan\n");
		 
         // Logika perulangan sama kaya frame persegi
            // Cuma ukuran sama pola bintang beda
		 for (int i = 1; i <= 11; i++) {
			 for (int j = 1; j <= 11; j++) {
				 if((i == 1 || i == 11) && j == 6) {
					 System.out.print("*");
					 } else if ((i == 2 || i == 10) && (j == 5 || j == 6 || j == 7)) {
	                 System.out.print("*");
	                 } else if ((i == 3 || i == 9) && (j == 4 || j == 5 || j == 6 || j == 7 || j == 8)) {
	                 System.out.print("*");
	                 } else if ((i == 4 || i == 8) && (j != 1 && j != 2 && j != 10 && j != 11)) {
	                 System.out.print("*");
	                 } else if ((i == 5 || i == 7) && (j != 1 && j != 11)) {
	                 System.out.print("*");
	                 } else if (i == 6) {
	                 System.out.print("*");
	                 } else System.out.print(" ");
				 }
			 System.out.println();
			 }
		 
		 // Menampilkan penjelasan Bentuk Frame Full Persegi
		 System.out.println("\n\nBentuk Frame Full Persegi\n");
		 // Deklarasi variabel
		 int a = 4;;
		 int b = 6;
		 
         // Cetak persegi bintang tinggi "a" dan lebar "b" 
		 for (int c = 1; c < a; c++) {
			 for(int d = 1; d < b; d++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
    }
}
