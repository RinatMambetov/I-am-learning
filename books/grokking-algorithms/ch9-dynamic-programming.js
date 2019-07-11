const createMatrix = (row, col) => {
  const matrix = new Array(row);
  for (let i = 0; i < matrix.length; i += 1) {
    matrix[i] = new Array(col).fill(0);
  }
  return matrix;
};

// console.log(createMatrix(4, 5));

const substring = (r, c) => {
  const cell = createMatrix(r.length + 1, c.length + 1);
  let lastCell = 0;
  let lastSubIndex = 0;

  for (let i = 1; i <= r.length; i += 1) {
    for (let j = 1; j <= c.length; j += 1) {
      if (r[i - 1] === c[j - 1]) {
        cell[i][j] = cell[i - 1][j - 1] + 1;

        if (cell[i][j] > lastCell) {
          lastCell = cell[i][j];
          lastSubIndex = i;
        } else cell[i][j] = 0;
      }
    }
  }

  return console.log(r.slice(lastSubIndex - lastCell, lastSubIndex));
};

substring('fish', 'hish');

const subsequence = (r, c) => {
  const cell = createMatrix(r.length + 1, c.length + 1);

  for (let i = 1; i <= r.length; i += 1) {
    for (let j = 1; j <= c.length; j += 1) {
      if (r[i - 1] === c[j - 1]) {
        cell[i][j] = cell[i - 1][j - 1] + 1;
      } else {
        cell[i][j] = Math.max(cell[i - 1][j], cell[i][j - 1]);
      }
    }
  }

  return console.log(cell[r.length][c.length]);
};

subsequence('fish', 'sosh');
