import java.util.*;
import java.io.*;

public class Q9498 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int A = Integer.parseInt(br.readLine());

    if (A>=90 && A<=100) {
      System.out.println("A");
    }
    else if (A>=80 && A<=90) {
      System.out.println("B");
    }
    else if (A>=70 && A<=80) {
      System.out.println("C");
    }
    else if (A>=60 && A<=70) {
      System.out.println("D");
    }
    else {
      System.out.println("F");
    }
  }
}
