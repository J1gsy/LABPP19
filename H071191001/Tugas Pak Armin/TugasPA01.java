import java.util.Scanner;
class TugasPA01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int [] eror = new int[n];
        int jumlah = 0;

        for (int i = 0; i < n; i++) {
            eror[i] = in.nextInt();
            jumlah += eror[i];
            
        }
        double rata2 = jumlah/n;
        double error;
        
        System.out.println("-----------------------------");
        System.out.println("|NO |   data    |   eror    |" );
        for (int i = 0; i < n; i++) {
           error = Math.pow(Math.pow(rata2 - eror[i], 2), 0.5);
            if ( error >= 10 && error <100){
                System.out.printf("|%2d |     %2d    |   %.3f  | \n" , (i+1), eror[i], error);
            }else if(error >= 100){
                System.out.printf("|%2d |     %2d    |   %.3f   | \n" , (i+1), eror[i], error);
                
            }
        }
        System.out.println("-----------------------------");
    }
}