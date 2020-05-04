let colorRange = ['red', 'green', 'blue', 'yellow'];
let gamePattern = [];
let userPattern = [];
let level = 0;
let started = false;

$(document).keypress(function () {
  if (!started) {
    nextSequence();
    started = true;
  }
});

function checkAnswer() {
  if (
    userPattern[userPattern.length - 1] === gamePattern[userPattern.length - 1]
  ) {
    console.log('success');
    if (userPattern.length === gamePattern.length) {
      userPattern = [];
      setTimeout(function () {
        nextSequence();
      }, 1000);
    }
  } else {
    console.log('wrong');
    $('body').addClass('game-over');
    setTimeout(function () {
      $('body').removeClass('game-over');
    }, 200);
    $('#level-title').text('Press Any Key to Restart');
    restartGame();
  }
}

$('.btn').click(function () {
  let userColor = $(this).attr('id');
  userPattern.push(userColor);
  makeSound(userColor);
  blinkButton(userColor);
  checkAnswer();
});

function nextSequence() {
  level++;
  $('#level-title').text('LeveL ' + level);
  let randomNumber = Math.floor(Math.random() * 4);
  let randomColor = colorRange[randomNumber];
  gamePattern.push(randomColor);
  makeSound(randomColor);
  $('.' + randomColor)
    .fadeOut(100)
    .fadeIn(100);
}

function restartGame() {
  level = 0;
  gamePattern = [];
  userPattern = [];
  started = false;
}

function makeSound(color) {
  let sound = new Audio('sounds/' + color + '.mp3');
  sound.play();
}

function blinkButton(color) {
  $('.' + color).addClass('pressed');
  setTimeout(function () {
    $('.' + color).removeClass('pressed');
  }, 100);
}
