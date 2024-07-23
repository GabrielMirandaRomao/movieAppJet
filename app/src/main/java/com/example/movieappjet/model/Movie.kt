package com.example.movieappjet.model

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val genre: String,
    val director: String,
    val actors: String,
    val plot: String,
    val poster: String,
    val images: List<String>,
    val rating: String
)

fun getMovies(): List<Movie> =
    listOf(
        Movie(
            id = "1",
            title = "Inception",
            year = "2010",
            genre = "Action, Sci-Fi, Thriller",
            director = "Christopher Nolan",
            actors = "Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page",
            plot = "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.",
            poster = "https://uauposters.com.br/media/catalog/product/5/0/508320201013-uau-posters-filmes-a-origem-inception.jpg",
            images = listOf(
                "https://www.hollywoodreporter.com/wp-content/uploads/2014/06/100-Favorite-Films-84-Inception-Still-Everett-MCDINCE_EC013-EMBED-2022.jpg",
                "https://cdn.britannica.com/13/147813-050-37062815/Leonardo-DiCaprio-Joseph-Gordon-Levitt-Inception-Christopher-Nolan.jpg",
                "https://static01.nyt.com/images/2010/07/16/arts/16inceptioncap/16inceptioncap-articleLarge.jpg"
            ),
            rating = "8.8"
        ),
        Movie(
            id = "2",
            title = "The Shawshank Redemption",
            year = "1994",
            genre = "Drama",
            director = "Frank Darabont",
            actors = "Tim Robbins, Morgan Freeman, Bob Gunton",
            plot = "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
            poster = "https://cdn-cosmos.bluesoft.com.br/products/883311220363",
            images = listOf(
                "https://cdn.theasc.com/Shawshank-Featured.jpg",
                "https://sbiff.org/wp-content/uploads/shawshank-1080x675.jpg",
                "https://images.justwatch.com/backdrop/8652086/s640/the-shawshank-redemption.%7Bformat%7D"
            ),
            rating = "9.3"
        ),
        Movie(
            id = "3",
            title = "The Godfather",
            year = "1972",
            genre = "Crime, Drama",
            director = "Francis Ford Coppola",
            actors = "Marlon Brando, Al Pacino, James Caan",
            plot = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
            poster = "https://i.pinimg.com/736x/b0/21/fe/b021fe6711ec0a442420719e56633101.jpg",
            images = listOf(
                "https://variety.com/wp-content/uploads/2017/01/godfather.jpg?w=1000",
                "https://mshanken.imgix.net/cao/bolt/2022-03/1647463313_godfather0422.jpg?w=900&q=72",
                "https://hips.hearstapps.com/hmg-prod/images/american-actors-marlon-brando-and-al-pacino-on-the-set-of-news-photo-1578503843.jpg?crop=1.00xw:0.756xh;0,0.0556xh&resize=1200:*"
            ),
            rating = "9.2"
        )
    )