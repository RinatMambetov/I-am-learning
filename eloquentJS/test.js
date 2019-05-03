function multiple(n) {
  return result => result * n;
}

const twice = multiple(4);
console.log(twice(2));