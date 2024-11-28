import java.io.*;

public class Q10871 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int N = Integer.parseInt(str[0]);
    int X = Integer.parseInt(str[1]);
    String[] str2 = br.readLine().split(" ");

    String str3 = "";

    for (int i=0; i<N; i++) {
      if (Integer.parseInt(str2[i]) < X ){
        str3 += str2[i] + " ";
      } 
    }
    System.out.println(str3);
  }
}
