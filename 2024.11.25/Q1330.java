import java.util.*;
import java.io.*;

public class Q1330 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int A = Integer.parseInt(str[0]);
    int B = Integer.parseInt(str[1]);
    
    if (A>B) {
      System.out.println(">");
    }
    else if (A==B) {
      System.out.println("==");
    }
    else {
      System.out.println("<");
    }
  }
}