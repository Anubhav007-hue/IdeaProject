public class TrappingRainWater {
public static void main(String[] args) {


    int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
    int maxArea=trap(arr);
    System.out.println(maxArea);
}

    public static int trap(int[] height) {
    int n=height.length;
    int area=0;

    for(int i=0;i<n;i++)
    {
        int l_Max=findMax(height,0,i);
        int r_Max=findMax(height,i+1,n);
        int sum=Math.min(l_Max,r_Max)-height[i];

        if(sum>0)
        {
            area=area+sum;
        }
    }
    return area;

    }
    public static  int findMax(int[] height,int start,int end )
    {
        int max=0;
        for(int j=start;j<end;j++)
        {
            max=Math.max(height[j],max);
        }

        return max;
    }
}
