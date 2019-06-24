let arrays = [[1, 2, 3], [4, 5], [6], [7, 8, 9]];

// let result = arrays.reduce( (sum, current) => {
//   sum = sum.concat(current);
//   return sum;
// });

let result = arrays.reduce ( (flat, current) => 
  flat.concat(current), [] );

console.log(result);