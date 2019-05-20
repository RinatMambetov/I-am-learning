/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
* */
function getSecondLargest(nums) {
  // Complete the function
  const newNums = nums.sort((x, y) => x > y);
  const max = newNums[newNums.length - 1];
  do {
    newNums.pop();
  } while (newNums[newNums.length - 1] === max);
  return newNums[newNums.length - 1];
}

console.log(getSecondLargest(1, 3, 2));
