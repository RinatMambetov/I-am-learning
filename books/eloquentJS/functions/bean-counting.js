const countChar = (s, c) => {
  let count = 0;
  for (let i = 0; i < s.length; i++) {
    if (s[i] == c) count++;
  }
  return count;
}

const countBs = s => countChar(s, "B");

console.log(countBs("BBCB"));
console.log(countChar("kakkerlak", "k"));