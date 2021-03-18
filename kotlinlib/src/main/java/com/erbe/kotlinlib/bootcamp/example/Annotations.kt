package com.erbe.kotlinlib.bootcamp.example

import kotlin.reflect.full.*    // required import

// Kotlin Bootcamp for Programmers 6: Functional manipulation
// https://developer.android.com/codelabs/kotlin-bootcamp-sams

/*
Annotations are a way of attaching metadata to code, and are not something specific to Kotlin.
The annotations are read by the compiler and used to generate code or logic.
Annotations go right before the thing that is annotated, and most things can be
annotated—classes, functions, methods, and even control structures. Some annotations can take arguments.
*/

/*
Kotlin gives you additional control over loops with what's called a labeled break.
A break qualified with a label jumps to the execution point right after the loop marked with that label.
This is particularly useful when dealing with nested loops.
*/

/*
Use annotations to specify things to the compiler. For example: @file:JvmName("Foo")
Use labeled breaks to let your code exit from inside nested loops. For example: if (i > 10) break@outerLoop // breaks to outerLoop label
Lambdas can be very powerful when coupled with higher-order functions.
Lambdas are objects. To avoid creating the object, you can mark the function with inline, and the compiler will put the contents of the lambda in the code directly.
Use inline carefully, but it can help reduce resource usage by your program.
SAM, Single Abstract Method, is a common pattern, and made simpler with lambdas. The basic pattern is: Class.singleAbstractMethod { lamba_of_override }
The Kotlin Standard Library provides numerous useful functions, including several SAMs, so get to know what's in it.
*/

// Todo: Task: Learn about annotations

@ImAPlant
class Plant {
    fun trim() {}
    fun fertilize() {}

    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needsFood: Boolean = false
}

fun testAnnotations() {
    val classObj = Plant::class
    for (m in classObj.declaredMemberFunctions) {
        println(m.name)
    }

    val plantObject = Plant::class
    for (a in plantObject.annotations) {
        println(a.annotationClass.simpleName)
    }

    val myAnnotationObject = plantObject.findAnnotation<ImAPlant>()
    println(myAnnotationObject)
}

annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

// Todo: Task: Learn about labeled breaks

fun labels() {
    outerLoop@ for (i in 1..100) {
        print("$i ")
        for (j in 1..100) {
            if (i > 10) break@outerLoop     // breaks to outer loop
        }
    }
}


fun main() {

    // Todo: Task: Learn about annotations

    testAnnotations()

    // Todo: Task: Learn about labeled breaks

    labels()
}