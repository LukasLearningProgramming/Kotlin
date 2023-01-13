Kotlin
______________________________________________________________________________________________________


fun main() {
    println("Hello World!")
}

    // fun is definition of function. Kotlin needs function main in which all code in project is stored

    // This functions shows Hello World

______________________________________________________________________________________________________

Comments

fun main() {
    println("Hello World!")

    // One line comment

    /* Multiline comment

    */
}

______________________________________________________________________________________________________

Variables

fun main() {

    var userName: String = "Lukáš"
        // this is a way how variable is defined, for naming variables is used camelCase, for example
        // userName, callToMetaRepositoryForToken
    println("Hello $userName!")

}


fun main() {

    var userName: String = "Lukáš"
        // this is a way how variable is defined, for naming variables is used camelCase, for example
        // userName, callToMetaRepositoryForToken

    userName = "Lucas"
        // interesting is that in this case is used second variable with same name userName
        // result of this is "Hello Lucas"

    println("Hello $userName!")

}


fun main() {

    var userName: String = "Lukáš"
        // this is a way how variable is defined, for naming variables is used camelCase, for example
        // userName, callToMetaRepositoryForToken

    userName = 5
        // this case results in ERR, because number is not string 
        // ERR = "Kotlin: The integer literal does not conform to the expected type String"

    println("Hello $userName!")

}


fun main() {

    val userName: String = "Lukáš"
        // val is similar to var, but it is not possible to change value of variable


    userName = "Lucas"
        // this case results in ERR "Kotlin: Val cannot be reassigned"


    println("Hello $userName!")

}


fun main() {
    
    val age: Int = 7
    // this is a way how number (Int = integer) is defined
    // result is "Week has 7 days :-)"

    println("Week has $age days :-)")

}


fun main() {

    val age: Int
    age = 7
    // this is a way how to define variable and then define value for variable

    println("Week has $age days :-)")

}

fun main() {

    val age: Int
    age = "Lucas"
    // this results in ERR "Kotlin: Type mismatch: inferred type is String but Int was expected"

    println("Week has $age days :-)")

}



______________________________________________________________________________________________________




______________________________________________________________________________________________________




______________________________________________________________________________________________________




______________________________________________________________________________________________________




______________________________________________________________________________________________________




______________________________________________________________________________________________________




______________________________________________________________________________________________________




______________________________________________________________________________________________________




______________________________________________________________________________________________________




______________________________________________________________________________________________________