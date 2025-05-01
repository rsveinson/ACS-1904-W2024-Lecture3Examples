import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public class StringBuilderParameter{
    public static void main(String[] args)throws FileNotFoundException {
        //Scanner fReader = new Scanner(new File("filename.txt"));

        StringBuilder stb = new StringBuilder();
        String st;

        stb = buildString("Big", "Bamboo", 234);
        System.out.println(stb);
        
        st = makeString("Big", "Bamboo", 234);
        System.out.println(st);

        System.out.println("end of program");
    }// end main
    /* most of the time you want to return a string
     * it's more general and so can be re-used in
     * a wider range of situations
     */
    public static String makeString(String st1, String st2, int n){
        /* still use String builder to construct the 
         * string and make any additions or
         *  changes
         */
        StringBuilder temp = new StringBuilder();

        temp.append(n + st2);
        //System.out.println(temp);
        temp.append(st1);
        //System.out.println(temp);
        
        /* now we have to explicitly return
         * a String since StringBuilder can't 
         * be convered to String automatically
         */
        return temp.toString();
    }// end make string return a string

    /* sometimes you can return a String Builder object */
    public static StringBuilder buildString(String st1, String st2, int n){
        StringBuilder temp = new StringBuilder();

        temp.append(n + st2);
        //System.out.println(temp);
        temp.append(st1);
        //System.out.println(temp);

        return temp;
    }// end build string return string builder
}
