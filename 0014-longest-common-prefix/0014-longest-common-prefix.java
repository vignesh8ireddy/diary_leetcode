/* Brute Forece Approach
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
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Sort the Array - nlogn
        Arrays.sort(strs);

        //Get the first and last Strings
        String str1 = strs[0];
        String str2 = strs[strs.length-1];

        //Compare the initial characters in the two Strings
        int resLen = 0;
        for(int i=0; i<str1.length(); ++i) {
            if(str1.charAt(i) == str2.charAt(i)) ++resLen;
            else break;
        }

        //return the initial characters which are common in both the Strings 
        return str1.substring(0,resLen);
    }
}

//Time Complexity: Theta(nlogn + m), n=size of the array, m=length of shortest string
//Space Complexity: Theta(n) for sorting