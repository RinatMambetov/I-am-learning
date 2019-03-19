let btn1 = document.getElementById("btn1");
let btn2 = document.getElementById("btn2");
let btn3 = document.getElementById("btn3");
let btn4 = document.getElementById("btn4");
let btn5 = document.getElementById("btn5");
let btn6 = document.getElementById("btn6");
let btn7 = document.getElementById("btn7");
let btn8 = document.getElementById("btn8");
let btn9 = document.getElementById("btn9");

btn5.addEventListener ("click", function() {
    let btn4Value = btn4.innerHTML;
    btn4.innerHTML = btn7.innerHTML;
    btn7.innerHTML = btn8.innerHTML;
    btn8.innerHTML = btn9.innerHTML;
    btn9.innerHTML = btn6.innerHTML;
    btn6.innerHTML = btn3.innerHTML;
    btn3.innerHTML = btn2.innerHTML;
    btn2.innerHTML = btn1.innerHTML;
    btn1.innerHTML = btn4Value;
});
