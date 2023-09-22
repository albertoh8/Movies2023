package com.albertoherjim.movies.domain

data class Film(
    val id: Int,
    val tittle: String,
    val plot: String,
    val genre: String,
    val rating: String,
    val year: String,
    val poster: String
)