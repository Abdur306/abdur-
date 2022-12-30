//largest subarray sum
import java.util.*;
public class largesubarrsum {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int temp=0;
        int hold=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            int k=0;
            for(int j=i;j<arr.length;j++){
                k+=arr[j];
                if(temp<k){
                    temp=k;
                    hold=i;
                    count=j;
                }
            }

        }
        System.out.println(temp);
        System.out.print("largest subarray sum:");
     //   System.out.println(hold+":I");
       // System.out.println(count+":J");
        for(int i=hold;i<=count;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}