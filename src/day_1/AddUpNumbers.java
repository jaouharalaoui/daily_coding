package day_1;

import java.util.HashSet;
import java.util.Set;

public class AddUpNumbers {
    private static boolean addUp(int k, int list[]) {

        Set<Integer> previousNumbers = new HashSet<>();

        for (int number : list) {
            if (previousNumbers.contains(k - number))
                return true;
            else
                previousNumbers.add(number);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(addUp(17, new int[]{10, 15, 3, 7}));
    }
}
