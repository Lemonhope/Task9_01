
package org.example;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static String replaceWord(String line){
        String[] prepositions={" in ", " out ", " under ", " on ", " for ", " up ", " of ", " to ",
                " In ", " Out ", " Under ", " On ", " For ", " Up ", " Of ", " To "};
        for(String s:prepositions){
            if (line.contains(s)) {
                line = line.replace(s, " Java ");
            }
        }
        return line;
    }

    public static void main(String[] args) {
        try {
            File f=new File("text.txt");
            FileReader fileReader=new FileReader(f);
            BufferedReader in = new BufferedReader(fileReader);

            String line,  result="";
            while((line=in.readLine())!=null)  {

                line=replaceWord(line);
                result += line+"\n";
            }
            //System.out.println(result);
            FileWriter fileWriter=new FileWriter(f);
            BufferedWriter out = new BufferedWriter(fileWriter);
            out.write(result);
            in.close();
            out.close();


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}