package tugas1;

public class Pegawai {

    private String name;
    private String address;
    private int number;
    public Pegawai (String name, String address, int number) {
      System.out.println("Menyusun Pegawai");/* kenapa ini akan muncul dua kali saat di run, karena di class pegawai ini akan diturunkan/extends 
      atau diwariskan ke class gaji, maka class pegawai ini akan tetap ikut diakses dikelas gaji */
      this.name = name;
      this.address = address;
      this.number = number;
  }  
  public void mailCheck () { //Polymorphisme atau memiliki input sama dengan output yang berbeda dengan class gaji
      System.out.println(" Memeriksa surat untuk" + this.name + "" + this.address);
  }
  public String toString () {
      return name + "" + address + "" + number;
  }
  public String getName (){
      return name;
  }
  public String getAddress (){
      return address;
  }
  public void setAddress (String newAddress){
      address = newAddress;
  }
  public int getNumber(){
      return number;
  }
}
