/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let ta=[];
    for(let i=0;i<arr.length;i++){
        if(fn(arr[i], i)){
            ta.push(arr[i])
        }
    }
    return ta;
    
};