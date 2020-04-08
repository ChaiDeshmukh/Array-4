/*
    Arrange the pairs such that we get maximum sum out od this array.
    so, we want to reduce the gap between the elements
    sort them and make pairs of them. In que, we ask to pick min among the two elements
    
    Time: O(nlogn)
    Space: O(1)
*/

class Solution {
    public int arrayPairSum(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return 0;
        
        if(nums.length == 1)
            return nums[0];
        
        Arrays.sort(nums);
        
        int sum = 0;
        
        for(int i=0; i< nums.length; i+=2)
        {
            sum += Math.min(nums[i], nums[i+1]);
        }
        
        return sum;
        
    }
}
