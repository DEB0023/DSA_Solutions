class Solution
{
    public static int removeDuplicates(int[] nums) 
    {
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String Args[])
    {
        int nums[]={1,1,2,3,4,4,5,5};
        int newarray=removeDuplicates(nums);
        for(int i=0;i<newarray;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}