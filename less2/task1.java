package less2;

public class task1 {
    public static void main(String[] args) {
        System.out.println(builString(6, 'a', 'b'));
    }

    private static String builString(int n, char c1, char c2) {
        String res = new String();
        for (int i = 0; i < n; i++) {
            res += (i % 2 == 0) ? c1 : c2;
        }
        return res;
    }


}
