package com.example.segundoparcial_22154.viewmodels

import androidx.lifecycle.ViewModel
import com.example.segundoparcial_22154.R
import com.example.segundoparcial_22154.models.Person
import com.example.segundoparcial_22154.models.Pokemon

class PokemonViewModel: ViewModel() {
    init{
        //constructor
    }
    fun getPokemonList(): ArrayList<Pokemon>{
        val pokemon: Pokemon = Pokemon( "Springatito",R.drawable.pokemon01)
        var pokemonList: ArrayList<Pokemon> = ArrayList<Pokemon>()
        pokemonList.add(pokemon)

        pokemonList.add(Pokemon( "Fuecoco", R.drawable.pokemon02))
        pokemonList.add(Pokemon( "Quaxly ", R.drawable.pokemon03))




        return pokemonList
    }

}