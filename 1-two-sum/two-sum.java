class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }    
    public static void main(String[] args){
        Solution obj=new Solution();
        int[] nums={3,4,5,6,7,8,9};
        int target=17;
        int[] result=obj.twoSum(nums,target);
        System.out.print("target found in position:"+result[0]+","+result[1]);
    }
}