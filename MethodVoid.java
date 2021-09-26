public class MethodVoid {
    public static void main(String[] args) {
        System.out.println(simpel());
        fungso("test");
        SelamatSore("kakak");
    }
    private static void SelamatSore(String nama){
        System.out.println("Selamat Sore " + nama);
    }
    private static void fungso(String input) {
        System.out.println(input);
    }
    private static float simpel() {
        return 10.0f;
    }
}
