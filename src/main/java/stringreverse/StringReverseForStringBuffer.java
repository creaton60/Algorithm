package stringreverse;

/**
 * This class is String Reverse used to StringBuffer
 */
public class StringReverseForStringBuffer {

    public static void main(String[] args){
        String data = "Hello world";

        StringBuffer sb = new StringBuffer();
        sb.append(data);

        System.out.println(sb.reverse());

    }

}
