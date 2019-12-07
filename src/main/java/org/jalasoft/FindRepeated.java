package org.jalasoft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * FindRepeated
 */
public class FindRepeated {

    public int findIntRepeated(int[] numbers) {
        Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
        for (int i : numbers) {
            if (numbersMap.containsKey(i)) {
                numbersMap.put(i, i);
                return i;
            } else {
                numbersMap.put(i, i);
            }
        }
        return -1;
    }
}