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