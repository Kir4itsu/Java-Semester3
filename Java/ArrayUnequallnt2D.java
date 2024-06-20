public class ArrayUnequallnt2D {
    public static void main(String[] args) {
        // Langkah 1: Deklarasi variabel array dan penciptaan array
        int[][] int2DUnequalArr = new int[3][];
        int2DUnequalArr[0] = new int[1];
        int2DUnequalArr[1] = new int[2];
        int2DUnequalArr[2] = new int[3];
    //  int2DUnequalArr[3] = new int[4];     (Dihapus agar output nya benar)

        int k = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < int2DUnequalArr[i].length; j++) {
                int2DUnequalArr[i][j] = k++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < int2DUnequalArr[i].length; j++) {
                System.out.print(int2DUnequalArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
