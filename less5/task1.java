package less5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ibm866"); // вкл русский алфавит.
        String inputText = sc.nextLine();
        sc.close();

        ExtractText(inputText);
        System.out.println();
        collectStats(inputText);
    }

    static void ExtractText(String text) {
        String[] splitText = text.split(" ");
        Map<Integer, Collection<String>> ExtractText = new TreeMap<>();

        for (int i = 0; i < splitText.length; i++) {
            ArrayList<String> lenText = new ArrayList<>();
            for (String s : splitText) {
                if (splitText[i].length() == s.length()) {
                    lenText.add(s);
                }
            }
            ExtractText.put(splitText[i].length(), lenText);
        }
        
        for (Collection<String> s : ExtractText.values()) {
        System.out.println(s);
        }
    }

    static void collectStats(String text) {
        List<String> listStr = Arrays.asList(text.split(" "));
        Map<Integer, List<String>> stats = new HashMap<>();
        listStr.forEach(str -> {
            stats.merge(str.length(), Arrays.asList(str),
                    (oldList, newList) -> Stream.concat(oldList.stream(), newList.stream())
                            .collect(Collectors.toList()));
        });
        System.out.println(stats);
    }
}