package day1;

class IsPalindrome {
  
  static boolean check (String word) {
    char[] chars = word.toCharArray();
    int len = chars.length;
    boolean yes = true;
    
    for(int i = 0; i < len; i++) {
      if (chars[i] != chars[len - 1 - i]) {
        yes = false;
        break;
      }
    }
    
   return yes;
  }
}