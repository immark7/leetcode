package easy;

import java.util.ArrayList;

public class BaseballGame {
    public static void main(String[] args) {
        String[] input = {"5", "2", "C", "D", "+"};
        int result = calPoints(input);
        System.out.println("Result " + result);
    }

    public static int calPoints(String[] opts) {
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (String val : opts) {
            switch (val) {
                case ("+") -> list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
                case ("D") -> list.add(list.get(list.size() - 1) * 2);
                case ("C") -> list.remove(list.get(list.size() - 1));
                default -> list.add(Integer.valueOf(val));
            }
        }

        for (int value : list) {
            result += value;
        }

        return result;
    }
}
