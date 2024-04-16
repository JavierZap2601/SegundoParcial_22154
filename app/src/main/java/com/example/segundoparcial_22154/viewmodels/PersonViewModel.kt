package com.example.segundoparcial_22154.viewmodels

import androidx.lifecycle.ViewModel
import com.example.segundoparcial_22154.R
import com.example.segundoparcial_22154.models.Person

class PersonViewModel: ViewModel() {
    init{
        //constructor
    }
    fun getPersonList(): ArrayList<Person>{
        val person: Person =Person( "Estudiante", "Chica", 12, R.drawable.female01)
        var personList: ArrayList<Person> = ArrayList<Person>()
        personList.add(person)

        personList.add(Person("Estudiante","Chico",10,R.drawable.male01))
        personList.add(Person("Youtuber","Chica",14,R.drawable.female02))
        personList.add(Person("Profesor","Chico",24,R.drawable.male02))
        personList.add(Person("Enfermera","Chica",22,R.drawable.female03))
        personList.add(Person("Pescador","Chico",65,R.drawable.male03))
        personList.add(Person("Mecanico","Chica",21,R.drawable.female04))
        personList.add(Person("Cocinero","Chico",32,R.drawable.male04))
        personList.add(Person("","A llegado al fin de la lista",0,R.drawable.male04))




        return personList
    }

}