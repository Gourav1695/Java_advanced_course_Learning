
package fileexample;


import java.io.File;
import java.io.IOException;

public class FileCreationExample {

    public static void main(String[] args) {
        File myFile = new File("/Users/gouravkumarshaw/Downloads/Ex_Files_Advanced_Java_Programming/Exercise Files/Ch08/08_01/begin/FileCreationExample/src/fileexample/Gourav.txt");
        try {
            boolean fileCreated = myFile.createNewFile();
            System.out.println(fileCreated);
        } catch (IOException e)
        {

        }

    }
    
}