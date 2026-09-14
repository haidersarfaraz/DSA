class Solution {
    public int subarraySum(int[] arr, int s) {
          int n=arr.length;
        Map<Integer,Integer> mp=new HashMap<>();
        int preSum=0,cnt=0;
        mp.put(0,1);
        for(int i=0;i<n;i++){
            preSum+=arr[i];
            int remove=preSum-s;
            cnt+=mp.getOrDefault(remove,0);
            mp.put(preSum, mp.getOrDefault(preSum,0)+1);
        }    
        return cnt;
    }
    
}