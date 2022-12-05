package CS_Club;

import java.util.Scanner;

public class BallerYear {
   
   // Determine if a year is baller or not (if baller, return true)
   // A year is baller if it is either a perfect square
   // or if it is a leap year
   // However, it is not baller if it is both a perfect square
   // and a leap year
   public static boolean baller(int year) {
      boolean leap = false;
      if (year % 4 == 0) {
         if (year % 100 == 0) {
            leap = year % 400 == 0;
         } else {
            leap = true;
         }
      }
      
      int sqrt = (int) Math.sqrt(year);
      boolean square = sqrt * sqrt == year;
      
      return ((leap && !square) || (square && !leap));

   }
   
   public static void main(String[] args) {
      
   }
}
