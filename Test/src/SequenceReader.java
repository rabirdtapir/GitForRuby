import java.util.InputMismatchException;

public class SequenceReader {

    public static String read(String number) throws Exception {
            if (number.length() == 0) {
                return number;
            } else {
                String result = "";
                char[] arr = number.toCharArray();
                int i = 0;
                while (i < arr.length) {
                    int t = counter(arr, i);
                    result = result + t;
                    result = result + (arr[i]);
                    i += t;
                }
                return result;

            }
        }


    public static int counter(char[] arr, int point) {
        int counter = 1;
        for (int i = point + 1; i < arr.length; i++) {
            if(arr[point] == arr[i]) {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }
}
