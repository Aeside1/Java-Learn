package Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class User implements Iterable<String>{
    private String name;
    private int age;

    @Override
    public Iterator<String> iterator() {
        return new UserItr();
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    class UserItr implements Iterator<String> {
        int count = 2;
        
        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public String next() {
            count--;
            if (count == 1){
                return User.this.name;
            } else if (count == 0) {
                return User.this.age + "";
            }
            throw new NoSuchElementException();
        }
    }
}
