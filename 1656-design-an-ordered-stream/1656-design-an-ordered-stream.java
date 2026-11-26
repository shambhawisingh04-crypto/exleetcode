import java.util.*;

class OrderedStream {
    String[] arr;
    int ptr;

    public OrderedStream(int n) {
        arr = new String[n];
        ptr = 0;
    }

    public List<String> insert(int idKey, String value) {
        arr[idKey - 1] = value;

        List<String> result = new ArrayList<>();

        while (ptr < arr.length && arr[ptr] != null) {
            result.add(arr[ptr]);
            ptr++;
        }

        return result;
    }
}