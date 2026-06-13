package sessionthree;

public class Kandang {

    public void registKandang(String jenis){
        System.out.println("Jenis hewan: " + jenis);
    }

    public void registKandang(String jenis, int jumlah){
        System.out.println("Jenis hewan: " + jenis);
        System.out.println("Jumlah: " + jumlah);
    }

    public void registKandang(String jenis, int jumlah, String lokasi){
        System.out.println("Jenis hewan: " + jenis);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Lokasi: " + lokasi);
    }
}