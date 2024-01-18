import java.util.Scanner;
import java.util.Arrays;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class Ch3EXtraCodeV2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //String line = scanner.next();
        //String line = "exit";
        // assert line != "exit";
        
        // String otherLine = scanner.next();
        // assert !otherLine.equals("Exit") : "line is  Exit";
        
        // int n = scanner.nextInt();
        // assert n >= 5 && n <= 20 : "n out of range";
        
        //** char arrays and strings
        String st = "asdflasdf";
        // System.out.println(st);
        // System.out.println(st.charAt(0));
        // //st.charAt(0) = 'Y';
        // char[] chArray = st.toCharArray();
        // //System.out.println(chArray.toString());
        // System.out.println(Arrays.toString(chArray));
        // System.out.println(st);
        
        
        // swap values using bitwise operator xor (exclusive or)
        // int n = 5;
        // int m = 3;
        // System.out.println(n);
        // System.out.println(m);
        // n ^= m;
        // m ^= n;
        // n ^= m;
        // System.out.println(n);
        // System.out.println(m);
        
        // use special characters in a regular expression
        st = "one++two+three+";
        // String[] tokens = st.split("[\'+']+");
        // System.out.println(tokens.length);
        //or
        String[] tokens = st.split("\\+");
        //String[] tokens = st.split("[\\+]+");
        //String[] tokens = st.split("[+]+");
        System.out.println(tokens.length);
        System.out.println(tokens[0]);
        System.out.println(tokens[1]);
        System.out.println(tokens[2]);
        //System.out.println(tokens[3]);
        
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.delete(2, 4);
        System.out.println(sb.toString());
        


        System.out.println("end of program");
    }
}
