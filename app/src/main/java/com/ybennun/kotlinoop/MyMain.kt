package com.ybennun.kotlinoop

fun main() {
    val car1 = Car()

    println("car1 speed is: ${car1.speed}, gear is: ${car1.gear}, seat is: ${car1.seat}")

    println("car1 speed after speeding up is: ${car1.speedUp()}")
}