package com.ybennun.kotlinoop

class Car(
     val speed: Int,
     val gear: Int,
     val seat: Int
) {

    var distance: Int = 0

    constructor(time: Int, speed: Int, gear: Int, seat: Int) : this(speed, gear, seat) {
        distance = speed * time
    }

    fun speedUp() = speed * 5
}