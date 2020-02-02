public class Decrypter {
   public String decrypt(String code) {
       String decrypterString = "";       
       for(int j = 0 ; j < code.length() ; ++j ) {          
           int decryptedigit = ((Integer.parseInt(code.charAt(j)+"")) - 7);           
           if (decryptedigit < 0)
           decryptedigit += 10;          
           decrypterString += decryptedigit;
       }      
       String digit1 = decrypterString.charAt(2)+"";
       String digit2 = decrypterString.charAt(3)+"";
       String digit3 = decrypterString.charAt(0)+"";
       String digit4 = decrypterString.charAt(1)+"";
       String decryptedcode = digit1+digit2+digit3+digit4;       
       return (decryptedcode);
   }
}