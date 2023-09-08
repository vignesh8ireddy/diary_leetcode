/*
class Solution {
    public boolean isPalindrome(int x) {
        String st = Integer.toString(x);//String st = String.valueOf(x);
        int i = 0;
        int j = st.length()-1;
        while(i<j){
            if(st.charAt(i)!=st.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

//Time Complexity : Theta(1)
//Space Complexity : Theta(1)

*/

//More optimised Approach

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x>0 && x%10==0))
            return false;
        int rev=0;
        int n = x;
        int temp;
        while(n>0){
            temp = n%10;
            rev=rev*10+temp;
            n = n/10;
        }
        if(rev==x)
            return true;
        return false;
    }
}