package leetcode;

import java.util.*;

public class Hot49 {
    public static void main(String[] args) {

    }

    /**
     * 对单词转换为char数组后进行排序之后作为key，利用map统计结果
     * */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }

    /**
     * 计数法，对字母出现的次数计数，并作为key
     * */
    public List<List<String>> groupAnagrams1(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            int[] count = new int[26];
            int length = str.length();
            for (int i = 0; i < length; i++) {
                count[str.charAt(i) - 'a']++;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    stringBuffer.append((char) ('a' + i));
                    stringBuffer.append(count[i]);
                }
            }
            String key = stringBuffer.toString();
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }

}
