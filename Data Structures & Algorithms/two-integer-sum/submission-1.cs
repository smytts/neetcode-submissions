public class Solution {
    public int[] TwoSum(int[] nums, int target)
    {
        Dictionary<int, int> dict = new Dictionary<int, int>();
        for (int i = 0; i < nums.Length; i++) 
        {
            dict[nums[i]] = i;
        }
        
        for (int i = 0; i < nums.Length; i++)
        {
            int x = nums[i];
            int diff = target - x;
            
            if (dict.ContainsKey(diff) && dict[diff] != i)
            {
                return new int [] {i, dict[diff]};
                }
            }
            
            return new int [0];
            }
            }
