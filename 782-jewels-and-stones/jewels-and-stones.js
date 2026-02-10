/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    let set = new Set();
    for(let i = 0; i < jewels.length; i++){
        set.add(jewels[i]);
    }
    let ans = 0;
    for(let j = 0; j < stones.length; j++){
        if(set.has(stones[j])){
            ans++;
        }
    }
    return ans;
};