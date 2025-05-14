package Iterator;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        User user = new User("张三", 18);
        for (String s : user){
            System.out.println(s);
        }

    }
}
