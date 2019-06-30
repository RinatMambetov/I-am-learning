const dijkstraSearch = (incomingObj) => {
  const processed = [];

  const findLowestCostNode = (costs) => {
    let min = Infinity;
    let result;
    const arr = Object.entries(costs);

    arr.forEach((element) => {
      if (element[1] < min && !processed.includes(element[0])) {
        min = element[1];
        result = element[0];
      }
    });

    return result;
  };

  let node = findLowestCostNode(incomingObj.costs);

  while (node !== 'finish') {
    const cost = incomingObj.costs[node];
    const neighbors = incomingObj.graph[node];

    Object.keys(neighbors).forEach((element) => {
      const newCost = cost + neighbors[element];
      if (incomingObj.costs[element] > newCost) {
        incomingObj.costs[element] = newCost;
        incomingObj.parents[element] = node;
      }
    });

    processed.push(node);
    node = findLowestCostNode(incomingObj.costs);
  }

  // console.log(incomingObj.parents.finish);
  console.log(incomingObj.costs.finish);
};

const example1 = {
  graph: {
    start: { a: 6, b: 2 },
    a: { finish: 1 },
    b: { a: 3, finish: 5 },
    finish: {},
  },
  costs: {
    a: 6,
    b: 2,
    finish: Infinity,
  },
  parents: {
    a: 'start',
    b: 'start',
    finish: undefined,
  },
};

const example2 = {
  graph: {
    start: { a: 5, c: 2 },
    a: { b: 4, d: 2 },
    b: { d: 5, finish: 3 },
    c: { a: 8, d: 7 },
    d: { finish: 1 },
    finish: {},
  },
  costs: {
    a: 5,
    b: Infinity,
    c: 2,
    d: Infinity,
    finish: Infinity,
  },
  parents: {
    a: 'start',
    b: undefined,
    c: 'start',
    d: undefined,
    finish: undefined,
  },
};

const example3 = {
  graph: {
    start: { a: 10 },
    a: { b: 20 },
    b: { c: 1, finish: 30 },
    c: { a: 1 },
    finish: {},
  },
  costs: {
    a: 10,
    b: Infinity,
    c: Infinity,
    finish: Infinity,
  },
  parents: {
    a: 'start',
    b: undefined,
    c: undefined,
    finish: undefined,
  },
};

const example4 = {
  graph: {
    start: { a: 2, b: 2 },
    a: { c: 2, finish: 2 },
    b: { a: 2 },
    c: { b: -1, finish: 2 },
    finish: {},
  },
  costs: {
    a: 2,
    b: 2,
    c: Infinity,
    finish: Infinity,
  },
  parents: {
    a: 'start',
    b: 'start',
    c: undefined,
    finish: undefined,
  },
};

dijkstraSearch(example1);
dijkstraSearch(example2);
dijkstraSearch(example3);
dijkstraSearch(example4);
