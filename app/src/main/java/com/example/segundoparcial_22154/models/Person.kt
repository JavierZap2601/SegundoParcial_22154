package com.example.segundoparcial_22154.models

import androidx.annotation.DrawableRes

data class Person(
    val profesion: String,
    val genero : String,
    val edad: Int,
    @DrawableRes val image: Int
)
