import java.util.Arrays;
import java.util.Random;
public class Zadanie2 {
    public static void zad() {
        Random rnd = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10) + 1;
        }
        System.out.println("Tablica: " + Arrays.toString(arr));
        int[] counts = new int[10];
        for (int number : arr) {
            counts[number - 1]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println((i + 1) + ": " + counts[i] + " razy");
        }
    }
}
