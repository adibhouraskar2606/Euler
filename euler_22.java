import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Euler{
    public static void main(String gg[]) throws IOException {
        ArrayList<String> names = new ArrayList<String>();
        FileReader in = new FileReader("names.txt");
        BufferedReader bufferedReader = new BufferedReader(in);
        String fullText = "";
        String line = null;
        while ((line = bufferedReader.readLine())!= null){
            fullText = line;
            fullText = fullText.replace("\"", "");
            }
        //System.out.println(fullText);
        String [] brokenText = fullText.split(",");
        for (int i = 0; i<brokenText.length; i++){
            //System.out.println(brokenText[i]);
            names.add(brokenText[i]);
        }
        Collections.sort(names);
        long sum = 0;
        long brokenSum = 0;
        for (int i = 0; i<names.size(); i++){
            System.out.println(names.get(i));
            char [] tempChar = names.get(i).toCharArray();
            int position = 0;
            int positionSum = 0;
            for (int j = 0; j<tempChar.length; j++){
                position = tempChar[j]  - 'A' + 1;
                positionSum = positionSum + position;
            }
            System.out.println("position sum : "+positionSum);
            brokenSum = positionSum * (i+1);
            sum = sum + brokenSum;
        }
        System.out.println("total is : "+sum);
    }
}