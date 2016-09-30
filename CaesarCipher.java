import java.util.*;
import java.lang.*;
import java.io.*;
class CaesarCipher {

   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String plainText = in.nextLine();
   
    int shift= in.nextInt();
    
    char[] plainTextChar = plainText.toCharArray();
    for(int i=0;i<plainTextChar.length;i++) {
        if (plainTextChar[i] == (char)(int)(32)){
                plainTextChar[i] = (char)(int)(32);
        }else{
        plainTextChar[i] = (char)(((int)plainTextChar[i]+shift-97)%26 + 97);
    }
    }
    System.out.println(String.valueOf(plainTextChar));
 }  
}
