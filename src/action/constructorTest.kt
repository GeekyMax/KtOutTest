package action

//class User(_nickName:String){
//    val nickName = _nickName
//}

//class User(val nickName:String)

//default master constructor
class User(val name: String) {
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
    constructor(_name: String, age: Int) : this(_name){
    }
}