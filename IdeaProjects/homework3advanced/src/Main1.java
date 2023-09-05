import java.util.*;
import java.io.*;

public class Main1 {
    public static void main(String[] args) {
        String a = "lalalalalalalala. ololololo. dldldldldl. jkjkjk. rgrgrgrg. rgdfsfefssfe.";
String[] b = a.split("\\. ");

if (b.length >=2 ){
int middle = b.length/2;
for(int x =0; x<middle;x++){
    System.out.println(b[x]);




}
System.out.println(" ");
for(int y = middle; y < b.length; y++){
System.out.println(b[y]);




}




} else{
System.out.println("Кількість ввелених речень недостатня.Помилка.");


}


    }
}
