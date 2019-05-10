// const loop = (value, test, update, body) => {
//   if (test(value)) {
//     body(value);
//   } else return false;
//   return loop(update(value), test, update, body);
// }

const loop = (value, test, update, body) => {
  for(let i = value; test(i); i = update(i)) {
    body(i);
  }
}

loop(5, n => n < 10, n => n + 1, console.log);