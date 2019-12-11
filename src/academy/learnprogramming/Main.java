package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String s = "hello world";

        while (true) {
            for (int i = 0; i < s.length(); i++) {
                String newStr=s.substring(0, i) + s.substring(i, i+1).toUpperCase()+s.substring(i+1);
                System.out.println(newStr);
                }

        }
    }
}

