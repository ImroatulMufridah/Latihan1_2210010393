package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika fidah = new Matematika(9,3);
        
        System.out.println("Hasil penjumlahan: " +fidah.setPenjumlahan());
        System.out.println("Hasil pengurangan: " +fidah.setPengurangan());
        System.out.println("Hasil perkalian: " +fidah.setPerkalian());
        System.out.println("Hasil pembagian: " +fidah.setPembagian());
    }
}
