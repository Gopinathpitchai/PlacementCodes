// There is a stream of n (idKey, value) pairs arriving in an arbitrary order, where idKey is an integer between 1 and n and value is a string. No two pairs have the same id.

// Design a stream that returns the values in increasing order of their IDs by returning a chunk (list) of values after each insertion. 
// The concatenation of all the chunks should result in a list of the sorted values.

// Implement the OrderedStream class:

// OrderedStream(int n) Constructs the stream to take n values.
// String[] insert(int idKey, String value) Inserts the pair (idKey, value) into the stream, then returns the largest possible chunk of currently inserted values that appear next in the order.

import java.util.*;

class OrderedStream {
    private String[] stream;
    private int ptr;

    // Constructor
    public OrderedStream(int n) {
        stream = new String[n + 1]; // 1-based indexing
        ptr = 1;
    }

    // Insert method
    public List<String> insert(int idKey, String value) {
        stream[idKey] = value;
        List<String> result = new ArrayList<>();

        while (ptr < stream.length && stream[ptr] != null) {
            result.add(stream[ptr]);
            ptr++;
        }

        return result;
    }
}

public class LeatCode {
    public static void main(String[] args) {

        OrderedStream os = new OrderedStream(5);

        System.out.println(os.insert(3, "ccccc"));
        System.out.println(os.insert(1, "aaaaa"));
        System.out.println(os.insert(2, "bbbbb"));
        System.out.println(os.insert(5, "eeeee"));
        System.out.println(os.insert(4, "ddddd"));

    }
}