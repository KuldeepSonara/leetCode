class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> rowVal = new ArrayList<>();
        long comb = 1;

        for(int j=0; j<=rowIndex; j++) {

            rowVal.add((int) comb);
            
            comb = comb*(rowIndex - j) / (j + 1);
        }
        return rowVal;
    //    List<Integer> row = new ArrayList<>();
    //    row.add(1);

    //    for(int i=1; i <= rowIndex; i++){
    //     for(int j=row.size()-1; j>0;j--){
    //         row.set(j, row.get(j)+ row.get(j-1));
    //     }
    //     row.add(1);
    //    }
    //    return row;
    }
}