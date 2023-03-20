package con.ani.solutions.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    
    public boolean containsDuplicates(Integer[] nums) { // eff = 1 + n + 1 + 1 = 3 + n = n

        Set<Integer> set = new HashSet<>(Arrays.asList(nums)); // 1
        return set.size() != nums.length; // 1

        // for(int num : nums) { // n
        //     if(set.contains(num)) return true; // 1
        //     set.add(num); // 1
        // }

        // return false; //o(n)
    }
}
