const fact = (n) => {
  let result = 1;
  if (n <= 1) return result;
  result = n * fact(n - 1);
  return result;
};

console.log(fact(5));
