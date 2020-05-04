let buttons = document.querySelectorAll('.drum');

for (let i = 0; i < buttons.length; i++) {
  buttons[i].addEventListener('click', function () {
    makeSound(buttons[i].textContent);
    buttonAnimation(buttons[i].textContent);
  });
}

document.addEventListener('keydown', function (event) {
  makeSound(event.key);
  buttonAnimation(event.key);
});

function buttonAnimation(currentKey) {
  let activeButton = document.querySelector('.' + currentKey);
  activeButton.classList.add('pressed');
  setTimeout(function () {
    activeButton.classList.remove('pressed');
  }, 100);
}

let sound;

function makeSound(key) {
  switch (key) {
    case 'w':
      sound = new Audio('sounds/crash.mp3');
      sound.play();
      break;
    case 'a':
      sound = new Audio('sounds/kick-bass.mp3');
      sound.play();
      break;
    case 's':
      sound = new Audio('sounds/snare.mp3');
      sound.play();
      break;
    case 'd':
      sound = new Audio('sounds/tom-1.mp3');
      sound.play();
      break;
    case 'j':
      sound = new Audio('sounds/tom-2.mp3');
      sound.play();
      break;
    case 'k':
      sound = new Audio('sounds/tom-3.mp3');
      sound.play();
      break;
    case 'l':
      sound = new Audio('sounds/tom-4.mp3');
      sound.play();
      break;
    default:
      console.log(key);
  }
}
