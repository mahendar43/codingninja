import java.io.*;
import java.util.*;


public class CountingValley {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long numofA=0;
        char a[]=s.toCharArray();
       for(int i=0;i<a.length;i++)
       {
           if(a[i] == 'a')
           {
               numofA++;
           }
        
       }  
     long nooftimes = (n/s.length());
     long remaining = (n%s.length());
     numofA*= nooftimes;
    for(int i=0;i<remaining;i++)
        if(a[i]=='a')
                numofA++;       
        return numofA;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
