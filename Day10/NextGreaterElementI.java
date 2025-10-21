import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n2 = nums2.length;
        int n1 = nums1.length;
        int ans1[] = new int[n1];
        int ans2[] = new int[n2];
        for(int i=0; i<n2;i++){
            while(!st.isEmpty() && nums2[i]>=nums2[st.peek()]){
                ans2[st.pop()]=nums2[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans2[st.pop()]=-1;
        }
        for(int i = 0;i<n1 ;i++){
            for(int j = 0;j<n2;j++){
                if(nums1[i] == nums2[j]){
                    ans1[i]=ans2[j];
                }
            }
        }
        return ans1;

    }
}
