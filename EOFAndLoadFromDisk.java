import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public class EOFAndLoadFromDisk{
    public static void main(String[] args)throws FileNotFoundException {
        // Some constatns
        final int MAXTEAMS = 10;
        final int MAXNUMBERS = 15;

        // stuff to read records from the file
        String strin;                   // input string
        String[] tokens = null;       // an array of strings for tokens split from the input string
        String delim = "[ ]+";          // the regular expression defining the delimiting character(s)

        // connect the data file
        Scanner fReader = new Scanner(new File("DataForEOF.txt"));

        // parallel arrays
        String[] team = new String[MAXTEAMS];
        int[][] numbers = new int[MAXTEAMS][MAXNUMBERS];

        int rowCount;              // for counting and indexing input read from the file
        int columnCount = 0; 

        // do the eof loop

        rowCount = 0;          // make sure we start counting at 0

        while(fReader.hasNext()){
            // read a line from the file
            strin = fReader.nextLine();
            //System.out.println(strin);

            // split the input string into tokens
            tokens = strin.split(delim);
            //System.out.println(tokens.length);

            // the actual number of columns in use
            columnCount = tokens.length -1;     

            // parse each token and add it to the appropraite array
            team[rowCount] = tokens[0];

            // load each row of the table
            for(int i = 1; i < tokens.length; i++){
                numbers[rowCount][i - 1] = Integer.parseInt(tokens[i]);
            }// end for i

            rowCount++;
        }// end eof

        // print the parallel arrays
        printSummary(team, numbers, rowCount, columnCount);

        System.out.println("end of program");
    }// end main
    public static void printSummary(String[] team, int[][] numbers, int rows, int columns){
        for(int i = 0; i < rows; i++){
            System.out.print(team[i] + " ");
            
            for(int j = 0; j < columns; j++){    
                System.out.print(numbers[i][j] + " ");
            }//end j
            System.out.println();
        }// end i
    }// end print summary
    
    public static void printTable(int[][] t, int rows, int columns){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(t[i][j] + " ");
            }//end j
            System.out.println();
        }// end i
    }// end print table

    public static void printList(int[] l, int n){
        for(int i = 0; i < n; i++){        
            System.out.print(l[i] + " ");
        }// end i
    }// end print list

    public static void printList(String[] l, int n){
        for(int i = 0; i < n; i++){        
            System.out.println(l[i] + ": ");
        }// end i
    }// end print list
}
