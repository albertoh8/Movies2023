package com.albertoherjim.movies.domain

class GetFilmUseCase(
    private val filmRepository: FilmRepository) {

    fun execute(): List<FilmFeed>{
        val films = filmRepository.getFilms()

        val list = films.map { film ->
            FilmFeed(
                film.poster,
                film.tittle,
                film.plot,
                film.rating,
                film.year,
                film.genre
            )
        }
        return list
    }

    data class FilmFeed(
        val poster:String,
        val tittle: String,
        val plot: String,
        val rating:String,
        val year:String,
        val genre:String
    )
}