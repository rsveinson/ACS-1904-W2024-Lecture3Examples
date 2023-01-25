while(fReader.hasNext()){
            // read a line from the file
            strin = fReader.nextLine();
            System.out.println(strin);

        }// end eof
        
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
