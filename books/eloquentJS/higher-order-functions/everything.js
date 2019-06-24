function every(array, test) {
  for(let item of array) {
    if (!test(item)) return false;
  }
  return true;
}

function every2(array, test) {
  return array.every(test);
}

function every3(array, test) {
  return !array.some(item => !test(item));
}

console.log(every([1, 3, 5], n => n < 10));
console.log(every([2, 4, 16], n => n < 10));
console.log(every([], n => n < 10));
console.log("===");
console.log(every2([1, 3, 5], n => n < 10));
console.log(every2([2, 4, 16], n => n < 10));
console.log(every2([], n => n < 10));
console.log("===");
console.log(every3([1, 3, 5], n => n < 10));
console.log(every3([2, 4, 16], n => n < 10));
console.log(every3([], n => n < 10));