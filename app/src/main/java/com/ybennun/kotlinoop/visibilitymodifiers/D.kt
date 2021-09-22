package com.ybennun.kotlinoop.visibilitymodifiers

class D : B() {

    fun accessAFromB() {
        val instanceA = A()
        println("property class A is: ${instanceA.propertyA}")
        instanceA.functionA()
    }

}