package action

import java.util.*

open class Branch(val age: Date, val name: String) {
    open fun printHello() {
        print("hello")
        print("hello")
    }
}

class NewBranch() : Branch(age = Date(), name = "1") {
    override fun printHello(){
        print("new hello")
        print("new hello")
    }
}