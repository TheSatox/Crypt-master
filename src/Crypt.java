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

    private static String decrypt(String crypted, int key) {
        return "";
    }

    private static String crypt(String text, int key) {
        return "";
    }
}
