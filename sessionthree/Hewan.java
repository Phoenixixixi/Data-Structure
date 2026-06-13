package sessionthree;

public class Hewan {
    String nama;
    public Hewan(String nama){
        this.nama = nama;
    }

    public void bersuara(){
        System.out.println("Hewan Berbunyi");
    }

    

}


class Kucing extends Hewan{
    public Kucing(String nama){
        super(nama);
    }

    @Override
    public void bersuara(){
        System.out.println("Meowwwww");
    }
}
