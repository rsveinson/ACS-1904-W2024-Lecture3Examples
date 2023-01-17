import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class Ch3EXtraCode{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //String line = scanner.next();
        //String line = "exit";
        // assert line != "exit";
        
        String otherLine = scanner.next();
        assert !otherLine.equals("Exit") : "line is  Exit";
        
        // int n = scanner.nextInt();
        // assert n >= 5 && n <= 20 : "n out of range";
        
        //** char arrays and strings
        // String st = "asdflasdf";
        // System.out.println(st);
        // //st.charAt(0) = 'Y';
        // char[] chArray = st.toCharArray();
        // System.out.println(chArray.toString());
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
        
        


        System.out.println("end of program");
    }
}
