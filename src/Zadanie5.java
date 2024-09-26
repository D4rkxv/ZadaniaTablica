import java.util.Scanner;
public class Zadanie5 {
    public static void ZU1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();
        String binaryString = String.format(Integer.toBinaryString(number));
        for(int i = 0; i < binaryString.length(); i++) {
            if(binaryString.charAt(i) == '1') {
                System.out.print('0');
            }else {
                System.out.print('1');
            }
        }
    }
    public static void ZU2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPodaj liczbe całkowitą: ");
        int number = scanner.nextInt();
        String binaryString = String.format(Integer.toBinaryString(number));

    }
}
