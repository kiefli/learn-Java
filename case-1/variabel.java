
import java.util.Scanner;
class variabel {

    public static void main(String[] args) {
        String nama_depan,nama_belakang; // ini deklarasi variabel dengan type data string 
        
        Scanner keyboard = new Scanner (System.in);

        
      
        
        System.out.println ("======== OUTPUT case study =======");
        System.out.print ( "Nama Depan = " );
        nama_depan = keyboard.nextLine();
        System.out.println ( "Nama Belakang = " );
        nama_belakang = keyboard.nextLine();
        System.out.println ( "Nama Depan = "+ nama_depan );
        System.out.println ( "Nama Belakang = "+ nama_belakang );
        System.out.println ( "Nama Lengkap = " + nama_depan +" "+ nama_belakang);
        System.out.println ("======== END OUTPUT =======");

        /*
            ===== OUTPUT case study =====
                Nama Depan = Dedek
                Nama Belakang = Julianto
                Nama Lengkap = Dedek Julianto
            ===== END OUTPUT =====
        */

    }
}