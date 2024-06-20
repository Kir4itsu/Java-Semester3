public class Inisialisasi {

    public static void main(String[] args) {
        // Deklarasi dan inisialisasi
        double[][] aDoubleMat = new double[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                aDoubleMat[i][j] = i * j * 1.0;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(aDoubleMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
