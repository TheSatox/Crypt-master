import java.util.Scanner;

/**
 * Created by magnus on 2016-09-23.
 */
public class Crypt {
    public static void main(String[] args) {
        String text;
        int key;
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv in text som ska krypteras:");
        text = in.nextLine();
        System.out.println("Ange den nyckel som ska användas i krypteringen:");
        key = in.nextInt();

        String crypted = crypt(text, key);
        System.out.println("Den krypterade texten:\n" + crypted);

        String decrypted = decrypt(crypted, key);
        System.out.println("Den dekrypterade texten:\n" + decrypted);
    }


    private static String crypt(String text, int key) {
        char ord = 0;

        String crypt = "";

        for (int i = 0; i < text.length(); i++) {
            ord = text.charAt(i);
            ord += key;

            crypt += ord;
        }
        return crypt;
    }

    private static String decrypt(String crypted, int key) {

        char ord2 = 0;

        String decrypted="";

        for(int i = 0 ; i < crypted.length(); i++) {
            ord2 = crypted.charAt(i);
            ord2 -= key;

            decrypted += ord2;
        }
        return decrypted;
    }


}
