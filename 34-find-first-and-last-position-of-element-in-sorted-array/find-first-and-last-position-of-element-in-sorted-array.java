class Solution {
    int[] nums;
    int target;
    int first = -1;
    int last = -1;
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        this.nums = nums;
        this.target = target;
        firstOccurence(start,end);
        lastOccurence(start,end);
        return new int[]{this.first,this.last};
    }
    public void firstOccurence(int start, int end){

        while(start <= end){
        int mid = start + (end - start)/2;
        if(nums[mid] == target){
            this.first = mid;
            end = mid - 1;
        }
        else if (nums[mid] > target){
            end = mid - 1;
        }
        else{
            start = mid + 1;
        }
        }
    }
    
    public void lastOccurence(int start, int end){

        while(start <= end){
        int mid = start + (end - start)/2;
        if(nums[mid] == target){
            this.last = mid;
            start = mid + 1;
        }
        else if (nums[mid] > target){
            end = mid - 1;
        }
        else{
            start = mid + 1;
        }
        }
    }
}