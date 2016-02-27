import java.util.Scanner;

public class ASCIITable {
  public static void main(String[] args){
    int c = 33;  
    while (c <= 126){
      System.out.print((char)c + " ");
      if ((c-32)%10 == 0)
        System.out.println("");
      c++;
    } // while
  } // main
} // ASCII Table
