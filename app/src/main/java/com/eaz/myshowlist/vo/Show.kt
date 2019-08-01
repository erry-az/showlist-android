package com.eaz.myshowlist.vo

data class Show(
    val id: Int,
    val title: String,
    val description: String,
    val rating: Double,
    val showType: ShowType,
    val releaseDate: String,
    val poster: Int? = null,
    val posterUrl: String? = null
)

enum class ShowType {
    MOVIE, SERIES
}