package com.ybennun.kotlinoop.nestedclass

class Outer {

    var a:Int = 10

   inner class Nested{
        fun nestedFunction(){
            println("I am inside Nested class $a")
        }
    }
}