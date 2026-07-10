class Solution {
    public int singleNumber(int[] nums) {
     int xor=0;
    for(int i=0;i<nums.length;i++)
    {
        xor=xor^nums[i];
    } 
    return xor;
    }
    public  void main(String Args[]){
        int nums[]={1,1,2,2,3,3,4};
        System.out.print(singleNumber(nums));
    }
}