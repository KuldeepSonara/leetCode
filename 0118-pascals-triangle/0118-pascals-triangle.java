import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        // Base case: first row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        
        // Generate each subsequent row
        for(int i = 1; i < numRows; i++) {
            List<Integer> preRow = result.get(i - 1);
            List<Integer> row = new ArrayList<>();
            
            // First element of each row is always 1
            row.add(1);
            
            // Fill the middle elements of the row
            for(int j = 1; j < i; j++) {
                row.add(preRow.get(j - 1) + preRow.get(j));
            }
            
            // Last element of each row is always 1
            row.add(1);
            
            // Add the generated row to the result
            result.add(row);
        }
        
        return result;
    }
}
