package sessionone;

public class Main {
    
    public static void main(String[] args){
        Kandang kambing = new Kandang();
        Hewan kucing = new Kucing("Anggora");



        kucing.bersuara();
        kambing.registKandang("kambing", 20);

    }
}
