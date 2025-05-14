package Iterator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(new File("src/main/java/Iterator/data.user").toPath());
        for (String line : lines) {
            String midString = line.substring(1, line.length() - 1);
            String[] split = midString.split(",");
            String name = split[0];
            int age = Integer.parseInt(split[1]);
            User user = new User(name, age);
            System.out.println(user);
        }
    }
}
