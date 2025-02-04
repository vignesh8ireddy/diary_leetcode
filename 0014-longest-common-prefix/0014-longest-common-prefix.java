class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int minStr = 0;
        int minLen = strs[0].length();
        String res = "";
        for(int i=1; i<n; i++) {
            if(strs[i].length()<minLen) {
                minStr = i;
                minLen = strs[i].length();
            }
        }
        for(int j=0;j<minLen;j++) {
            boolean flag = true;
            for(int k=0; k<n; k++) {
                if(k==minStr) continue;
                else if(strs[minStr].charAt(j) != strs[k].charAt(j)) {
                    flag = false;
                    break;
                }
                
            }
            if(!flag) break;
            res += strs[minStr].charAt(j);

        }
        return res;
    }
}

//Time Complexity: Theta(m*n), m=length of smallest string, n= length of array
//Space Complexity: Theta(Constant)