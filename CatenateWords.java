public class CatenateWords
{
    public static void main(String[] args){
        String course = "retail    sales      tax";
        String result = formNewWord(course);
        System.out.println(result);
    }

    public static String formNewWord(String line){
        String newWord = "";
        // for each word
        for(String s: line.split(" +"))
            // catenate to previous result
            newWord += Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
        return newWord;
    }
}
