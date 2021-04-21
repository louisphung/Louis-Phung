import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader((fr));
        ArrayList<String> lines = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null){
            System.out.println("Just read:" + line);
            lines.add(line);
        }
        br.close();
        for (int i = 0; i < lines.size(); i++) {
            lines.get(i);
            System.out.println(lines.get(1));
            if (lines.get(i) == "."){
                String[] item = lines.toArray(new String[lines.size()]);
                for (String s : item) {
                    System.out.println(s);
                }
            }
            System.out.println(lines.get(i));



    }

