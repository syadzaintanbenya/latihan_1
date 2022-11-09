package tugas1;

public class VirtualDemo {
    public static void main(String []args) {
        
       
        Gaji s = new Gaji ("Wahyu", "KUBAR", 3, 500.00); 
       
    
        Pegawai e = new Gaji("ini nama", "Samarinda", 2,  2500.00);//upcasting karena dari class gaji akan mengakses method dari class pegawai
        
        
        System.out.println("Memanggil mailCheck Berdasarkan Refensi Gaji--");
        s.mailCheck();

        System.out.println("\nMemanggil mailCheck Berdasarkan Refensi Pegawai--");
        e.mailCheck();
    }
}

