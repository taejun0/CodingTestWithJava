import java.util.*;
import java.io.*;

public class Q10430 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    long A = Long.parseLong(str[0]);
    long B = Long.parseLong(str[1]);
    long C = Long.parseLong(str[2]);

    System.out.println((A+B)%C);
    System.out.println(((A%C)+(B%C))%C);
    System.out.println((A*B)%C);
    System.out.println(((A%C)*(B%C))%C);
  }
}
