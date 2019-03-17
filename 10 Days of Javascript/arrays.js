

/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {
    // Complete the function
    nums = nums.sort( (x, y) => x > y );
    let max = nums[nums.length - 1];
    do {
        nums.pop();
    } while (nums[nums.length - 1] === max);
    return nums[nums.length - 1];
}

