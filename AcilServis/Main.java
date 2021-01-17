public class Main {
    public static void main(String[] args) throws InterruptedException{
        
        System.out.println("******Özel Miğferler Hastanelerine Hoşgeldiniz******\n");
        
        String Covid_19_Belirtileri="Covid-19 Belirtileri :\n"
                                   +"1-Yüksek Ateş\n"
                                   +"2-İshal Olma\n"
                                   +"3-Şiddetli Baş Ağrısı";
                               
        String mesaj="Herhangi acil bir durum gözlenmemiştir.Evinize gidebilirsiniz.SAĞLIKLI GÜNLER DİLERİZ:)";
        
        while(true){
            System.out.println("*********************************************");
            System.out.println(Covid_19_Belirtileri);
            System.out.println("*********************************************\n\n");
            
            Hasta hasta=new Hasta();
            
            System.out.println("Hasta ishal durumu kontrol ediliyor...");
            Thread.sleep(3000);
            if(hasta.ishalDurumuKontrol()==false){
                System.out.println(mesaj);
                continue;
            }
            
            System.out.println("Hastanın ateşi kontrol ediliyor...");
            Thread.sleep(3000);
            if(hasta.atesKontrol()==false){
                System.out.println(mesaj);
                continue;
            }
            
            System.out.println("Hastanın tansiyonu kontrol ediliyor...");
            Thread.sleep(3000);
            if(hasta.tansiyonKontrol()==false){
                System.out.println(mesaj);
                continue;
            }
            
            System.out.println("Hasta baş ağrısı durumu kontrol ediliyor...");
            Thread.sleep(3000);
            if(hasta.basAgrisiKontrol()==false){
                System.out.println(mesaj);
                continue;
            }

            System.out.println("Şüpheli durumlar tespit edilmiştir.Covid-19 'a karşı test yapılsın!!!");
            break;
        }
    }
}
