package action

import java.util.*
import javax.swing.text.AttributeSet

//class User(_nickName:String){
//    val nickName = _nickName
//}

//class User(val nickName:String)

//default master constructor
class User6(val name: String) {
}

//no constructor
class User2 {
    val name = ""
}

//master constructor
class User3(_name: String) {
    val name = _name
}

class User4(_name: String) {
    val name: String

    init {
        name = _name
    }
}

class User5() {
    constructor(_name: String) : this()
    constructor(_name: String, age: Int) : this(_name) {
    }
}

//private constructor
class Secretive private constructor() {}

class Context
open class View1 {
    constructor(ctx: Context) {}
    constructor(ctx: Context, attr: String)
}

class MyButton : View1 {
    constructor(ctx: Context) : this(ctx, "")
    constructor(ctx: Context, attr: String) : super(ctx, attr) {
    }
}

interface User {
    val nickName: String
}

class PrivateUser(override val nickName: String) : User
class SubscribingUser(val email: String) : User {
    override val nickName: String
        get() = email.substringBefore("@")
}

fun getFacebookName(account: Int) = ""
class FacebookUser(val accountId: Int) : User {
    override val nickName: String
        get() = getFacebookName(accountId)
}

