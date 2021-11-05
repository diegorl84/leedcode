package arranging_coins;

public class Solution {
    public int arrangeCoins(int n) {
        int level = 0, coin = 1;
        while (n >= coin) {
            n -= coin;
            coin++;
            level++;
        }
        return level;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.arrangeCoins(8));
    }
}


