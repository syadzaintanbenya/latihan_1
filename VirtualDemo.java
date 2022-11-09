public class VirtualDemo {
    public static void main(String []args) {
        Gaji s = new Gaji("Wahyu", "KUBAR", 3, 500.00);
        Pegawai e = new Gaji("ini nama", "Samarinda", 2, 2500.00);
        System.out.println("memanggil mailCheck berdasarkan refensi gaji--");

        e.mailCheck();
    }
}