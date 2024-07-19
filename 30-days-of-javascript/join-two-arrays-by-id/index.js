/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function (arr1, arr2) {
  const mergedObj = {};

  for (const item of [...arr1, ...arr2]) {
    mergedObj[item.id] = { ...mergedObj[item.id], ...item };
  }

  return Object.values(mergedObj).sort((a, b) => a.id - b.id);
};
