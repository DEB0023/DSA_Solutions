class Solution {

    public int[] searchRange(int[] nums, int target) {
        int LB=lowerbound(nums,target);
        int UB=upperbound(nums,target);
       // return new int[]{LB,UB};
        if(LB==-1||UB==-1)
        {
            return new int[]{-1,-1};
        }
         return new int[]{LB,UB};
        }
        public int upperbound(int[] nums,int target)
        {
            int low=0;
            int high=nums.length-1;
            int ans2=-1;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(target==nums[mid])
                {
                    ans2=mid;
                    low=mid+1;
                }
                else if(nums[mid]>target){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }

            }
            return ans2;
        }
    int lowerbound(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans1=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(target==nums[mid])
            {
                ans1=mid;
                high=mid-1;

            }
            else if(target>nums[mid])
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans1;
    }
}