public class ValidateFormat
{
    public static void main(String[] args){
        String sin = "659-123-999";
        if (validateSIN(sin))
            System.out.println(sin+" is correctly formed");
        else
            System.out.println(sin+" is not correctly formed");
    }

    public static boolean validateSIN(String sin){
        // ensure a value was passed in
        boolean valid = !(sin == null);
        if (valid) {
            // use .split to split the data into parts delimited by a -
            String[] sinParts;
            sinParts = sin.split("-");
            
            // now we can easily validate the original sin string
            // must have 3 parts ad 11 characters total (9 digits and two dashes)
            valid &= sin.length()==11;      // valid will be true if valid is true and length is 11
            valid &= sinParts.length==3;    // valid will be true if valid is true and length is 3
            
            // currently this isn't perfect because it doesn't verify that each part of the sin is 3 digits
            // add some coee here to include that validation routine
            // for(String s: sinParts)
                // valid &= s.length() == 3;
            
            // all character must be digits
            if (valid) {
                // remove the dashes
                String temp = sin.replace("-","");  // replace - with nothing
                for (char c: temp.toCharArray())
                    valid &= Character.isDigit(c);  // valid will be true if valid is true and all characters are digits
            }
        }
        return valid;
    }
}
