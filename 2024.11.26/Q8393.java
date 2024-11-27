import java.util.*;
import java.io.*;

public class Q8393 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int A = Integer.parseInt(br.readLine());

    int sum = 0;

    for (int i=1; i<=A; i++){
      sum = sum + i;
    }
    System.out.println(sum);
  }
}
