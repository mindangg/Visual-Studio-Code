// popup

document.getElementById("search_icon").addEventListener("click", function(){
    document.querySelector(".search_popup").style.display = "flex";
})

document.getElementById("shopping_icon").addEventListener("click", function(){
    document.querySelector(".shopping_popup").style.display = "flex";
})

document.getElementById("search_close").addEventListener("click", function(){
    document.querySelector(".search_popup").style.display = "none";
})

document.getElementById("shopping_close").addEventListener("click", function(){
    document.querySelector(".shopping_popup").style.display = "none";
})

// let search_icon = document.getElementById("search_icon");
// search_icon.onclick = function()
// {
//     document.querySelector(".search_popup").style.display = "flex";
// }

// let shopping_icon = document.getElementById("shopping_icon");
// shopping_icon.onclick = function()
// {
//     document.querySelector(".shopping_popup").style.display = "flex";
// }

// let search_close = document.getElementById("search_close");
// search_close.onclick = function()
// {
//     document.querySelector(".search_popup").style.display = "none";
// }

// let shopping_close = document.getElementById("shopping_close");
// shopping_close.onclick = function()
// {
//     document.querySelector(".shopping_popup").style.display = "none";
// }

//slider

let list = document.querySelector(".slider .list");
let items = document.querySelectorAll(".slider .list .item");
let dots = document.querySelectorAll(".slider .dots li");
let prev = document.getElementById("prev");
let next = document.getElementById("next");

let active = 0;
let lengthItems = items.length - 1;

next.onclick = function()
{
    if(active + 1 > lengthItems)
        active = 0;
    else
        active++;
    ReloadSlider();
}

prev.onclick = function()
{
    if(active - 1 < 0)
        active = lengthItems;
    else
        active--;
    ReloadSlider();
}

let refreshSlider = setInterval(() => {next.click()}, 4000);

function ReloadSlider()
{
    let checkLeft = items[active].offsetLeft;
    list.style.left = -checkLeft + "px";

    let lastActiveDot = document.querySelector(".slider .dots li.active");
    lastActiveDot.classList.remove("active");
    dots[active].classList.add("active");
    clearInterval(refreshSlider);
    refreshSlider = setInterval(() => {next.click()}, 4000);
}

dots.forEach((li, key) =>{
    li.addEventListener("click", function(){
        active = key;
        ReloadSlider();
    })
})























