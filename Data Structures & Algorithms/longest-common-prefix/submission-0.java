class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str= "";
        int n = strs.length-1;
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i)!=strs[n].charAt(i)){
                break;
            }
            else{
                str+=strs[0].charAt(i);
            }
        }
        return str;
    }
}