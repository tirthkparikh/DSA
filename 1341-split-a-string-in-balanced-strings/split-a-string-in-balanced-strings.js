/**
 * @param {string} s
 * @return {number}
 */
var balancedStringSplit = function(s) {
    let countL = 0;
    let countR = 0;
    let ans = 0;
    for(let i = 0; i < s.length; i++){
        if(s[i] == 'L'){
            countL++;
        }
        else{
            countR++;
        }
        if(countL == countR){
            ans++;
            countL = 0;
            countR = 0;
        }
    }
    return ans;
};