import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class CatenateStringsWithStringBuilder
{
    public static void main(String[] args) 
                              throws IOException {
        Scanner f = new Scanner(
                        new File("ReadMe.txt"));
        StringBuilder result = 
                        new StringBuilder(1000);
        while (f.hasNext()){
            result.append(f.next());
        }
        System.out.println(result);
    }
}
