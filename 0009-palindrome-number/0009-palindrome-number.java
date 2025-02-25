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
        while(n>0){
            rev=rev*10+(n%10);
            n = n/10;
        }
        if(rev==x)
            return true;
        return false;
    }
}

//Beats 100% of java users in Time Complexity
//Beats 73% of java users in Space Complexity