package util;

import java.util.List;

public class ListToArray {

    public int[] convertListToArray(List<Integer> list) {

        return list.stream().mapToInt(i->i).toArray();
    }
}
