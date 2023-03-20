package con.ani.solutions.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    
    public boolean containsDuplicates(Integer[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num)) return true;
            set.add(num);
        }

        return false;
    }
}
