const range = (start, end, step = 1) => {
  let result = [];
  if (end > start) {
    for (let i = start; i <= end; i += step) {
      result.push(i);
    }
  } else {
    for (let i = start; i >= end; i += step) {
      result.push(i);
    }
  }
  return result;
}

const sum = array => {
  let result = 0;
  for (let item of array) {
    result += item;
  }
  return result;
}

console.log(range(1, 10));
console.log(range(5, -2, -1));
console.log(sum(range(1, 10, 4)));