package Week_1.Day_5;

/*

Problem: Longest Common Prefix

Approach:
Assume the first string is the common prefix.

Compare this prefix with every other string.
While the current string does not start with the prefix,
remove the last character from the prefix.

Keep shrinking the prefix until it matches the 
beginning of the current string.

If the prefix becomes empty,
there is no common prefix.

Time Complexity: O(n*m)
where n=numbers of strings
and m= Length of the shortest string 

Space Complexity: O(1)

*/

public class LongestCommonPrefix {
    
     public String longestCommonPrefix(String[] strs) {
        
        if(strs==null || strs.length==0){
            return "";
        }

        String prefix=strs[0];

        for(int i=1;i<strs.length;i++){

            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

}
