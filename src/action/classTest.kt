package action

import java.io.Serializable

interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class Button : View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
//        super.restoreState(state)
    }

    class ButtonState : State {}
}

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun evel(e: Expr): Int =
        when (e) {
            is Expr.Num -> e.value
            is Expr.Sum -> evel(e.left) + evel(e.right)
        }