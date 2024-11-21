import java.util.Arrays;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;


public class Utilities {

    public int[] twoSum(int[] nums, int target){
        int numLength = nums.length;
        for(int i = 0; i < numLength; i++){
            for(int j = i+1; j< numLength; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }
        int reversedNum = 0;
        int temp = x;
        while (temp != 0){
            int digit = temp % 10;
            reversedNum = reversedNum * 10 + digit;
            temp /= 10;
         }

         return (reversedNum == x);
    }

    public String longestCommonPrefix(String[] strs){   
        StringBuilder answer = new StringBuilder();
        Arrays.sort(strs);
        System.out.println("Sorted array: " + Arrays.toString(strs));
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i = 0; i < Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                return answer.toString();
            }

            answer.append(first.charAt(i));
        }
        return answer.toString();
    }   
    
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for(char c : s.toCharArray()){
            System.out.println("1== value of c: " + c);
            if(map.containsValue(c)){
                stack.push(c);
                System.out.println("2==== stack: " + stack);
            }else if (map.containsKey(c)){
                System.out.println("3====== map.get c: " + map.get(c));
                if(stack.isEmpty() || map.get(c) != stack.pop()){
                    System.out.println("4.1======== map.get c: " + map.get(c));
                    System.out.println("4.2======== stack.pop: " + stack.pop());
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public int removeDuplicates(int[] nums){
        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public int removeElement(int[] nums, int val){
        int index = 0;
        for(int pointer = 0; pointer < nums.length; pointer++){
            if(nums[pointer] != val){
                nums[index] = nums[pointer];
                index++;
            }
        }
        return index;
    }

    public int lengthOfLastWord(String s){
        String s1 = s.trim();
        int count = 0;
        int end = s1.length()-1;
        while (end >= 0 && s1.charAt(end) != ' '){
            count++;
            end--;
        }
        return count;
    }

    public int maxProfit(int[] prices){
        int buyPrice = prices[0];
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            }
            profit = Math.max(profit, prices[i] - buyPrice);
        }
        return profit;
    }

    public int[] bubbleSort(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("i:" + i);
            System.out.println("Value of i:" + nums[i]);

            
            for (int j = 0; j < n - i - 1; j++) {

                System.out.println("j:" + j);
                System.out.println("Value of j:" + nums[j]);
                // Print current positions and values
                System.out.println("  Comparing nums[" + j + "] = " + nums[j] + " and nums[" + (j + 1) + "] = " + nums[j + 1]);
    
                if (nums[j] > nums[j + 1]) {
                    // Swap nums[j] and nums[j + 1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    
                    System.out.println("num[j] > nums[j+1]. SWAPPED");
                } else {
                    System.out.println("  No swap needed");
                }
            }
    
            // Print the array after each pass
            System.out.print("Array after pass " + (i + 1) + ": ");
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        return nums;
    }

    public int[] plusOne(int[] digits){
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] +1 != 10){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public int climbStairs(int n){
        if (n <= 1) return 1;

        int oneStepBefore = 1;
        int twoStepsBefore = 1;
        int allWays = 0;
    
        for (int i = 2; i <= n; i++) {
            System.out.println("");
            System.out.println("===== Iteration: " + i);
            System.out.println("allWay: " + allWays);
            System.out.println("oneStepBefore: " + oneStepBefore);
            System.out.println("twoStepsBefore: " + twoStepsBefore);
            allWays = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = allWays;
        }
    
        return allWays;
    }

    // Normal
    public String reversedString(String s){
        StringBuilder reversedString = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            reversedString.append(s.charAt(i));
        }
        return reversedString.toString();
    }

    // More optimized
    public String reversedStringOptimized(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
    
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
    
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
    
            left++;
            right--;
        }
    
        return new String(chars);
    }

    public int largestSum(int[] nums){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length; i++){
            currentSum += nums[i];
            maxSum = Math.max(currentSum, maxSum);

            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public int[] twoSumOptimized(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i]; // Calculate the complement
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i}; // if complement is in the map, return the indices
            }
            map.put(nums[i], i); // if complement is not found, store the number and its index
        }
        // if no solution found, throw the problem
        throw new IllegalArgumentException("No solution found");
    }
    
    public Character nonRepeating(String s){
        if(s.length() == 0){ return null; }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1); //if character exists, increase count
            } else {
                map.put(c, 1); // if character doesn't exist, increase count to 1 
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){ // at any key, check the count, if = 1 then it's the non repeated
                return s.charAt(i);
            }
        }
        return null;
    }

    public boolean isAnagram(String a, String b){
        // Check if length are the same
        if(a.length() != b.length()){return false;}

        // Create a Hashmap, add Character of String 1 and count the appearance
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(char c: a.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c,0) + 1);
        }

        // Compare with String 2, then substract character frequency
        for(char c: b.toCharArray()){
            if(!charCount.containsKey(c)){
                return false;   // charCount doesnt contain character --> False
            }
            charCount.put(c, charCount.get(c) - 1); // If character found, decrease the frequency
            if(charCount.get(c) == 0) {
                charCount.remove(c);  // when character frequency == 0, remove it out of hashmap
            }
        }
        if(charCount.isEmpty()){
            return true;
        }
        return false;
    }
}
