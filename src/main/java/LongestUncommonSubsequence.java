//https://leetcode.com/problems/longest-uncommon-subsequence-i/
public class LongestUncommonSubsequence {
    public static void main(String[] args) {
    LongestUncommonSubsequence longestUncommonSubsequence = new LongestUncommonSubsequence();
    String a="aba";
    String b="cab";
    System.out.println(longestUncommonSubsequence.findLUSlength(a,b));

    }
    public int findLUSlength(String a, String b) {
    return a.equals(b)?-1:Math.max(a.length(),b.length());
    }

}
