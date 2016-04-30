import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    s.test();
  }
  
  public void test() {
    SubstrChecker s1 = new SubstrChecker("computer");
    if(s1.isSubstring("comp")) {
      System.out.println("true");
    }
    StrCompressor str1 = new StrCompressor();
    //System.out.println(str1.compress("aabb"));
    //System.out.println(str1.compress("bbbdddddddeeff00"));
    intFinder f = new intFinder();
    System.out.println(f.binarySearch(14));
  }
  
  
  /* Question 1 */ 
  class SubstrChecker {
    private String str;
    
    public SubstrChecker(String s){
      str = s;
    }
    
    // Returns True if the given string s is a substring of its private string 'str'
    public boolean isSubstring(String s) {
        return str.contains(s);
    }
  }
  
  
  
  
  
  class intFinder {
    private int[] arr = {1, 2, 4, 7, 10, 11, 13, 14, 15, 18};
    
    // Returns the index of 'target' in the arr
    public int binarySearch(int target) {
      int low = 0;
      int high = 9;
      
      while(low != high) {
        int mid = (low+high)/2;
        if(target == arr[mid]) {
          return mid;
        }
        else if(target < arr[mid]) {
          high = mid-1;
        }
        else {
          low = mid + 1;
        }
      }
      
      if (target == arr[low]) {
        return low;
      } else {
        return -1;
      }
      
      
      return binarySearchHelper(target, 0, 9);
    }
    
    public int binarySearchHelper(int target, int low, int high) {
      if(low == high) {
        if(target == arr[low]) {
          return low;
        }
        else {
          return -1;
        }
      }
      else {
        int mid = (low+high)/2;
        if(target == arr[mid]) {
          return mid;
        }
        else if(target < arr[mid]) {
          return binarySearchHelper(target, low, mid-1);
        }
        else {
          return binarySearchHelper(target, mid+1, high);
        }
      }
    }
    
  }
  
  class StrCompressor {
    // Returns a "compressed" version of the string
    // Example) 
    // StrCompressor s = new StrCompressor();
    // s.compress("aabbcccdd") -> should return a2b2c3d2
    // s.compress("aaaabbbdddddde") -> should return a1b3d6e1
    public String compress(String s) {
      char[] c = s.toCharArray();
      String result = "";
      char charac = c[0];
      int count = 0; 
      
      for (int i = 0; i < c.length; i++) {
        char character = c[i];
        if(character != charac){
          result += charac;
          result += Integer.toString(count);
          count = 1;
          charac = character;
        }
        else {
          count++;
        }
        if(i == c.length-1) {
          result += charac;
          result += Integer.toString(count);
          count = 1;
          charac = character;
        }
      }
      return result;
    }
  }
}
