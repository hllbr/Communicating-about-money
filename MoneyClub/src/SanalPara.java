
public abstract class SanalPara {
    private String para_adı ;
    private boolean yükselme_trendi ;
    private String üretici_ülke ;
    private boolean sınırsızmı ;

    public SanalPara(String para_adı, boolean yükselme_trendi, String üretici_ülke, boolean sınırsızmı) {
        this.para_adı = para_adı;
        this.yükselme_trendi = yükselme_trendi;
        this.üretici_ülke = üretici_ülke;
        this.sınırsızmı = sınırsızmı;
    }

    public String getPara_adı() {
        return para_adı;
    }

    public void setPara_adı(String para_adı) {
        this.para_adı = para_adı;
    }

    public boolean isYükselme_trendi() {
        return yükselme_trendi;
    }

    public void setYükselme_trendi(boolean yükselme_trendi) {
        this.yükselme_trendi = yükselme_trendi;
    }

    public String getÜretici_ülke() {
        return üretici_ülke;
    }

    public void setÜretici_ülke(String üretici_ülke) {
        this.üretici_ülke = üretici_ülke;
    }

    public boolean isSınırsızmı() {
        return sınırsızmı;
    }

    public void setSınırsızmı(boolean sınırsızmı) {
        this.sınırsızmı = sınırsızmı;
    }
    abstract void oneri();
    
}
