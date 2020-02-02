public class Encrypter {
   public String encrypt(String code) {
       String encrypterString = "";
       for(int j = 0 ; j < code.length() ; ++j ){
           int encryptedigit = ((Integer.parseInt(code.charAt(j)+"") ) + 7) % 10;
           encrypterString += encryptedigit;
       }
       String digit1 = encrypterString.charAt(2)+"";
       String digit2 = encrypterString.charAt(3)+"";
       String digit3 = encrypterString.charAt(0)+"";
       String digit4 = encrypterString.charAt(1)+"";
       String encrypedcode = digit1+digit2+digit3+digit4;
   return (encrypedcode);      
   }
}