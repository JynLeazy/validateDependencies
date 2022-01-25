import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


class FindingWordFromFile {
    
    String word;
  

   public boolean FindingWord(String wordS) throws FileNotFoundException {
    
     //Reading the word to be found from the user      
     word = wordS
     boolean flag = false;  
                
     //Reading the contents of the file
     Scanner sc2 = new Scanner(new FileInputStream("./somefile.txt"));
     while(sc2.hasNextLine()) {
         String line = sc2.nextLine();
         
         if(line.indexOf(word)!=-1) {
            flag = true;
            
         }
     }
     if(flag) {
            return true;
         
     }  else {
            return false;
        }       
   }
}



def validateWord() { 

   FindingWordFromFile finding = new FindingWordFromFile()
   if (finding.FindingWord("albums")){
       println('The word exist');
       return true;
   } else {
        println('The word doesnt exist');
        return false;
        }
}

def call (Map config=[:]){
    validateWord()
}
