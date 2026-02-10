/**
 * @param {string} s
 * @return {number}
 */
var maxFreqSum = function(s) {
    let map = new Map();
    for(let i = 0; i < s.length;i++){
        if(map.has(s[i])){
            map.set(s[i],map.get(s[i]) + 1);
        }
        else{
            map.set(s[i],1);
        }
    }
    let vowels = ["a",'e','i','o','u'];
    let maxVowels = 0;
    let maxConstants = 0;
    for(let i = 0; i < s.length; i++){
        if(vowels.includes(s[i])){
            if(maxVowels < map.get(s[i])){
                maxVowels = map.get(s[i]);
            }
        }
        else{
            if(maxConstants < map.get(s[i])){
                maxConstants = map.get(s[i]);
            }
        }
    }
    return maxVowels + maxConstants;
};