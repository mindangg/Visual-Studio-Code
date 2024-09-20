const rollButton = document.getElementById("rollButton");
const numLabel1 = document.getElementById("numLabel1");
const numLabel2 = document.getElementById("numLabel2");
const numLabel3 = document.getElementById("numLabel3");
const min = 1;
const max = 6;
let randomNum1;
let randomNum2;
let randomNum3;

rollButton.onclick = function()
{
    randomNum1 = Math.floor(Math.random() * max) + min;
    numLabel1.textContent = randomNum1;

    randomNum2 = Math.floor(Math.random() * max) + min;
    numLabel2.textContent = randomNum2;

    randomNum3 = Math.floor(Math.random() * max) + min;
    numLabel3.textContent = randomNum3;
}