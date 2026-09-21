class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        } 

        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(!hm.containsKey(c)) return false;
            else{
                hm.put(c,hm.getOrDefault(c,0)-1);
            }
        }

        for(char key:hm.keySet()){
            // if(hm.size()==0) return true;
            if(hm.get(key)!=0) return false;
        }
        return true;
    }
}
