import java.util.Scanner;
public class ReverseString
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a string");
        
        // two instances of StringBuilder
        StringBuilder original = new StringBuilder(kb.nextLine());
        System.out.println("o = " + original);
        StringBuilder reversed = new StringBuilder(original);
        
        // reverse one of these
        reversed.reverse();
        System.out.println("original :" + original.toString());
        System.out.println("reversed :" + reversed.toString());
        
        // test for equality
        // need to compare strings
        // because StringBuilder does not 
        // override equals in Object
        if 
          (original.toString().equals(reversed.toString()))
           System.out.println("a palindrome");
        else
           System.out.println("not a palindrome");
    }
}
