import java.util.ArrayList;

    public class Dinatest {

        Integer uang;   // inisiasi atribut uang
        ArrayList<String> catatan= new ArrayList<>();   //inisiasi atribut catatan
        Integer jumlahbelanja = 0;  //inisiasi atribut jumlah belanja

        Dinatest(){
            //construktor kosong jika ingin membuat objek tanpa set uang
        }

        Dinatest(Integer uang) {
            this.uang = uang;   //construktor untuk membuat objek sekaligus set uang
        }

        void catat(String isi){
            catatan.add(isi);   //method untuk menambahkan catatan
        }

        void belanja( Integer harga){
            this.jumlahbelanja = this.jumlahbelanja+harga; //method untuk menambahkan harga barang yang di beli
        }

        void hapuscatat(String hapus){
            catatan.remove(hapus);  //construktor untuk menghapus catatan
        }

        void cek_uang(){
            if(uang-jumlahbelanja > 0){
                System.out.println("Uang sisa sebanyak : "+ (uang-jumlahbelanja));
            }
            else if (uang-jumlahbelanja < 0){
                System.out.println("Uang kurang sebanyak : "+ (jumlahbelanja-uang));   //Method untuk mengecek sisa uang
            }
            else{
                System.out.println("Uang pas");
            }
        }

    }


