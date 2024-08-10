package bufferedreaderexample;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author bethan
 */
public class BufferedReaderExample {
// Note --> buffered reader is synchronized and faster than scanner class
    public static void main(String[] args) {
        File myFile = new File("/Users/gouravkumarshaw/Downloads/Ex_Files_Advanced_Java_Programming/Exercise Files/Ch07/07_03/begin/BufferedReaderExample/example.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            String line;
            while ((line = reader.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("WuW");
        }


    }

}
