import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.lang.IllegalArgumentException;
public class CheckArgumentValue
{
    public static void main(String[] args){
        // bad value passed to getAge
        int age = getAge("2000-b1-01"); 
        assert age > 0 : "age must be positive";
        System.out.println(age);
    }

    /**
     * getAge - determines age in years
     * 
     * @param  yyyymmdd   birthdate YYYY-MM-DD
     * @return age in years
     */
    public static int getAge(String yyyymmdd){
        String arg = yyyymmdd;
        // check length
        boolean valid = arg.length()==10; 
        if (!valid) 
           throw new IllegalArgumentException("yyyymmdd has wrong length");
           
        // check for dashes
        valid = arg.charAt(4) == '-' && arg.charAt(7) == '-' ;
        if (!valid) 
           throw new IllegalArgumentException("yyyymmdd does not have dashes in correct places");
           
        // check digit positions are numeric
        for (int i=0; i<arg.length() && valid; i++)
           valid = ((i == 4 || i == 7) || Character.isDigit(arg.charAt(i)));
        if (!valid) 
           throw new IllegalArgumentException("yyyymmdd is not numeric");
           
        // the following executes only if no exception was thrown above
        arg = arg.replaceAll("-",""); // remove dashes and replaces them with commas
        
        int yyyy = Integer.parseInt(yyyymmdd.substring(0,4));
        int mm   = Integer.parseInt(yyyymmdd.substring(5,7));
        int dd   = Integer.parseInt(yyyymmdd.substring(8,10));
        
        // age is difference between today and the birthday
        LocalDate birthday = LocalDate.of(yyyy, mm, dd); 
        LocalDate today    = LocalDate.now();
        Period p = Period.between(birthday, today);
        System.out.println(p);
        return p.getYears(); // age in years
    }
}
