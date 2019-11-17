import java.util.Scanner;
class Bab_6_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        //hexadecimal
        int hexa = input.length() * input.length();
        String sumOfHexa = String.format("%x", hexa);
        //palindrom
        String mirror = input.replace(" ", "");
        String mirror1 = mirror.substring(0, (input.length()-1)/2);
        String mirror2 = mirror1.toUpperCase();
        char[] flex = mirror2.toCharArray();
        String result = "";
        System.out.println(mirror2);
        for (int i = 0; i < mirror2.length()-1; i++){
            result = flex[i] + result;
        }
        String palindrom = mirror2 + result;
        //octal
        int octa = input.length();
        String sumOfOcta = String.format("%o", octa);
        String a = "!";
        String b = "?";
        String c = "#";
        int hasil = (int)sumOfHexa.charAt(0);
        if (hasil <= 97 && hasil >= 122){
            System.out.printf("%s%s%s%s%s", c, sumOfHexa, palindrom, sumOfOcta, b);
        }else {
            System.out.printf("%s%s%s%s%s", c, sumOfHexa, palindrom, sumOfOcta, a);
        }
    }
}