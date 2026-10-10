public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        int lowest = prices[0], maxP = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - lowest > maxP) maxP = prices[i] - lowest;
            if (prices[i] < lowest) lowest = prices[i];
        }
        return maxP;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
