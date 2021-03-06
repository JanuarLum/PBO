interface TugasMahasiswa {
    void Kuliah();
    void BelajarMandiri();
    void MengembangkanDiri();
}

class Mahasiswa implements TugasMahasiswa {
    public Mahasiswa() {
        System.out.println("Tugas mahasiswa adalah : ");
    }

    @Override
    public void Kuliah() {
        System.out.println("1. Kuliah tepat waktu");
    }

    @Override
    public void BelajarMandiri() {
        System.out.println("2. Belajar Mandiri, rajin membaca");
    }

    @Override
    public void MengembangkanDiri() {
        System.out.println("3. Mengembangkan diri melalui pelatihan dan komunitas");
    }
}

public class Interface {
    public static void main(String[] args) {
        Mahasiswa Iky = new Mahasiswa();

        Iky.Kuliah();
        Iky.BelajarMandiri();
        Iky.MengembangkanDiri();
    }
}
