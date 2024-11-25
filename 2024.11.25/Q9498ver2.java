import java.util.*;
import java.io.*;

public class Q9498ver2 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int A = Integer.parseInt(br.readLine());

    String str = (A>=90 && A<=100) ? "A" : ((A>=80 && A<=90) ? "B" : ((A>=70 && A<=80) ? "C" : ((A>=60 && A<=70) ? "D" : "F")));

    System.out.println(str);
  }
}
