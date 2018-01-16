import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Finder {
    public Finder() {
        init();
    }
    private String[] array = new String[23];
    public void init() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("resources/appliances_db.txt"));
            String buffer;
            int i = 0;
            while ((buffer = reader.readLine()) != null) {
                array[i] = buffer;
                i++;
            }
        } catch (IOException e) {
            System.out.println("There is IOExeption in your programm");
        }
    }
    public void get() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    public void OneCriteria(String s) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].isEmpty() != true) {
                String[] buffer = array[i].split("[,:.; =\\\\s\\d]");
                for (int j = 0; j < buffer.length; j++) {
                    if (buffer[j].equals(s)) {
                        System.out.println(array[i]);
                    }

                }

            }
        }
    }
    public void TwoCriteria(String s, String s1) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].isEmpty() != true) {
                String[] buffer = array[i].split("[,:.; =\\\\s\\d]");
                boolean flag = false;
                for (int j = 0; j < buffer.length; j++) {
                    if (buffer[j].equals(s)) {
                        flag = true;
                    }
                    if (flag == true && buffer[j].equals(s1)) {
                        System.out.println(array[i]);
                    }
                }
            }
        }
    }
}
