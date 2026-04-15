class Solution {
    public String largestNumber(int[] nums) {
        String largests="";
        int largest=Integer.MAX_VALUE;
        for(int i=0;i<=largestNumber(nums).length();i++){
            if(nums[i]>largest)
            largest=nums[i];
largests=largest+largests;
        }
        return largests;
    }
    public static void main(String[] args) {
        System.out.println(largestNumber());
    }
}