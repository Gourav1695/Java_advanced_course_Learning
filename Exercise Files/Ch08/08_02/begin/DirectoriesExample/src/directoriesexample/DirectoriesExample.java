/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoriesexample;

import java.io.File;

/**
 *
 * @author Bethan Palmer
 */
public class DirectoriesExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] contents = new File(".").list();
        for(String file: contents){
            System.out.println(file);
        }
        new File ("myyDirectory").mkdir();
    }
    
}
