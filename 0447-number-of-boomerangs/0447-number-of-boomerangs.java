import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate through each point in the points array
        for (int i = 0; i < points.length; i++) {
            // Clear the map for each new point
            map.clear();
            
            // Iterate through each other point in the points array
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue; // Skip the same point
                
                // Calculate the squared distance between the current point and the other point
                int d = distance(points[i], points[j]);
                
                // Update the count of occurrences of the distance in the map
                map.put(d, map.getOrDefault(d, 0) + 1);
            }
            
            // For each distance in the map, calculate the number of boomerangs that can be formed
            // and add it to the result
            for (int val : map.values()) {
                res += val * (val - 1);
            }
        }
        
        return res;
    }

    // Method to calculate the squared Euclidean distance between two points
    private int distance(int[] p, int[] q) {
        int dx = p[0] - q[0];
        int dy = p[1] - q[1];
        return dx * dx + dy * dy;
    }
}
