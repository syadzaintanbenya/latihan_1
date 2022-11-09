package tugas1;

//class pegawai mewariskan sifat ke class Gaji
//Polymorphisme(memiliki banyak bentuk)

//downcasting karena class pegfawai diturunkamn ke class gaji
public class Gaji extends Pegawai {
    private double salary; // gaji tahunan
    public Gaji (String name, String address, int number, double 
    salary ) {
        super (name, address, number);
        setSalary (salary);
    }

  /* Polymorphisme upcasting karena ada hubungan antara subclass dengan superclass
  yang nantinya hasil dari outputnya berbeda dengan inputannya dari class gaji dengan class pegawai(superclass) */
public void mailCheck(){ 
    System.out.println("Memeriksa Kelas Gaji dalam Surat");
    System.out.println("Surat Tertuju untuk " + getName () + "dengan Gaji" +  salary);
}
public double getSalary (){
    return salary;
}
public void setSalary (double newSalary){
    if (newSalary >= 0.0) {
        salary = newSalary;
    }
}
public double computePay(){
    System.out.println("Menghitung Pembayaran Gaji Untuk " + getName());
    return salary/52;
  }

}
