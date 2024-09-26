import java.util.Arrays;
import java.util.Random;

public class Zadanie1 {
    public static void zad() {
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(21) - 10;
        }
        System.out.println("Tablica: " + Arrays.toString(arr));
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Min: " + min + ", Max: " + max);
        double avg = Arrays.stream(arr).average().orElse(0);
        System.out.printf("Średnia: %.2f\n", avg);
        long wiecej = Arrays.stream(arr).filter(x -> x < avg).count();
        long mniej = Arrays.stream(arr).filter(x -> x > avg).count();
        System.out.println("Mniejszych od średniej: " + wiecej + ", Większych od średniej: " + mniej);
        System.out.print("Tablica w odwrotnej kolejności: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
