# n11TestCase

İstenilen Test Case Senaryosu :

1. http://www.n11.com (http://www.n11.com/) sitesine gidecek ve anasayfasının açıldığı
onaylayacak.
2. Login ekranını açıp, bir kullanıcı ile login olacak.
3. Ekranın üstündeki Search alanına 'samsung' yazıp Ara butonuna tıklayacak.
4. Gelen sayfada samsung için sonuç bulunduğunu onaylayacak.
5. Arama sonuçlarından 2. sayfaya tıklayacak ve açılan sayfada 2. sayfanın şu an gösterimde olduğunu
onaylayacak.
6. Üstten 3. ürünün içindeki 'favorilere ekle' butonuna tıklayacak.
7. Ekranın en üstündeki 'favorilerim' linkine tıklayacak.
8. Açılan sayfada bir önceki sayfada izlemeye alınmış ürünün bulunduğunu onaylayacak.
9. Favorilere alınan bu ürünün yanındaki 'Kaldır' butonuna basarak, favorilerimden çıkaracak.
10. Sayfada bu ürünün artık favorilere alınmadığını onaylayacak.

#Manuel Test Case

1.  http://www.n11.com sayfasına gidilir, url ve title üzerinden doğru sayfada olduğu kontrol edilir.
2.  Doğru kullanıcı adı ve parola yazılır ardından giriş yap butonuna tıklanır. Login olmayan kullanıcıda favorilerim ikonu görünmemektedir, bu kontrol edilir login doğrulamak için.
3. Search alanına tıklanır, "samsung" yazılır search alanına, search butonuna tıklanır.
4. Arama yapıldıktan sonra ürün isimlerinin içeriğinde "samsung" yazıyor mu teyit edilir ve url içerisinde "samsung" text'i kontrol edilir.
5. 2. sayfaya tıklanır. Url üzerinden 2. sayfada olunduğu teyit edilir.
6. Arama sonuçlarında üstten 3. ürünün üzerindeki fav ikonuna tıklanır.
7. Ekranın en üstündeki 'favorilerim' ikonuna tıklanır.
8. Favorilerim alanı içindeki ürün ile favoriye alınan üçüncü ürün isimleri kıyasylanır.
9.Favorilere alınan bu ürünün yanındaki 'Sil' butonuna basılır, favorilerimden çıkarılır.
10. Boş sayfanın geldiği ve element olarak "empty" yazdığı görülür.
