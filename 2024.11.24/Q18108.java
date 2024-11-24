import java.util.*;
import java.io.*;

public class Q18108 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int A = Integer.parseInt(str[0]);

    System.out.println(A-543);
  }
}