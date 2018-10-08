package main;
import com.TextLoder;

import java.util.*;
import java.nio.charset.Charset;


public class Main {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter file name: ");
        String fileName = scanner.nextLine();
        String path = "src/datasets/"+fileName +".txt";

        String fileContent =TextLoder.load(path , Charset.defaultCharset());
        //System.out.println(fileContent);

        String[][] finalArray = TextLoder.parse2dArray(fileContent);

        for (int i = 0; i < finalArray.length; ++i) {
            for(int j = 0; j < finalArray[i].length; ++j) {
                System.out.print(" / " + finalArray[i][j]);
                if(j == 2){
                    System.out.println();
                }
            }
            System.out.println("-------------------------");
        }
        System.out.println(finalArray.length);
    }
}
