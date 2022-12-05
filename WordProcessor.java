package CS_Club;

import java.util.Scanner;

public class WordProcessor {
   
   // Create a word processor!
   // You are given a String array of tokens
   // In a word processor, typing on a line for more than 15 chars
   // (including spaces) results in going to the next line
   // If adding a word to the current line would result in it going
   // over 15 chars, put it on a new line
   // Not every line has to be 15 chars long
   // Print out the processed text after formatting the token 
   // list in this way
   
   // Ex. 
   // 5
   // ["Hello", "my", "name", "is", "Alexander"]
   // Out:
   // Hello my name
   // is Alexander
   
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      String[] tokens = new String[N];
      
      for(int i = 0; i < N; i++) {
         tokens[i] = in.next();
      }
      
      processAndPrint(tokens);
      
      in.close();
   }
   
}
