package sessionthree;

public class Mobil extends Kendaraan {
    public Mobil(String nama, int tahun){
        super(nama, tahun);
    }

    public void infoMobil(){
        System.out.print("mobil jenis : " + this.nama + " tahun : " + this.tahun);
    }


}
