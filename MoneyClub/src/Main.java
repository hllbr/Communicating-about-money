
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scn = new Scanner(System.in);

        String islemler = "1)Sanal ürün tanımlama\n"
                + "w) ile sanal para önerileri\n"
                + "2)Real ürün tanımlama\n"
                + "d) ile real para önerileri\n"
                + "5)Çıkış için q'ya basınız\n"
                + "6) işlemleri tekrar görüntülemek";
        while(true){
            System.out.println(islemler);
            System.out.println("Yapmak istediğiniz işlemi seçiniz :");
            String islem = scn.nextLine();
            
            if(islem.equals("1")){
                System.out.println("Paranızın yükselme trendi yakalayacağını düşünüyorsanız (true) yazınız");
                boolean yukselme_trendi = scn.nextBoolean();
                System.out.println("Paranız sınırsız bir üretim hacmine mi sahip(true or false)");
                boolean sınırsızmı_cevap = scn.nextBoolean();
                scn.nextLine();
                System.out.println("Üretici ülkenin adını yazınız :");
                String üretici = scn.nextLine();
                System.out.println("Sanal paranızın adını yazınız");
                String urun = scn.nextLine();
                
                Sanal_Money sanal_Money = new Sanal_Money(urun, yukselme_trendi, üretici, sınırsızmı_cevap); 
                /*System.out.println("Tanımladığınız ürünle ilgili bilgi almak için lütfen w tuşuna basınız");
                System.out.println("öneriler almak istemiyorsanız herhangi bir tuşlama yapabilirsiniz.");
                /String islem2 = scn.nextLine();*/
                while(true){
                    System.out.println("Tanımladığınız ürünle ilgili bilgi almak için lütfen w tuşuna basınız");
                    System.out.println("öneriler almak istemiyorsanız herhangi bir tuşlama yapabilirsiniz.");
                     String islem2 = scn.nextLine();
                     if(islem2.equals("w")){
                    sanal_Money.SınırSorusu(sınırsızmı_cevap);
                    sanal_Money.yükselme_tr(yukselme_trendi);
                    sanal_Money.oneri();
                    
                }else{
                    System.out.println("öneri işlemlerinden çıkılıyor Lütfen bekleyiniz.");
                    Thread.sleep(3000);
                    break;
                }}
            }else if(islem.equals("2")){
                System.out.println("Paranızın yükselme trendi yakalayacağını düşünüyorsanız (true) yazınız");
                boolean yukselme_trendi1 = scn.nextBoolean();
                System.out.println("Paranız sınırsız bir üretim hacmine mi sahip(true or false)");
                boolean sınırsızmı_cevap1 = scn.nextBoolean();
                scn.nextLine();
                System.out.println("Üretici ülkenin adını yazınız :");
                String üretici1 = scn.nextLine();
                System.out.println("Sanal paranızın adını yazınız");
                String urun1 = scn.nextLine();
                Gercek_Money gercek_Money = new Gercek_Money(urun1, yukselme_trendi1, üretici1, sınırsızmı_cevap1);
               /* System.out.println("Tanımladığınız ürünle ilgili bilgi almak için lütfen d tuşuna basınız");
                System.out.println("öneriler almak istemiyorsanız herhangi bir tuşlama yapabilirsiniz.");
                String islem2 = scn.nextLine();*/
                while(true){
                    System.out.println("Tanımladığınız ürünle ilgili bilgi almak için lütfen d tuşuna basınız");
                    System.out.println("öneriler almak istemiyorsanız herhangi bir tuşlama yapabilirsiniz.");
                    String islem2 = scn.nextLine();
                     if(islem2.equals("d")){
                    gercek_Money.SınırSorusu(sınırsızmı_cevap1);
                    gercek_Money.yükselme_tr(yukselme_trendi1);
                    gercek_Money.oneri();
                   // break;
                }else{
                         System.out.println("öneri işlemlerinden çıkılıyor Lütfen bekleyiniz.");
                         Thread.sleep(3000);
                          break;
                     }}
            }else if(islem.equals("q")){
                System.out.println("İşlemler Sonlandılıyor");
                Thread.sleep(3000);
                System.out.println("işlemler sonlandırıldı iyi günler");
                break;
        }else if(islem.equals("6")){
            System.out.println("********************************************************************");
            System.out.println(islemler);
            System.out.println("********************************************************************");
        }
        }
    }
}
