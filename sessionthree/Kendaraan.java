package sessionthree;

public class Kendaraan {
    String nama;
    int tahun;
    public Kendaraan(String nama, int tahun){
        this.nama = nama;
        this.tahun = tahun;
    }

    public void startEngine(){
        System.out.println("Starting Engine");
    }

}
