package tugasjs11;
public class Keledai extends Binatang implements IHerbivora{
    protected String suara, warnaBulu;

    Keledai(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    public void displayMakan(){
        System.out.println("Jenis : Herbivora");
        System.out.println("Makanan : Tumbuhan");
    }
    public void displayBinatang(){
        System.out.println("Nama : " + getNama());
        System.out.println("Jumlah Kaki : " + getKaki());
    }
    public void displayData(){
        displayMakan();
        displayBinatang();
        System.out.println("Suara : " + this.suara);
        System.out.println("Warna Bulu : " + this.warnaBulu);
    }
}