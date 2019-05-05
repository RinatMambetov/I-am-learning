const reverseArray = array => {
  let result = [];
  for (let item of array) {
    result.unshift(item);
  }
  return result;
}

const reverseArrayInPlace = array => {
  for (let i = 0; i < Math.floor(array.length / 2); i++) {
    let item = array[i];
    array[i] = array[array.length - 1 - i];
    array[array.length - 1 - i] = item;
  }
}

console.log(reverseArray(["A", "B", "C"]));

let arrayValue = [1, 2, 3, 4, 5, "a"];
reverseArrayInPlace(arrayValue);
console.log(arrayValue);
