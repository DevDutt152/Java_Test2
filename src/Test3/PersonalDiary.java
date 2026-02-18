package Test3;
import java.io.*;

public class PersonalDiary {
    public static void writeNote(String fileName, String note) {
        try {
            File f = new File(fileName);
            if (!f.exists()) f.createNewFile();
            FileWriter fw = new FileWriter(f, true);
            fw.write(note + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
        }
    }
//not able to do cause brain is bit switched off