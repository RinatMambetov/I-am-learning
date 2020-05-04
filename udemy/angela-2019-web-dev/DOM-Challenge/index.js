document.getElementsByClassName('list')[2].innerHTML = 'Rinat';
let link = document.querySelector('li a');
link.style.color = 'red';
link.setAttribute('href', 'https://www.ya.ru');
let button = document.querySelector('button');
button.style.backgroundColor = 'yellow';
button.style.border = '0';
button.classList.add('huge');
