
public class Gercek_Money extends Sanal_Money{
    
    public Gercek_Money(String para_adı, boolean yükselme_trendi, String üretici_ülke, boolean sınırsızmı) {
        super(para_adı, yükselme_trendi, üretici_ülke, sınırsızmı);
    }
    @Override
    public void oneri(){
        System.out.println(getPara_adı()+" üreticisi olan üke ise " +getÜretici_ülke() +" dir./dır.");
    }

    @Override
    public void yükselme_tr(Boolean trend) {
        if(trend == true){
            System.out.println("yükselme trendleri aldatıcı olabilir");
            System.out.println("real paralar için geçerli olan birkez gördüğü noktayı unutmaz sözünü size hatırlatmak isterim");
            System.out.println("Dikkatli olmanız dileğiyle bol Kazanclar");
        }else{
            System.out.println("hiçbir eşya veya para sonsuza kadar değer kaybetmez deep pick adı verilen noktaya ulaşan her eşya veya para deep top noktayı mutlaka görür.");
            System.out.println("param değer kaybetti ne kadar kurtarırsam kardır diye düşünmek insanın hataya müsait fıtratından gelir kısa vadeli yaptıysanız yatırımı artık uzun vadeli olarak değerlendirin ve elinizden çıkarmadan bekleyin.");
            System.out.println("mutlaka karşılığını görürsünüz");
        }
    }

    @Override
    public void SınırSorusu(Boolean sınır) {
       if(sınır == false){
            System.out.println("bu paranızı Amerikan Doları olmadığının bir göstergesidir.\n"
                    + "istisnalar hariç dünyadaki çoğu para Amerikan Doları arşısında değerlenir.Buda size dolarla yatırım yolu açar.");
        }else{
            System.out.println("bu paranızın Amerikan doları olduğunun bir Göstergesidir Dünyanın her yerinde bu paraq birimi ile ticaret ve yatırım yapabilirsiniz.");
        }
    }
    
    
}
