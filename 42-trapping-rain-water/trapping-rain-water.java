class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int lmax = height[0];
        int rmax = height[height.length-1];
        int water = 0;

        while(left<right){
            if(lmax<rmax){
                left++;
                lmax = Math.max(height[left],lmax);
                water+= lmax- height[left];
            }
            else{
                right--;
                rmax = Math.max(height[right],rmax);
                water+=rmax - height[right];
            }
        }
            return water;
    }
}