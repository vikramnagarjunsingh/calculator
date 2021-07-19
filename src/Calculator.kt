abstract class Calculator {
    class Calculator(){}
    open fun add(x:Int, y:Int): Int{
        return x + y
    }
    protected fun extra(a:Int):Int{
        return a+5
    }
}
class addFuntion : Calculator(){
    override fun add(a:Int, b:Int):Int{
        return extra(a+b)
    }
}
fun main() {
    var obj = addFuntion();
    println(obj.add(3,7))
}