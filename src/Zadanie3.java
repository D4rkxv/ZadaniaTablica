import java.util.Random;
public class Zadanie3 {
    public static void zad() {
        Random random = new Random();
        int[][] mother = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mother[i][j] = random.nextInt(11) - 5;
            }
        }
        System.out.println("Macierz:");
        for (int[] row : mother) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
        for (int col = 0; col < 5; col++) {
            int min = 10;
            int max = -10;
            for (int row = 0; row < 5; row++) {
                if (mother[row][col] < min) {
                    min = mother[row][col];
                }
                if (mother[row][col] > max) {
                    max = mother[row][col];
                }
            }
            System.out.println("Kolumna " + (col + 1) + " - Min: " + min + ", Max: " + max);
        }
    }
}
