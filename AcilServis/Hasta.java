import java.util.Scanner;


public class Hasta implements IAcilServis {

    private final int ortIshal;
    private final boolean basAgrisi;
    private final int atesi;
    private final double tansiyon;
    
    public Hasta(){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Hasta TC :");
        double tc=scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Baş ağrısı var mı?(evet/hayır):");
        String cevap=scanner.nextLine();
        if(cevap.equals("evet")){
            this.basAgrisi=true;
        }
        else{
            this.basAgrisi=false;
        }

        System.out.print("Hasta günde kaç kere tuvalete(ishal) çıkıyor?:");
        this.ortIshal=scanner.nextInt();
     
        System.out.print("Hastanın ateşi ne kadar?:");
        this.atesi=scanner.nextInt();
        
        System.out.print("Hastanın tansiyonu ne kadar?:");
        this.tansiyon=scanner.nextDouble();

        
    }
    
    @Override
    public boolean ishalDurumuKontrol() {
        if(this.ortIshal>6){
            System.out.println("Hastanın ishal durumu var.");
            return true;
        }
        else{
            System.out.println("Hasta ishal değil.");
            return false;
        }
    }

    @Override
    public boolean atesKontrol() {
        if(this.atesi>38){
            System.out.println("Hastada yüksek ateş mevcut!");
            return true;
        }
        else{
            System.out.println("Hastada ateşi normal.");
            return false;
        }
    }

    @Override
    public boolean tansiyonKontrol() {
        if(this.tansiyon>14.9){
            System.out.println("Hastada hipertansiyon mevcut!");
            return true;
        }
        else{
            System.out.println("Hastanın tansiyonu normal.");
            return false;
        }
    }
    
    
    @Override
    public boolean basAgrisiKontrol() {
        if(this.basAgrisi==true){
            System.out.println("Hastada baş ağrısı mevcut.");
            return true;
        }
        else{
            System.out.println("Hastada baş ağrısı yok.");
            return false;
        }
    }
}
