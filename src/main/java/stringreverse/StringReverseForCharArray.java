package stringreverse;

public class StringReverseForCharArray {

    public static void main(String[] args){
        String data="Hello World";

        char[] array = data.toCharArray();

        String result="";

        for(int i=array.length-1; i >= 0 ; i--){
            result += array[i];
        }

        System.out.println(result);
    }
}
