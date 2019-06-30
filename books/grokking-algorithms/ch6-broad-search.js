const friends = {
  you: ['alice', 'bob', 'claire'],
  bob: ['anuj', 'peggy', 'pegasus'],
  alice: ['peggy'],
  claire: ['tom', 'jonny', 'rinatus'],
  anuj: ['jonny'],
  peggy: ['claire'],
  tom: ['you'],
  jonny: ['bob', 'rinat'],
};

const broadSearch = (you) => {
  const search = [...you];
  const searched = [];
  const isNotSearched = (person) => {
    for (let i = 0; i < searched.length; i += 1) {
      if (person === searched[i]) return false;
    }
    return true;
  };

  while (search.length > 0) {
    const person = search.shift();
    if (isNotSearched(person)) {
      if (person === 'rinat') return 'YES!';
      searched.push(person);
      if (!friends[person]) continue;
      search.push(...friends[person]);
    }
  }
  return 'NO!';
};

console.log(broadSearch(friends.you));
