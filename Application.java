import java.util.Arrays;
import ListNode;

public class Application{
    public static void main(String[] args){

        Utilities util = new Utilities();

        // ========= TWOSUM ===================================================
        // int[] numArray = {2,7,11,13};
        // int target = 9;
        // int[] result = util.twoSumOptimized(numArray, target);
        // System.out.println("result of twoSum is: " + Arrays.toString(result));

        // // ========= ISPALINDROME ==============================================
        // int x = 121;
        // System.out.println("result of Palindrome is: " + util.isPalindrome(x));

        // // ========= LONGEST COMMON PREFIX =====================================
        // String[] string = {"dog", "racecar", "car"};
        // System.out.println("result of Longest Common Prefix is: " + util.longestCommonPrefix(string));
    
        // // ========= IS VALID PARENTHESIS ======================================
        // String s = "({))}[]";
        // System.out.println("Result is: " + util.isValid(s));

        // // ======== REMOVE DUPLICATES ==========================================
        // int[] nums = new int[]{1,1,3,3,7,8,9};
        // int[] expectedNums = new int[]{1,3,7,8,9};
        // int k = util.removeDuplicates(nums);
        // for(int i = 0; i< k; i++){
        //    if(nums[i] != expectedNums[i]){
        //        System.out.println("Test Failed");
        //    }
        // }
        // System.out.println("Test Passed!!!");
    
        // ========== REMOVE ELEMENTS ==========================================
        // int[] numsArray = new int[]{1,3,3,4,5,6,7,7,7}; // Input array
        // int val = 3; // Value to remove
        // int[] expectedArray = new int[]{1,3,4,5,6,7,7,7}; // The expected answer with correct length.

        // int r = util.removeElement(numsArray, val); // Calls your implementation

        // assert k == expectedArray.length;
        // Arrays.sort(nums, 0, r); // Sort the first k elements of nums
        // for (int i = 0; i < numsArray.length; i++) {
        //    if(numsArray[i] == expectedArray[i]){
        //         System.out.println("Test Passed");
        //    }
        // }

        // ========== LENGTH OF LAST WORD =======================================
        // String ss = "   fly me   to   the moon  ";
        // System.out.println("Length of last word: " + util.lengthOfLastWord(ss));

        // ========== MAX PROFIT =======================================
        // int[] prices = new int[]{7,1,5,3,6,4};
        // System.out.println("Max Profit is: " + util.maxProfit(prices));

        // ========== BUBBLE SORT =======================================
        // int[] nums = {5,3,8,4,2};
        // util.bubbleSort(nums);

        // ========== PLUS ONE =======================================
        // int[] digits1 = new int[]{9,4,2,1};
        // int[] digits2 = new int[]{9,9};
        // System.out.println("Plus one of digits1: " + Arrays.toString(util.plusOne(digits1)));
        // System.out.println("Plus one of digits2: " + Arrays.toString(util.plusOne(digits2)));

        // ========== Climbing Stairs =======================================
        // int n = 4;
        // System.out.println("result: " + util.climbStairs(n));

        // ========== Reverse String =======================================
        // String s = "hello";
        // System.out.println(util.reversedString(s));

        // ========== LARGEST SUM OF ARRAY =======================================
        // int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        // System.out.println(util.largestSum(nums));

        // ========== FIRST NON REPEATING  =======================================
        // String a = new String("aabbcde");
        // System.out.println(util.nonRepeating(a));

        // ========== IS ANAGRAM  =======================================
        // String a = "listen";
        // String b = "silent";
        // String a1 = "triangle";
        // String b1 = "intergal";
        // String a2 = "apple";
        // String b2 = "pale";
        // System.out.println(util.isAnagram(a, b));
        // System.out.println(util.isAnagram(a1, b1));
        // System.out.println(util.isAnagram(a2, b2));
    }
}
