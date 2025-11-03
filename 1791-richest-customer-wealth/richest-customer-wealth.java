class Solution {
    public int maximumWealth(int[][] accounts) {
        int RichestWealth=0;
        for(int i=0;i<accounts.length;i++){
            int Wealth=0;
            for(int j=0;j<accounts[0].length;j++){
                Wealth = Wealth + accounts[i][j];
                if(Wealth>=RichestWealth){
                    RichestWealth=Wealth;
                }
            }
        }
        return RichestWealth;
    }
}