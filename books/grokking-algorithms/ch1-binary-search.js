const search = (arr, item) => {
  let min = 0;
  let max = arr.length - 1;

  while (min <= max) {
    const mid = Math.floor((min + max) / 2);
    const guess = arr[mid];

    console.log('min ' + min);
    console.log('max ' + max);
    console.log('mid ' + mid);
    console.log('guess ' + guess);

    if (guess === item) {
      return mid;
    }

    if (guess < item) {
      min = mid + 1;
    } else if (guess > item) {
      max = mid - 1;
    }
  }

  return 'no result';
};

const list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

console.log(search(list, 7));
