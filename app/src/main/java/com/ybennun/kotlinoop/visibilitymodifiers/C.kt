package com.ybennun.kotlinoop.visibilitymodifiers

class C : A() {
    fun accessClassA() {
        val instanceA = A()
        println("property class A is: ${instanceA.propertyA}")
        instanceA.functionA()
    }
}