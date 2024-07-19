/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
  const result = [];

  for (const item of arr) {
    if (n > 0 && Array.isArray(item)) {
      result.push(...flat(item, n - 1));
    } else {
      result.push(item);
    }
  }

  return result;
};
