import java.util.*;
import java.io.*;

public class Q2753 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int A = Integer.parseInt(br.readLine());

    if (A%4 ==0 && A%100 != 0 || A%400 == 0) {
      System.out.println("1");
    }
    else {
      System.out.println("0");
    }
  }
}
