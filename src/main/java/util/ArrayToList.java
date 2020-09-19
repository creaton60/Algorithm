package util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToList {

    public List<Integer> convertArrayToList(int[] array) {

        return Arrays.stream(array).boxed().collect(Collectors.toList());
    }

}
