
package cipher;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Cipher {


    public static void main(String[] args) {
        
        HashMap <Integer, Character> hashMap = new HashMap <Integer, Character>(); 
        cipherMap(hashMap);
    }
        public static void cipherMap (Map<Integer, Character> map) {
            for (int i = 0; i <= 25; i++) { 
                
                map.put(i, (char) ('a' + i));   
                }
          /* This is to display the hashmap contents  
            
        for (Integer key: map.keySet()){
            Character value = map.get(key);
            System.out.println(key + ": " + value);
        }
*/
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to your first cipher.");
        System.out.println("What is the phrase you would like to encode?");
        String inputText = scan.nextLine();
//why isnt this getting rid of the "white space?"
        inputText.replaceAll(" ", "").toCharArray();

        char[] encodedMsg = inputText.toCharArray();


        for (int j = 0; j <=encodedMsg.length; j++) {
             encodedMsg[j] = (char)(encodedMsg[j] + 4);
        //Checking if its working:
             System.out.println(encodedMsg);
    }
    
    System.out.println(encodedMsg); 
    }
    
}
