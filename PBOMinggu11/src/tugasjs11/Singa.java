package tugasjs11;
public class Singa extends Binatang implements IKarnivora{
    protected String suara, warnaBulu;

    Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    public void displayMakan(){
        System.out.println("Jenis : Karnivora");
        System.out.println("Makanan : Daging");
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