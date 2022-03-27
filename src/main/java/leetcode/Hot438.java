package leetcode;

import java.util.*;

public class Hot438 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        ArrayList<? extends Object> arrayList = new ArrayList<>();
        list.add(1);
        for (Object o : list.getClass().getTypeParameters()) {
            System.out.println(o.toString());
        }
    }

    public List<Integer> findAnagrams(String s, String p) {
        int sLength = s.length();
        int pLength = p.length();
        List<Integer> result = new ArrayList<>();
        if (sLength < pLength) {
            return result;
        }
        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (int i = 0; i < pLength; i++) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }

        if (Arrays.equals(sCount, pCount)) {
            result.add(0);
        }

        for (int i = 0; i < sLength - pLength; ++i) {
            --sCount[s.charAt(i) - 'a'];
            ++sCount[s.charAt(i + pLength) - 'a'];

            if (Arrays.equals(sCount, pCount)) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
