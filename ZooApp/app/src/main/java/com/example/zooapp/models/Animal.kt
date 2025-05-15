package com.example.zooapp.models
import com.example.zooapp.R

data class Animal (
    val id: Int,
    val name: String,
    val species: String,
    val imageRes: Int,
    val description: String,
    val curiosities: String,
    var isFavorite: Boolean = false
)
val animalList = listOf(
    Animal(
        id = 1,
        name = "Dog",
        species = "Canis lupus familiaris",
        imageRes = R.drawable.dog,
        description = "O inimigo mais poderoso que você poderá encontrar será sempre você mesmo, esse é o preço de ter a consciência da existência de si mesmo.",
        curiosities = "TUC TUC CACHORRO CHUPETÃO"
    ),
    Animal(
        id = 2,
        name = "Cat",
        species = "Felis catus",
        imageRes = R.drawable.cat,
        description = "O gato doméstico é conhecido por sua agilidade e independência.",
        curiosities = "Gatos passam cerca de 70% do dia dormindo."
    ),
)