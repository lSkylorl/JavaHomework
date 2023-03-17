package less3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> intNum = new ArrayList<>(Arrays.asList(1, 5, 3, 7, 8, 2, 6, 9, 1, 4 ));
        evenNum(intNum);
        System.out.println(intNum);
    }

    private static void evenNum(List<Integer> arg) {
        for (int i = 0; i < arg.size(); i++) {
            if (arg.get(i) % 2 != 0) {
                arg.remove(i--);
            }
        }
    }
}
