const binarySearch = (list, item) => {
  let min = 0;
  let max = list.length - 1;

  while (min <= max) {
    const mid = Math.floor((min + max) / 2);
    const guess = list[mid];

    if (guess === item) return mid;
    if (guess < item) min = mid + 1;
    else if (guess > item) max = mid - 1;
  }
  return 'no result';
};

const list = [];
for (let i = 1; i <= 10; i += 1) {
  list.push(i);
}
console.log(binarySearch(list, 11));
