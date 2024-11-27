import java.util.*;
import java.io.*;

public class Q25314 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int A = Integer.parseInt(br.readLine());
    String str = "";

    for (int i=0; i<A/4; i++) {
      str += "long ";
    }
    System.out.println(str + "int");
  }
}
