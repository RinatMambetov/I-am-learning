const arr = Array.from({ length: 6 }, (x, i) => i);
arr.sort(() => Math.random() - 0.5);
console.log(arr);

const sum = (array) => {
  let result = 0;
  if (array.length === 0) {
    return 0;
  }
  result = array.pop() + sum(array);
  return result;
};

console.log(sum(arr));
