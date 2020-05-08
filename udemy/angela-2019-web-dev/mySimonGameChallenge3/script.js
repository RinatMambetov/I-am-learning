const colorRange = ['green', 'red', 'yellow', 'blue'];
let gameSequence = [];
let userSequence = [];
let level = 0;
let started = false;

$(document).keypress(function () {
  if (!started) {
    nextSequence();
    started = true;
  }
});

function checkColor(currentStep) {
  if (gameSequence[currentStep] === userSequence[currentStep]) {
    if (gameSequence.length === userSequence.length) {
      setTimeout(function () {
        nextSequence();
      }, 500);
    }
  } else {
    let wrongAudio = new Audio('sounds/wrong.mp3');
    wrongAudio.play();
    $('body').addClass('game-over');
    setTimeout(function () {
      $('body').removeClass('game-over');
    }, 100);
    $('#level-title').text('Game Over Press Any Key');
    restartGame();
  }
}

$('.btn').click(function () {
  let userColor = $(this).attr('id');
  userSequence.push(userColor);
  makeSound(userColor);
  blinkButton(userColor);
  checkColor(userSequence.length - 1);
});

function nextSequence() {
  level++;
  userSequence = [];
  $('#level-title').text('LeveL ' + level);
  let randomNumber = Math.floor(Math.random() * 4);
  let nextColor = colorRange[randomNumber];
  gameSequence.push(nextColor);
  $('.' + nextColor)
    .fadeOut(100)
    .fadeIn(100);
  makeSound(nextColor);
}

function restartGame() {
  level = 0;
  gameSequence = [];
  userSequence = [];
  started = false;
}

function blinkButton(color) {
  $('.' + color).addClass('pressed');
  setTimeout(function () {
    $('.' + color).removeClass('pressed');
  }, 100);
}

function makeSound(color) {
  let audio = new Audio('sounds/' + color + '.mp3');
  audio.play();
}
