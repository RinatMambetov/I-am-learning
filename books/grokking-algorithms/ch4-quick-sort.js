const arr = Array.from({ length: 20 }, (x, i) => i + 1);
arr.sort(() => Math.random() - 0.5);
console.log(arr);

const quickSort = (array) => {
  if (array.length < 2) return array;
  const pivot = array[0];
  const more = [];
  const less = [];
  array.forEach((element) => {
    if (element > pivot) more.push(element);
    if (element < pivot) less.push(element);
  });

  const result = [...quickSort(less), pivot, ...quickSort(more)];
  return result;
};

console.log(quickSort(arr));
