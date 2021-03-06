package OUO.com;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while(line != null) {
                String[] token = line.split(",");
                String name = token[0];
                int english = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student stu = new Student(name, english, math);
                stu.print();
                line = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("DATAFAIL");
        } catch (IOException e) {
            System.out.println("INFORMATIONFAIL");
        }
        System.out.println("Continuing");
    }
}
