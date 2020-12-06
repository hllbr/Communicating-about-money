
public class Sanal_Money extends SanalPara{

    public Sanal_Money(String para_adı, boolean yükselme_trendi, String üretici_ülke, boolean sınırsızmı) {
        super(para_adı, yükselme_trendi, üretici_ülke, sınırsızmı);
    }

    @Override
    public void oneri() {
        //System.out.println(getPara_adı()+" adlı para birimi "+" yükselme trendindedir.");
        System.out.println(getPara_adı()+" üreticisi olan üke ise " +getÜretici_ülke() +" dir./dır.");
    }public void SınırSorusu(Boolean sınır){
        if(sınır == false){
            System.out.println("Paranız sınırsız üretime sahip olduğu için sürekli dalgalanmalara ve manipülasyonlara maruz kalacaktır.");
        }else{
            System.out.println("Paranızın sınırlı üretimi paranızın değerini uzun ve orta vadede korumasına ve durdurulamaz bir değerlenmeyle karşı karşıya olduğunun garantsidir.");
        }
    }public void yükselme_tr(Boolean trend){
        if(trend == true){
            System.out.println("yükselme trendleri aldatıcı olabilir");
            System.out.println("real paralar için geçerli olan birkez gördüğü noktayı unutmaz sözü sanal paralar için henüz kanıtlanmamıştır.");
            System.out.println("Dikkatli olmanız dileğiyle bol Kazanclar");
        }else{
            System.out.println("hiçbir eşya veya para sonsuza kadar değer kaybetmez deep pick adı verilen noktaya ulaşan her eşya veya para deep top noktayı mutlaka görür.");
            System.out.println("param değer kaybetti ne kadar kurtarırsam kardır diye düşünmek insanın hataya müsait fıtratından gelir kısa vadeli yaptıysanız yatırımı artık uzun vadeli olarak değerlendirin ve elinizden çıkarmadan bekleyin.");
            System.out.println("mutlaka karşılığını görürsünüz");
        }
    }
    
}
