class SpecialHeader extends HTMLElement{
    ConnectedCallback(){
        this.innerHTML = `
        <nav class="navbar">

            <div class="navbar_logo">
                <a href="index.html"><img src="../img/WEBTOON_Logo.png" alt="website logo"></a>
            </div>

            <ul class="navbar_links">
                <li class="navbar_link"><a href="index.html">Home</a></li>
                <li class="navbar_link" id="navbar_links_2"><a href="">Series</a></li>
                <li class="navbar_link" id="navbar_links_3"><a href="">Category</a></li>
                <li class="navbar_link" id="navbar_links_4"><a href="">Author</a></li>
                <li class="navbar_link" id="navbar_links_5"><a href="">Price</a></li>
                <li class="navbar_link"><a href="">About Us</a></li>
            </ul>

            <div class="navbar_home">
                <a id="search_icon"><i class="fa-solid fa-magnifying-glass" style="color:white;"></i></a>
                <a href="../html/login.html" id="login_icon"><i class="fa-regular fa-user" style="color:white;"></i></a>
                <a id="shopping_icon"><i class="fa-solid fa-cart-shopping" style="color:white;"></i></a>
            </div>
        </nav>

        <nav class="series_navbar">
            <ul class="series_navbar_links">
                <li class="series_navbar_link"><a href="">Sakamoto Days</a></li>
                <li class="series_navbar_link"><a href="">My Dress Up Darling</a></li>
                <li class="series_navbar_link"><a href="">Classroom Of The Elite</a></li>
                <li class="series_navbar_link"><a href="">One Punch Man</a></li>
                <li class="series_navbar_link"><a href="">Naruto</a></li>
            </ul>

            <ul class="series_navbar_links">
                <li class="series_navbar_link"><a href="">Black Clover</a></li>
                <li class="series_navbar_link"><a href=""></a></li>
                <li class="series_navbar_link"><a href=""></a></li>
                <li class="series_navbar_link"><a href="">Chain Saw Man</a></li>
                <li class="series_navbar_link"><a href="">Fairy Tales</a></li>
            </ul>

            <ul class="series_navbar_links">
                <li class="series_navbar_link"><a href="">Demon Slayer</a></li>
                <li class="series_navbar_link"><a href="">Jujutsu Kaisen</a></li>
                <li class="series_navbar_link"><a href="">Black Clover</a></li>
                <li class="series_navbar_link"><a href="">Mob Psycho 100</a></li>
                <li class="series_navbar_link"><a href="">Seven Deadly Sins</a></li>
            </ul>

            <ul class="series_navbar_links">
                <li class="series_navbar_link"><a href="">Spy X Family</a></li>
                <li class="series_navbar_link"><a href="">Rent A Girlfriend</a></li>
                <li class="series_navbar_link"><a href="">One Piece</a></li>
                <li class="series_navbar_link"><a href="">Mashle: Magic And Muscles</a></li>
                <li class="series_navbar_link"><a href="">My Hero Academia</a></li>
            </ul>
        </nav>

        <nav class="category_navbar">
            <ul class="category_navbar_links">
                <li class="category_navbar_link"><a href="">Shounen</a></li>
                <li class="category_navbar_link"><a href="">Slice Of Life</a></li>
                <li class="category_navbar_link"><a href="">Psychology</a></li>
            </ul>

            <ul class="category_navbar_links">
                <li class="category_navbar_link"><a href="">Rom-Com</a></li>
                <li class="category_navbar_link"><a href="">Seinen</a></li>
                <li class="category_navbar_link"><a href="">Horror</a></li>

            </ul>

            <ul class="category_navbar_links">
                <li class="category_navbar_link"><a href="">Hentai</a></li>
                <li class="category_navbar_link"><a href="">Brain Rot</a></li>
                <li class="category_navbar_link"><a href="">Shoujo</a></li>
            </ul>

            <ul class="category_navbar_links">
                <li class="category_navbar_link"><a href="">Jousei</a></li>
                <li class="category_navbar_link"><a href="">Drama</a></li>
                <li class="category_navbar_link"><a href="">Action</a></li>
            </ul>
        </nav>

        <div class="search_popup">
            <div class="search">
                <div class="searchbox">
                    <input type="search" placeholder="Search for...">
                    <a id="search_close"><i class="fa-solid fa-xmark" style="color:white;"></i></a>
                </div> 
            </div>
        </div>

        <div class="shopping_popup">
            <div class="shopping_container">
                <a id="shopping_close"><i class="fa-solid fa-xmark" style="color:white;"></i></a>     
                <div class="shopping">
                    <div class="shopping_icon">
                        <i class="fa-solid fa-cart-shopping" style="color:white;"></i>
                    </div>
                    <br>
                    <h3>Your cart is empty</h3>
                    <button class="shopping_btn">Continue shopping</button>
                </div>
            </div>
        </div>
        `
    }
}

customElements.define(`special-header`, SpecialHeader)