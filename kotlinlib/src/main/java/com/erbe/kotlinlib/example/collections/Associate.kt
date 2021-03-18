package com.erbe.kotlinlib.example.collections

/*
Functions associateBy and groupBy build maps from the elements of a collection indexed by the specified key.
The key is defined in the keySelector parameter.
You can also specify an optional valueSelector to define what will be stored in the value of the map element.
The difference between associateBy and groupBy is how they process objects with the same key:
- associateBy uses the last suitable element as the value.
- groupBy builds a list of all suitable elements and puts it in the value.
*/

data class Person(val name: String, val city: String, val phone: String)    // 1

fun main() {

    val people = listOf(                                                    // 2
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
    )

    val phoneBook = people.associateBy { it.phone }                         // 3
    val cityBook = people.associateBy(Person::phone, Person::city)          // 4
    val peopleCities = people.groupBy(Person::city, Person::name)           // 5
    val peopleCities2 = people.associateBy(Person::city, Person::name)

    println(people)
    println(phoneBook)
    println(cityBook)
    println(peopleCities)
    println(peopleCities2)
}

/*
1.	Defines a data class that describes a person.
2.	Defines a collection of people.
3.	Builds a map from phone numbers to their owners' information. it.phone is the keySelector here.
The valueSelector is not provided, so the values of the map are Person objects themselves.
4.	Builds a map from phone numbers to the cities where owners live.
Person::city is the valueSelector here, so the values of the map contain only cities.
5.	Builds a map that contains cities and people living there. The values of the map are lists of person names.
*/