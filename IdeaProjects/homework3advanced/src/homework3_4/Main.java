package homework3_4;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        String path = "3.txt";
        try{

            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while((line= reader.readLine())!= null){

                System.out.println(line);
            }
            reader.close();


        }    catch (IOException e){


            e.printStackTrace();
        }




    }








}
