import java.util.Scanner;
import java.lang.String;

public class RekursifBercabang {
    public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Input nilai n = ");
        int nilai = userInput.nextInt();
        int nilai_fibonacci = fibonacci(nilai, "atas");
        System.out.println("Nilai fibonacci ke-" + nilai + " adalah " + nilai_fibonacci);
    }


    private static int fibonacci(int n, String cabang){
        System.out.println("Cabang " + cabang);
        System.out.println("Fibonacci ke - " + n);
        if (n == 1 || n == 0){
            return n;
        }
        else {
            return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
        }
    }
}