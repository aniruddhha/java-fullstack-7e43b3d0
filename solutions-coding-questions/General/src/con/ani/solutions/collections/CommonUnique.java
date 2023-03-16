package con.ani.solutions.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonUnique {
    
    public List<Integer> common(Integer[] arr1, Integer[] arr2) {
        
        List<Integer> commonEls = new ArrayList<>(); // 1

        Set<Integer> set = new HashSet<>(Arrays.asList(arr1)); //n

        for (int el : arr2) {
            if(set.contains(el)) { // 1
                commonEls.add(el); // 1
            }
        }
        return commonEls;
    }

    public Set<Integer> unique(Integer[] arr1, Integer[] arr2) {
        Set<Integer> unique = new HashSet<>();

        for(int el : arr1) {
            unique.add(el);
        }
        for(int el : arr2) {
            unique.add(el);
        }
        return unique;
    }
}
