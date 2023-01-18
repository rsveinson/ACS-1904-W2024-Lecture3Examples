import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;
public class CalculateAge
{
    public static void main(String[] args){
        int age = getAge("2090-01-01");
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
        String[] tokens = yyyymmdd.split("-");
        System.out.println(tokens.length);
        
        int yyyy;
        //yyyy = Integer.parseInt(yyyymmdd.substring(0,4));
        yyyy = Integer.parseInt(tokens[0]);
        System.out.println(yyyy);
    
        
        int mm;
        //mm = Integer.parseInt(yyyymmdd.substring(5,7));
        mm = Integer.parseInt(tokens[1]);
        System.out.println(mm);
        
        int dd;
        //dd = Integer.parseInt(yyyymmdd.substring(8));
        dd = Integer.parseInt(tokens[2]);
        System.out.println(dd);
        
        // age is difference between today and the birthday
        LocalDate birthday = LocalDate.of(yyyy, mm, dd); 
        LocalDate today    = LocalDate.now();
        Period p = Period.between(birthday, today);
        return p.getYears(); // age in years
    }
}
