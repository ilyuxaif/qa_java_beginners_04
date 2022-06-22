import java.util.*;

public class temp {
    public static void main(String[] args) {
        Integer[] array = {2, 7, 3, 2, 3, 4, 7};

        Set<Integer> uniqueValue = new HashSet<>();
        Set<Integer> dups = new HashSet<>();

        for (int i : array) {
            if (!uniqueValue.add(i)) {
                dups.add(i);
            }
        }
        uniqueValue.removeAll(dups);

        System.out.println(Arrays.toString(uniqueValue.toArray()));
        System.out.println(Arrays.toString(dups.toArray()));
    }
    }
