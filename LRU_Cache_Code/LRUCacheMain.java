public class LRUCacheMain {
    public static void main(String[] args) {
        // Define operations
        String[] ops = {"LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"};
        
        // Define values for each operation
        int[][] vals = {
            {2},      // LRUCache(2)
            {1, 1},   // put(1,1)
            {2, 2},   // put(2,2)
            {1},      // get(1)
            {3, 3},   // put(3,3)
            {2},      // get(2)
            {4, 4},   // put(4,4)
            {1},      // get(1)
            {3},      // get(3)
            {4}       // get(4)
        };

        List<String> output = new ArrayList<>();
        LRUCache cache = null;

        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "LRUCache":
                    cache = new LRUCache(vals[i][0]);
                    output.add("null");
                    break;
                case "put":
                    cache.put(vals[i][0], vals[i][1]);
                    output.add("null");
                    break;
                case "get":
                    int res = cache.get(vals[i][0]);
                    output.add(String.valueOf(res));
                    break;
            }
        }

        System.out.println(output);
    }
}