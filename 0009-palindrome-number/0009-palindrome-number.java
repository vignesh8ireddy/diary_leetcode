class Solution {
    public boolean isPalindrome(int x) {
        String st = Integer.toString(x);
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