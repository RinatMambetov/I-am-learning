let size = 12;
let chessboard = "";
for (let r = 1; r <= size; r++) {
  for (let c = 1; c <= size; c++) {
    if ( (r + c) % 2 == 0 ) chessboard += " ";
      else chessboard += "#";
  }
  chessboard += "\n";
}
console.log(chessboard);