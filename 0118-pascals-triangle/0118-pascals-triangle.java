class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
            }
            return ans;
        }
    public static List<Integer> generateRow(int numrows){
        long ans=1;
        List<Integer> ansRow=new ArrayList<>();
        ansRow.add(1);

        for(int col=1;col<numrows;col++){
            ans=ans*(numrows-col);
            ans=ans/col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }

}