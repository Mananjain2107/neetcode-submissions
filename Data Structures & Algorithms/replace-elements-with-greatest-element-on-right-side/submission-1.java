class Solution {
    public int[] replaceElements(int[] arr) {
        int nums[] = new int[arr.length];
        int value = -1;

        for(int i=nums.length-2;i>=0;i--){
            value = Math.max(value,arr[i+1]);
            System.out.println(value);
            nums[i] = value;
        }
        nums[nums.length-1] = -1;
        return nums;
    }
}