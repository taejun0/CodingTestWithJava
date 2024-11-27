import java.util.*;
import java.io.*;

public class Q2480 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");

    int A = Integer.parseInt(str[0]);
    int B = Integer.parseInt(str[1]);
    int C = Integer.parseInt(str[2]);

    if (A == B && A == C && B == C) {
      System.out.println(10000+1000*A);
    }
    else if (A == B) {
      System.out.println(1000+100*A);
    }
    else if (A == C) {
      System.out.println(1000+100*A);
    }
    else if (B == C) {
      System.out.println(1000+100*B);
    }
    else {
      System.out.println(100*Math.max(Math.max(A,B),C));
    }
  }
}
