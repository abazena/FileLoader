package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TextLoder {

    public static String load(String path , Charset encoding){

        //FileInputStream fileInputStream = null;

        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            return new String(encoded, encoding);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public static String[][] parse2dArray(String csv)
    {
        String lines[] = csv.split("\\r?\\n");
        int temp = lines.length;
        String[][] finalArray = new String[temp][3];
        for (int x =0; x<lines.length; x++){
            List<String> elephantList = Arrays.asList(lines[x].split(","));
            for(int i =0; i< elephantList.size(); i++){
                finalArray[x][i]= elephantList.get(i);
            }
        }
        return finalArray;
    }
}
