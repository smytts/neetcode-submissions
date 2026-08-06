class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1; //  shift n to the right and logic AND with 1
            res |= (bit << (31 - i)); // shift left and logic OR the bit
        }
        return res;
    }
}
