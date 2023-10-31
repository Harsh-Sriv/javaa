import java.util.Scanner;
class solution
 {
    public int[] twoSum(int[] nums, int target) {
        int sum;
        int a[]=new int[2];
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            for (int c=1;c<l;c++)
            {
                sum=nums[i]+nums[c];
                if(sum==target)
                {
                    a[0]=i;
                    a[1]=c;
                }
                if(sum==target)
                break;
            }
        }
        return a;
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the number of elements in the array.");
        int l=sc.nextInt();
        int arr[]=new int[l];
        for (int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        twoSum(arr,n);
        sc.close();
    }
}