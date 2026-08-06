public class Solution {
    public bool IsInterleave(string s1, string s2, string s3) {
        return DFS(0, 0, 0);

bool DFS(int i, int j, int k)
{
    if (k == s3.Length) return i == s1.Length && j == s2.Length;

    if (i < s1.Length && s1[i] == s3[k])
    {
        if (DFS(i + 1, j, k + 1)) return true;
    }

    if (j < s2.Length && s2[j] == s3[i + j])
    {
        if (DFS(i, j + 1, k + 1)) return true;
    }

    return false;
}
    }
}
