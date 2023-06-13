
package geometri;


public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran ();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        
        lingkaran.radius = 10;
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
        
        System.out.println("");
        
        persegiPanjang.lebar = 10;
        persegiPanjang.panjang = 20;
        System.out.println("Luas Persegi Panjang : " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang :" + persegiPanjang.keliling());
    }
}
