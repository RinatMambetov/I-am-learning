const getRandomInt = max => Math.floor(Math.random() * Math.floor(max)) + 1;

const arr = [];
for (let i = 1; i <= 10; i += 1) {
  const item = getRandomInt(100);
  arr.push(item);
}

console.log(arr);

const getMin = (array) => {
  let min = array[0];
  let index = 0;

  for (let i = 0; i < array.length; i += 1) {
    if (array[i] < min) {
      index = i;
      min = array[i];
    }
  }
  return index;
};

// console.log(getMin(arr));

const selectionSort = (array) => {
  const sortedArray = [];
  const len = array.length;
  for (let i = 0; i < len; i += 1) {
    const removed = array.splice(getMin(array), 1);
    sortedArray.push(removed[0]);
  }
  return sortedArray;
};

console.log(selectionSort(arr));
