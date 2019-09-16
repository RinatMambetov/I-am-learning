function timer() {
  // const text = prompt('О чём вам напомнить?');
  // let time = prompt('Через сколько минут?');
  // const repeat = prompt('Сколько раз повторить?');

  let text = 'q';
  let time = 0.01;
  let repeat = 2;

  time = time * 60 * 1000;
  let current = 1;

  setTimeout(function go() {
    // alert(text);
    console.log(text);
    if (current < repeat) {
      setTimeout(go, time);
    }
    current += 1;
  }, time);
}

timer();
