package com.rt.kotlinhandson.examples.abstraction

class Wine : Bottle() {
    override var exp: Int = 10

    override fun price(price: Int) {
        println("The price is " + 1.5 * price);
    }
}