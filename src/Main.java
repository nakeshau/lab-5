import java.util.*;

public class Main {
    public static void main (String args[])
    {
      Scanner scnr = new Scanner(System.in);
      String hex;
      int stringLength;
      char firstChar;
      char secondChar;

      //Get user input
      System.out.println("Enter a hexadecimal number:");
      hex = scnr.next();

      // removing 0x if needed
      stringLength = hex.length();
      firstChar = hex.charAt(0);
      secondChar = hex.charAt(1);

      if ((firstChar == '0')&&(secondChar == 'x')){
          hex = hex.substring(2);
          stringLength = hex.length();
      }

      //making the string uppercase
      hex = hex.toUpperCase();

      //defining hex letters and doing calculation
      int counter = 0;
      char character;
      int currentDigit;
      int power = stringLength - 1;
      long total = 0;

      while (stringLength > counter){
       character = hex.charAt(counter);

       switch (character){
           case 'A':
               currentDigit = 10;
               break;
           case 'B':
               currentDigit = 11;
               break;
           case 'C':
               currentDigit = 12;
               break;
           case 'D':
               currentDigit = 13;
               break;
           case 'E':
               currentDigit = 14;
               break;
           case 'F':
               currentDigit = 15;
               break;
           default:
               currentDigit = Character.getNumericValue(character);
               break;

       }

       total = total + (long)(currentDigit * Math.pow(16,power));
       power --;
       counter ++;
      }


      System.out.println("Your number is " + total + " in decimal");
    }
}
