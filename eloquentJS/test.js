function practice (i){
  return i+1;
};
var a = [ -1, 0, 1 ];
var b = [];
var c = [];
console.log(a);
b = a.forEach(practice);
console.log("=====");
console.log(a);
console.log(b);
c = a.map(practice);
console.log("=====");
console.log(a);
console.log(c);