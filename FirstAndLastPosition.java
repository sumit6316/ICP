package Assignment1;

public class FirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        return search_Range(nums,target);
    }
    public static int[] search_Range(int [] arr,int target){
        int l=binary_search(arr, target, true);
        int r=binary_search(arr, target, false);
        return new int[] {l,r};
    }

     public static int binary_search(int arr[],int item,boolean first){
        int ans=-1;
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==item){
                ans=mid;
                if(first){
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }else if(item>arr[mid]){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
            
        }
        return ans;

    }
}
