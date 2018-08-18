public class No31{

    public static void main(String[] args){
        int[] arr={1, 3, }
        System.out.println(maxSub(arr));

        }

    private static int maxSub(int[] arr){
        int max=0;
        int n=arr.length;
        int sum=0;

        for (int i=0;i<n;i++){
            sum += arr[i];
            if (sum > max)
                max = sum;
            else if (sum < 0)
                sum = 0;
        }

        return max;
    }
}

