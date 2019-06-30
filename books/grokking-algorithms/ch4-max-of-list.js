const list = Array.from({ length: 10 }, (x, i) => i + 1);
list.sort(() => Math.random() - 0.5);
console.log(list);

const max = (array) => {
  if (array.length === 2) {
    if (array[0] > array[1]) return array[0];
    return array[1];
  }

  const subList = array.slice(1);
  if (array[0] > max(subList)) return array[0];
  return max(subList);
};

console.log(max(list));
