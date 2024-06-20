public class Multidimensi {
    public static void main(String[] args) {
        // Langkah 1: deklarasi variabel array dan penciptaan array
        int[][] int2DArr = new int[4][5];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                int2DArr[i][j] = k++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(int2DArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
