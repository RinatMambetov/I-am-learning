const arr = Array.from({ length: 10 }, (x, i) => i);
arr.sort(() => Math.random() - 0.5);
console.log(arr);

const amount = (array) => {
  let result = 0;
  if (array.length === 0) return 0;
  array.pop();
  result = 1 + amount(array);
  return result;
};

console.log(amount(arr));
