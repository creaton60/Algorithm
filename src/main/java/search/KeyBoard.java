package search;

import java.util.HashMap;
import java.util.Map;

public class KeyBoard {

    public static int calc(int x, int y, int nx, int ny) {
        int wx = Math.abs((x-nx));

        int wy = Math.abs((y-ny));

        if(wx == 0 && wy == 0) {
            return 0;
        }

        return (wx > 1 || wy > 1) ? 2 : 1;
    }

    public static int entryTime(String s, String keypad) {
        char[][] keys = new char[3][3];

        char[] array = keypad.toCharArray();

        Map<Character, int[]> map = new HashMap<>();

        int i=0;

        int j=0;

        for(char[] key : keys) {
            int[] loc1 = new int[2];
            int[] loc2 = new int[2];
            int[] loc3 = new int[2];

            key[0] = array[i];
            key[1] = array[i+1];
            key[2] = array[i+2];

            loc1[0] = j; loc2[0] = j; loc3[0] = j;
            loc2[1] = 1; loc3[1] = 2;

            map.put(array[i], loc1);
            map.put(array[i+1], loc2);
            map.put(array[i+2], loc3);

            i +=3;
            j++;
        }

        char[] hits = s.toCharArray();

        int sum =0;

        for(int k = 0, size = hits.length -1; k < size; k++) {
            int[] h1 = map.get(hits[k]);

            int[] h2 = map.get(hits[k+1]);

            sum += calc(h1[0], h1[1], h2[0], h2[1]);
        }

        return sum;
    }
}
