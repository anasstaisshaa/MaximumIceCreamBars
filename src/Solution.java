import java.util.Arrays;

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int ans = 0;

        Arrays.sort(costs);

        int i = 0;
        while (i < costs.length && coins >0){
            if(coins >= costs[i]){
                coins -= costs[i];
                ans++;
            }
            i++;
        }
        return ans;
    }
}