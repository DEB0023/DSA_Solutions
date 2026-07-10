class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        //int start=-1;
      //  int end=-1;
         int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            //if (sum==0){start=i};
            sum+=nums[i];
            if(sum>max){
                max=sum;
                //end=i;
            }
            if(sum<0){
                sum=0;
            }
        } 
        return max;
        //system.out.print(new nums1={start,end});
    }
}