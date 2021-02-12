package day17;

public class OgrenciOlusturma {

	
			
	
		private String isim;
		private String soyisim;
		private int numara;
		private double ortalama;
		
		
		public OgrenciOlusturma() {
			
		}
		public OgrenciOlusturma(int numara, String isim, String soyisim, double ortalama) {
			this.numara = numara;
			this.isim = isim;
			this.soyisim = soyisim;
			this.ortalama = ortalama;
		}
		public int getNumarasi() {
			return numara;
		}
		public void setNumarasi(int numarasi) {
			this.numara = numarasi;
		}
		public String getAdi() {
			return isim;
		}
		public void setAdi(String adi) {
			this.isim = adi;
		}
		public String getSoyAdi() {
			return soyisim;
		}
		public void setSoyAdi(String soyAdi) {
			this.soyisim = soyAdi;
		}
		public double getOrtalama() {
			return ortalama;
		}
		public void setOrtalama(double ortalama) {
			this.ortalama = ortalama;
		}
}
	
	