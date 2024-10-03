//navigation bar drop down
// let hover = false;
// if(!hover)
// {
//     document.getElementById("navbar_links_2").addEventListener("click", function(){
//         hover = true;
//         document.querySelector(".series_navbar").style.display = "flex";
//     })
// }

// if(hover)
// {
//     document.getElementById("navbar_links_2").addEventListener("click", function(){
//         hover = false;
//         document.querySelector(".series_navbar").style.display = "none";
//     })
// }
// document.querySelectorAll(".series_navbar")

// document.querySelector(".series_navbar").addEventListener("click", function(){
//     // hover = true;
//     // document.querySelector(".series_navbar").style.display = "flex";
//         // setTimeout(() => {document.querySelector(".series_navbar").style.display = "none";}, 1000);
//     // setTimeout(() => {if(hover == true) document.querySelector(".series_navbar").style.display = "flex";}, 1001);
//     // // setTimeout(() => {if(hover == true) console.log("Hello World");}, 1000);
// })

// document.querySelector(".series_navbar").addEventListener("mouseout", function(){
//     setTimeout(() => {document.querySelector(".series_navbar").style.display = "none";}, 1000);
// })


// document.getElementById("navbar_links_3").addEventListener("mouseover", function(){
//     document.querySelector(".category_navbar").style.display = "flex";
// })

// document.getElementById("navbar_links_3").addEventListener("mouseout", function(){
//     document.querySelector(".category_navbar").style.display = "none";
// })

// document.querySelector(".category_navbar").addEventListener("mouseover", function(){
//     document.querySelector(".category_navbar").style.display = "flex";
// })

// document.querySelector(".category_navbar").addEventListener("mouseout", function(){
//     document.querySelector(".category_navbar").style.display = "none";
// })


// document.getElementById("navbar_links_4").addEventListener("click", function(){
//     document.querySelector(".author_navbar").style.display = "flex";
// })

// document.getElementById("navbar_links_4").addEventListener("mouseout", function(){
//     document.querySelector(".author_navbar").style.display = "none";
// })

// document.querySelector(".author_navbar").addEventListener("mouseover", function(){
//     document.querySelector(".author_navbar").style.display = "flex";
// })

// document.querySelector(".author_navbar").addEventListener("mouseout", function(){
//     document.querySelector(".author_navbar").style.display = "none";
// })


// let navbar_link_2 = document.getElementById("navbar_link_2");
// navbar_link_2. = function()
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

let refreshSlider = setInterval(() => {next.click()}, 5000);

function ReloadSlider()
{
    let checkLeft = items[active].offsetLeft;
    list.style.left = -checkLeft + "px";

    let lastActiveDot = document.querySelector(".slider .dots li.active");
    lastActiveDot.classList.remove("active");
    dots[active].classList.add("active");
    clearInterval(refreshSlider);
    refreshSlider = setInterval(() => {next.click()}, 5000);
}

dots.forEach((li, key) =>{
    li.addEventListener("click", function(){
        active = key;
        ReloadSlider();
    })
})























