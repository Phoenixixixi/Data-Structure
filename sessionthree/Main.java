package sessionthree;

public class Main {
    
    public static void main(String[] args){
        Kandang kambing = new Kandang();
        Hewan kucing = new Kucing("Anggora");
        Mobil toyota = new Mobil("avanza", 2018);



        kucing.bersuara();
        kambing.registKandang("kambing", 20);

        toyota.startEngine();
        toyota.infoMobil();

    }
}
