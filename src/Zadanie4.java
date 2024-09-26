import java.util.Scanner;
public class Zadanie4 {
    public static void zad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();
        String binaryString = String.format(Integer.toBinaryString(number));
        if(number <= 0){
            System.out.println("Liczba binarnie: " + "1." + binaryString);
        }else{
            System.out.println("Liczba binarnie: " + "0." + binaryString);
        }
    }
}
