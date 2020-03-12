import java.util.Arrays;

public class StringPractice2 {
    public static void main(String[] args) {

        String[] arrays = {"A", "E", "I", "O", "U"};
        System.out.println("arrays = " + Arrays.toString(arrays));
        String string = Arrays.toString(arrays);
        System.out.println("string = " + string);
        System.out.println(string.equals(Arrays.toString(arrays)));
    }
}
