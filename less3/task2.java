package less3;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        textList(list);
        System.out.println(list); 
    }

    private static void textList(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            try {
                Integer.parseInt(array.get(i));
                array.remove(i--);
            }
            catch (Exception e) {}
        }
    }
}
