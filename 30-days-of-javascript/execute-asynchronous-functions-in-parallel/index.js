/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = function (functions) {
  return new Promise((resolve, reject) => {
    const results = [];
    let resolvedCount = 0;
    const totalPromises = functions.length;

    functions.forEach((fn, index) => {
      fn()
        .then((result) => {
          results[index] = result;
          resolvedCount += 1;
          if (resolvedCount === totalPromises) {
            resolve(results);
          }
        })
        .catch((error) => {
          reject(error);
        });
    });
  });
};

/**
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */
