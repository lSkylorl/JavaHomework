import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 42)); // false
    
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
    
        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println();

        System.out.println(isLeapYear(2072)); // true 

        int[] res = createArray(6, 5);
        System.out.println(Arrays.toString(res)); // [5, 5, 5, 5, 5, 5]
        
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0
        int[] arr = {1, 0, 1, 0, 0, 0, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));

        // 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
        int[] secondArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < secondArr.length; i++) {
            if (secondArr[i] < 6) {
                secondArr[i] = secondArr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(secondArr));

        // 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n]. Также заполнить элементы побочной диагонали
        int[][] matrixArray = new int[4][4]; 
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0, f = matrixArray[i].length - 1; j < matrixArray[i].length; j++, f--) {
                if (i == j || i == f) {
                    matrixArray[i][j] = 1;
                }
                else {
                    matrixArray[i][j] = 0;
                }
                System.out.print(matrixArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // проверить, что сумма a и b лежит между 10 и 20
    private static boolean isSumBetween10And20(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // проверить, что х положительное
    private static boolean isPositive(int x) {
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // напечатать строку source repeat раз
    private static void printString(String source, int repeat) {
        for (int i = 1; i <= repeat; i++) {
            System.out.print(source);
        }
    }
    
     // проверить, является ли год високосным. если да - return true
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // должен вернуть массив длины len, каждое значение которого равно initialValue
    private static int[] createArray(int len, int initalValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initalValue;
        }
        return array;
    }
    }