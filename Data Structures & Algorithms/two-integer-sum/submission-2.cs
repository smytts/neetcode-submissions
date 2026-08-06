public class Solution {
    public int[] TwoSum(int[] nums, int target)
    {
        Dictionary<int, int> dict = new Dictionary<int, int>();

for (int i = 0; i < nums.Length; i++)
{
    int x = nums[i];
    int diff = target - x;
    if (dict.TryGetValue(diff, out int value) && value != i)
    {
        return new int [] {dict.GetValueOrDefault(diff), i};
    }

    dict.Add(x, i);
}

return new int[0];
            }
            }
