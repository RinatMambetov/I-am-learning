// const arrayToList = array => {
//   let list = {};
//   list.value = array[array.length - 1];
//   list.rest = null;
//   for (let i = array.length - 2; i >= 0; i--) {
//     list = {value: array[i], rest: list};
//   }
//   return list;
// }

const arrayToList = array => {
  let list = null;
  for (let i = array.length - 1; i >= 0; i--) {
    list = {value: array[i], rest: list};
  }
  return list;
}

const listToArray = list => {
  let array = [];
  for (let node = list; node; node = node.rest) {
    array.push(node.value);
  }
  return array;
}

// const prepend = (element, list) => {
//   let newList = {};
//   newList.value = element;
//   newList.rest = list;
//   return newList;
// }

const prepend = (element, list) => {
  return {value: element, rest: list};
}

// const nth = (list, position) => {
//   return listToArray(list)[position];
// }

const nth = (list, position) => {
  if (position == 0) return list.value;
  else return nth(list.rest, position - 1);
}

console.log(arrayToList([10, 20, 30]));
console.log(listToArray(arrayToList([10, 20, 30])));
console.log(prepend(10, prepend(20, null)));
console.log(nth(arrayToList([10, 20, 30]), 1));