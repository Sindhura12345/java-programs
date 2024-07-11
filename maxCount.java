import java.util.Arrays;

public class maxCount {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,5,2,3,2};
        System.out.println(Arrays.toString(maxi(arr)));
    }
    public static int[] maxi(int arr[])
    {
        int count=1;
        int maxcount=1;
        int maxEle = arr[0];
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
            }
            else{
                if(maxcount < count){
                    maxcount = count;
                    maxEle = arr[i-1];
                }
                count=1;
            }
        }
        return new int[]{maxcount, maxEle};

    }
}
