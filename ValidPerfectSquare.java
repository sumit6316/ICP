package Day2;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        return check_perfect_square(num);
    }
    public static boolean check_perfect_square(int num){
        long lo=1,hi=num;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if((mid*mid)==num){
                return true;
            }else{
                if((mid*mid)>num){
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }
        }return false;

    }
}
