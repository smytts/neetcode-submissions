class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int emptySpotCounter = flowerbed[0] == 0 ? 1 : 0;

        for (int flower : flowerbed) {
            if (flower == 1) {
                n -= (emptySpotCounter - 1) / 2;
                emptySpotCounter = 0;
            } else {
                emptySpotCounter++;
            }
        }
        n -= emptySpotCounter / 2;
        return n <= 0;
    }
}