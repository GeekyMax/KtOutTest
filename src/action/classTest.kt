package action

interface Clickable {
    fun click()
}

interface Focusable {
    fun focus()
}

open class Button() : Clickable, Focusable {
    override fun click() {
        print("clicked!")
    }

    override fun focus() {
        print("focus")
    }
}

class ImageButton() : Button() {
    override fun click() {
        super.click()
    }

    override fun focus() {
        super.focus()
    }
}