@BuyProduct
Feature: Buy Product

  @UrunEkleme
  Scenario Outline: Sepete Urun Ekleme
    When Sol üstteki liste butonuna tıklanır, Giyim & Aksesuar kategorisine tıklanır
    Then Kadın iç giyim kategorisi seçilir
    Then Kadın İç Giyim kategorisinde Dizaltı Çorap'a tıklanır
    When Çıkan ilk ürüne tıklanır
    Then Sepete ekleye tiklanir
    When Sepeti git'e tıklanır
    Then Sepetteki <urun> kontrol edilir
    Examples:
      | urun  |
      | "Penti Kadın 50 Denye Pantolon Çorabı Siyah" |

  @UrunOdeme
  Scenario Outline: Sepeti Onaylama, Kargo Bilgilerini ekleme ve Ödeme Adımına Geçme
    When Sol üstteki liste butonuna tıklanır, Giyim & Aksesuar kategorisine tıklanır
    Then Kadın iç giyim kategorisi seçilir
    Then Kadın İç Giyim kategorisinde Dizaltı Çorap'a tıklanır
    When Çıkan ilk ürüne tıklanır
    Then Sepete ekleye tiklanir
    When Sepeti git'e tıklanır
    Then Sepetteki <urun> kontrol edilir
    When Sepeti Onayla butonuna tıklanır
    Then Üye olmadan devam et butonuna tıklanır
    When Email kısmına <email> Adresi yazılır
    Then Checkbox'a tıklanarak KVKK metni onaylanır
    Then Devam et butonuna tıklanır
    #Then Çerezleri kabul et butonuna tıklanır
    When Yeni adres oluştur butonuna tıklanır
    Then Adres başlığı kısmına "Ev Adres" yazılır
    Then Ad kısmına "Emre" yazılır
    Then Soyad kısmına "Öztürk" yazılır
    Then Cep Telefonu kısmına "540 685-4482" yazılır
    When İl seçilir
    Then İlçe seçilir
    Then Mahalle seçilir
    When Adres kısmına <adres> yazılır
    Then Kaydet Butonuna tıklanır
    When Kaydet Devam Et butonuna tıklanır
    Then Ödeme ekranı açılır
    Examples:
      | urun  | email  | adres |
      | "Penti Kadın 50 Denye Pantolon Çorabı Siyah" | "deneme123@gmail.com" | "Koşuyolu Caddesi Yalçın Sokağı"|

