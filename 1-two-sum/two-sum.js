/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const hasMap = new Map();
    for(let i = 0; i < nums.length; i++){
        let search = target - nums[i];
        if(hasMap.has(search)){
            return[hasMap.get(search),i];
        }
        hasMap.set(nums[i],i);
    }
};