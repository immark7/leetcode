/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function (arr, fn) {
  const result = [];
  arr.forEach((element, index) => result.push(fn(element, index)));
  return result;
};
