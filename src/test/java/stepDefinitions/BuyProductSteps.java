package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BuyProduct;
import util.DriverFactory;

public class BuyProductSteps {
    pages.BuyProduct buyProd=new pages.BuyProduct(DriverFactory.getDriver());


    @Then("Sol üstteki liste butonuna tıklanır, Giyim & Aksesuar kategorisine tıklanır")
    public void solÜsttekiListeButonunaTıklanırGiyimAksesuarKategorisineTıklanır() {
        buyProd.clickCategoryList();
        buyProd.clickGiyimAksesuar();
    }

    @Then("Kadın iç giyim kategorisi seçilir")
   public void kadınIçGiyimKategorisiSeçilir() {
        buyProd.clickKadınIcGıyım();
    }

    @Then("Kadın İç Giyim kategorisinde Dizaltı Çorap'a tıklanır")
    public void kadınİçGiyimKategorisindeDizaltıÇorapATıklanır() {
        buyProd.clickDızAltıCorap();
    }

    @When("Çıkan ilk ürüne tıklanır")
    public void çıkanÜrüneTıklanır() {
        buyProd.clickSıyahDızAltı();
    }

    @Then("Sepete ekleye tiklanir")
    public void sepeteEkleyeTiklanir() throws InterruptedException {
        buyProd.clickSepeteEkle();
    }

    @When("Sepeti git'e tıklanır")
    public void sepetiGitTıklanır() {
        buyProd.clickSepeteGit();
    }

    @Then("Sepetteki {string} kontrol edilir")
    public void sepettekiUrunKontrolEdilir(String urun) {
        buyProd.checkUrunText(urun);
    }

    @When("Sepeti Onayla butonuna tıklanır")
    public void sepetiOnaylaButonunaTıklanır() {
        buyProd.clickSepetOnayla();
    }

    @Then("Üye olmadan devam et butonuna tıklanır")
    public void üyeOlmadanDevamEtButonunaTıklanır() {
        buyProd.clickUyeOlmdnDvmBtn();
    }

    @When("Email kısmına {string} Adresi yazılır")
    public void emailKısmınaEmailAdresiYazılır(String email) throws InterruptedException {
        buyProd.typeEmail(email);
    }

    @Then("Checkbox'a tıklanarak KVKK metni onaylanır")
    public void checkboxATıklanarakKVKKMetniOnaylanır() {
        buyProd.clickKvkkRadiBtn();
    }

    @Then("Devam et butonuna tıklanır")
    public void devamEtButonunaTıklanır() {
        buyProd.clickGonderBtn();
    }

  /*  @Then("Çerezleri kabul et butonuna tıklanır")
    public void çerezleriKabulEtButonunaTıklanır() {

    } */

    @When("Yeni adres oluştur butonuna tıklanır")
    public void yeniAdresOluşturButonunaTıklanır() {
        buyProd.clickAdresOlustur();
    }

    @Then("Adres başlığı kısmına {string} yazılır")
    public void adresBaşlığıKısmınaYazılır(String adresBaslık) {
        buyProd.typeAdresBaslık(adresBaslık);
    }

    @Then("Ad kısmına {string} yazılır")
    public void adKısmınaYazılır(String ad) {
        buyProd.typeAd(ad);
    }

    @Then("Soyad kısmına {string} yazılır")
    public void soyadKısmınaYazılır(String soyad) {
        buyProd.typeSoyad(soyad);
    }

    @Then("Cep Telefonu kısmına {string} yazılır")
    public void cepTelefonuKısmınaYazılır(String telefon) {
        buyProd.typeTelefonNo(telefon);
    }

    @When("İl seçilir")
    public void i̇lSeçilir() {
        buyProd.selectIl();
    }

    @Then("İlçe seçilir")
    public void i̇lçeSeçilir() {
        buyProd.selectIlce();
    }

    @Then("Mahalle seçilir")
    public void mahalleSeçilir() throws InterruptedException {
        buyProd.selectMahalle();
    }

    @When("Adres kısmına {string} yazılır")
    public void adresKısmınaAdresYazılır(String adres) {
        buyProd.typeAdres(adres);
    }

    @Then("Kaydet Butonuna tıklanır")
    public void kaydetButonunaTıklanır() {
        buyProd.clickKaydetBtn();
    }

    @When("Kaydet Devam Et butonuna tıklanır")
    public void kaydetDevamEtButonunaTıklanır() {
        buyProd.clickKaydetDvmBtn();
    }

    @Then("Ödeme ekranı açılır")
    public void ödemeEkranıAçılır() {
        buyProd.checkOdemeHeader();
    }
}
