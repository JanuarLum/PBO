import java.util.Scanner;

public class LatihanFungsi {
    public static void main(String[] args){

        var userInput = new Scanner(System.in);

        System.out.print("panjang = ");
        int inputPanjang = userInput.nextInt();
        System.out.print("lebar = ");
        int inputLebar = userInput.nextInt();

        gambar(inputPanjang,inputLebar);

        System.out.println("luas = " + luas(inputPanjang,inputLebar));
        System.out.println("keliling = " + keliling(inputPanjang,inputLebar));

        tampilkanKelilingDanLuas(inputPanjang,inputLebar);
    }

    private static void tampilkanKelilingDanLuas(int pjg,int lbr){
        System.out.println("luas = " + luas(pjg,lbr));
        System.out.println("keliling = " + keliling(pjg,lbr));
    }

    private static int keliling(int pjg, int lbr){
        int hasil = (pjg + lbr) * 2;
        return hasil;
    }

    private static int luas(int pjg, int lbr){
        int hasil = pjg*lbr;
        return hasil;
    }

    private static void gambar(int pjg, int lbr){
        for(int i = 0; i < lbr; i++){
            for(int j = 0; j < pjg; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
