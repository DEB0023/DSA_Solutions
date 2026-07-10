import java.util.*;
public class Solution {
    public static void main(String[] args)
    {
        isPalindrome(222);
    }
    public static boolean isPalindrome(int number) 
    {
        /*system.out.print("Enter a number:")
        Scanner sc =new Scanner(system.in)
        int number=sc.nextInt;
        //system.out.print("Enter a number:")*/
        int revnumber=0;
        int temp=number;
        while(temp>0)
        {
            int remainder=temp%10;
            revnumber=revnumber*10+remainder;
            temp=temp/10;
        }
        if(number==revnumber)
        {
        System.out.print("number is palindrom");
        return true;
        }
        else
        {
        System.out.print("not a palindrom number");
           return false;
        }

    
    }
}