import  java.util.*;
import  java.io.*;

public class Main {
    public static void main(String[] args) {
String a = "2.txt";
writefile(a);
readprintfile(a);


    }
    public static void writefile(String filename){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){

writer.write("1");




        } catch (IOException e){

            e.printStackTrace();
        }





    }
public static void readprintfile(String filename ){
try(Scanner sc = new Scanner(new File(filename))){

    while (sc.hasNextLine()){

        String line = sc.nextLine();
System.out.println(line);

    }
}catch (IOException e){
    e.printStackTrace();




}


}




}