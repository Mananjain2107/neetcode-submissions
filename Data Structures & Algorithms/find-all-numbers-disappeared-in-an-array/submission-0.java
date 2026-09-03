class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ls =new ArrayList<>();
        HashSet<Integer> hs =new HashSet<>();

        for(int num:nums){
            hs.add(num);
        }

        for(int i=0;i<nums.length;i++){
            if(!hs.contains(i+1)){
                ls.add(i+1);
            }
        }

        return ls;
    }
}