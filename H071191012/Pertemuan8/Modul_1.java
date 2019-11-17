import java.io.*;
import java.util.Scanner;

class Modul_1 {
    static Scanner scan = new Scanner(System.in);
    public static void  main(String[] args){
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(scan.next());
            out = new FileOutputStream(scan.next());
            int data;
            while((data = in.read()) != -1){
                out.write(data);
            }
        }catch (IOException ioe){
            System.out.println("Fail");
        }finally {
            try{
                if(in != null){
                    System.out.println("Success");
                    in.close();
                }
                if(out != null){
                    out.close();
                }
            }catch (IOException ioe) {
                System.out.println("Fail");
            }
        }
    }
}