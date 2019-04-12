let res = document.getElementById("res");
let btnClr = document.getElementById("btnClr");
let btnEql = document.getElementById("btnEql");

function action(e) {
    let btn = e.target;
    res.innerHTML += btn.innerHTML;
}

document.getElementById("btn0").addEventListener("click", action);
document.getElementById("btn1").addEventListener("click", action);
document.getElementById("btnSum").addEventListener("click", action);
document.getElementById("btnSub").addEventListener("click", action);
document.getElementById("btnMul").addEventListener("click", action);
document.getElementById("btnDiv").addEventListener("click", action);

btnClr.addEventListener("click", function() {
    res.innerHTML = "";
});

btnEql.addEventListener("click", function() {
    let nums = res.innerHTML.match(/\d+/g);
    let operation = res.innerHTML.match(/\+|\-|\*|\//);
    let num1 = parseInt(nums[0], 2);
    let num2 = parseInt(nums[1], 2);
    if (operation == "+") {
        res.innerHTML = Number(num1 + num2).toString(2);
    } else if (operation == "-") {
        res.innerHTML = Number(num1 - num2).toString(2);
    } else if (operation == "*") {
        res.innerHTML = Number(num1 * num2).toString(2);
    } else if (operation == "/") {
        res.innerHTML = Number(Math.floor(num1 / num2)).toString(2);
    }
});
