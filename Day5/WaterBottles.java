package Day5;

public class WaterBottles {
    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;
        System.out.println(numWaterBottles(numBottles,numExchange));
    }
    public static int numWaterBottles(int numBottles, int numExchange) {
        int drunk = numBottles;
        while(numBottles>=numExchange){
            int q = numBottles/numExchange;
            int r = numBottles%numExchange;
            drunk = drunk+q;
            numBottles = q+r;
        }
        return drunk;
        
    }
}
