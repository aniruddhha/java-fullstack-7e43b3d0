package con.ani.solutions.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharacterCount {
    
    public String countChars(String ip) {
        final Map<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i < ip.length(); i++) {
            char ch = ip.charAt(i);
            if(map.containsKey(ch)) {
                int cnt = map.get(ch);
                map.put(ch, cnt + 1);
            }else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);

        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();

        for(Map.Entry<Character, Integer> entry : entries) {
            sb.append(entry.getKey())
              .append(entry.getValue())
              .append(",");
        }
        return sb.replace(sb.length()-1, sb.length(), "").toString();
    }
}
