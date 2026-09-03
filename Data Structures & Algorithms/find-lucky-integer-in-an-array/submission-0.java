class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm =new HashMap<>();

        for(int n:arr){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        int max = -1;
        for(int key:hm.keySet()){
            if(key == hm.get(key)){
                max = Math.max(max,key);
            }
        }

        return max;
    }
}