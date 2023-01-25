public class CatenateWordsAlternate
{
    public static void main(String[] args){
        String course = "retail    sales      tax";
        String result = formNewWord(course);
        System.out.println(result);
    }

    public static String formNewWord(String line){
        String newWord = "";
        String[] tokens;                // String array
        tokens = line.split(" +");       // use one or more spaces as the delimiter
        
        //now we have 
        //tokens is {"retail", "sales", "tax"}
        // for each word
        for(String s: tokens)
            // catenate to previous result
            // s.substring(1) start at position 1 i.e. the second character
            newWord += Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
        return newWord;
    }
}
