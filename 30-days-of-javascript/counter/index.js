/**
 * @param {number} n
 * @return {Function} counter
 */

/**Closure: a function is defined inside another function
 * and allow variables to persist across multi func calls
 */

var createCounter = function (n) {
  return function () {
    return n++;
  };
};

/**
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */
