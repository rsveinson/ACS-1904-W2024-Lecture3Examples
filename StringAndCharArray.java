import java.util.Scanner;
import java.util.Arrays;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class StringAndCharArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = "hello cruel world";
        
        //initializes the char array to the correct size
        char[] strin = st.toCharArray();
        
        //now individual characters can be changed
        System.out.println(Arrays.toString(strin));
        
        printCharArray(strin, strin.length);
        
        System.out.println();
        strin[0] = 'H';
        strin[5] = '-';
        strin[6] = 'C';

        printCharArray(strin, strin.length);
        
        // or perhaps
        String strinFinal = Arrays.toString(strin);
        System.out.println("string final " + strinFinal);
        
        strinFinal = String.valueOf(strin);
        System.out.println("string final " + strinFinal);
        
        System.out.println("end of program");
    }// end main
    
    
    public static void printCharArray(char[] c, int length){
        for(int i = 0; i < length; i++){
            System.out.print(c[i]);
        }// end for
        
        // and a new line character
        System.out.println();
    }// end print char array
}
