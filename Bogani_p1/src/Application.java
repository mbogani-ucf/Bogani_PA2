/*
 * In main*
 * >the user input 4 digits
 * >if statements look out for exact number
 * of digits.
 * >Code is then sent to Encrypter().
 * >encrypted gets printed out.
 * >encrypted code gets sent to Decrypter().
 * >Decrypted code gets printed out.
 * In Encrypter()*
 * >A forloop counts up to the numbers of digits.
 * >Each digits converts to an int and gets added to 7
 * and mod by 10.
 * >Each digit gets turned back to string.
 * >Each character in the string gets printed on specified
 * locations.
 * >encryptedcode is returned to main.
 * In Decrypter()*
 * >A forloop counts up to the numbers of digits.
 * >Each digits converts to an int and gets subtracted 7
 * , added 10 if less than 0, and added to itself.
 * >Each digit gets turned back to string.
 * >Each character in the string gets printed on specified
 * locations.
 * >decryptedcode is returned to the main. 
 */
import java.util.Scanner;

public class Application {   
   public static void main(String[] args) {
       System.out.print("Enter your 4-digit code: ");
       Scanner scan = new Scanner(System.in);
       String code = scan.nextLine();
       scan.close();
       if(code.length() < 4) {           
           System.out.println("**4 digits needed, please enter more digits**");
           return;
       }
       
       if(code.length() > 4) {           
           System.out.println("**4 digits needed, please enter less digits**");
           return;
       }              
       Encrypter toencrypt = new Encrypter();       
       String encrypted = toencrypt.encrypt(code);       
       System.out.println("*****************************\nEncrypted code : "+encrypted);
       
       Decrypter todecrypt = new Decrypter();
       String decrypted = todecrypt.decrypt(encrypted);
       System.out.println("Decrypted code : "+decrypted);
   }
}