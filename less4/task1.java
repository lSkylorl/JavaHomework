package less4;

import java.util.ArrayList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите строку и номер под которым нужно ее сохранить через дефис (-)");
        System.out.println("Для выхода из программы введите (exit) ");
        Scanner scan = new Scanner(System.in);
        ArrayList<String> listData = new ArrayList<>();
        while (true) {
            String text = scan.nextLine();
            try {
                if (text.equals("exit")) {
                    break;
                }
                Integer.parseInt(text.split("-")[1]);
                func(text, listData);
            } catch (Exception e) {
                System.out.println("Ошибка... Введены некоректные данные");
            }
        }
    }

    static void func(String text, ArrayList<String> listData) {
        String[] infData = text.split("-");
        int num = Integer.parseInt(infData[1]);
        int localSize = num - listData.size();
        for (int i = 0; i <= localSize; i++) {
            listData.add(null);
        }
        if (infData[0].equals("print")) {
            System.out.println(listData.get(num));
        } else {
            listData.set(num, infData[0]);
        }
    }
}