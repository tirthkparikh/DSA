/**
 * @param {number[]} cost
 * @return {number}
 */
var minCostClimbingStairs = function(cost) {
    let min = [0,0];
    for(let i =2; i <= cost.length; i++){
        min[i] = Math.min(min[i-1] + cost[i-1], min[i-2] + cost[i-2]);
    }
    return min[cost.length]
};