import java.util.Scanner;
class Bab_6_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String masuk = in.nextLine();
        String baru = "";

        for (int i = 0; i < masuk.length(); i++) {
            if (i%2!= 0) { 
                baru +=Character.codePointAt(masuk, i); 
            }else {
                baru += masuk.charAt(i);
            }
        }
            System.out.println(baru);
        int ukur = baru.length();
        int jumlah = (ukur % 16 == 0 ? ukur/16 : (ukur/16)+1 );
        int batas = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for ( int k = 0; k < jumlah; k++) {
                    if (batas < ukur){
                        System.out.print(baru.charAt(batas));
                    }else {
                        System.out.print("?");
                    }
                    batas++;
                    if (k == jumlah-1){
                    System.out.print(" ");
                    }
                }
                    if ( j == 3 ) {
                        System.out.println();
                    }
            }
        }
    }
}