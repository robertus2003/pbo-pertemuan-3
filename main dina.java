public class Main {
    public static void main(String[] args) {
        Dinatest Mydina = new Dinatest(50_000); //membuat objek dina dengan uang 50k

        Mydina.catat("cabai");
        Mydina.catat("bayam");
        Mydina.catat("bawang"); //Dina menambahkan barang catatan
        Mydina.catat("tempe");
        Mydina.catat("beras");

        Mydina.hapuscatat("cabai");     //Dina tidak jadi membeli
        Mydina.catat("ayam");            // Dina menambahkan barang di catatan
        Mydina.catat("minyak");

        Mydina.belanja(3_000);
        Mydina.belanja(2_000);
        Mydina.belanja(20_000); //kalkulasi belanja dina
        Mydina.belanja(5_000);
        Mydina.belanja(15_000);

        System.out.println(Mydina.catatan); //menampilkan catatan dina
        System.out.println(Mydina.jumlahbelanja); //menampilkan jumlah belanja
        Mydina.cek_uang();  //menampilkan uang (lebih,sisa,kurang)
    }

}
