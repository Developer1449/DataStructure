package dataStructure_part_1

fun main() {
    val stack = Stack()
    stack.push(4)
    stack.push(5)
    stack.pop()
    System.out.println("Top element is ${stack.peek()}")

}

data class Element(val value: String)

class Stack {
    var top:Int = -1
    val STACK_SIZE = 5
    var list = IntArray(5)


    fun push(element: Int){
        if(!isFull()) {
            list[++top] = element
            System.out.println("${element} is added at $top")
        }
        else System.out.println("Stack is Full")
    }

    fun pop(){
        if(!isEmpty()) {
            System.out.println("${list[top]} is removed from $top")
            top--
        }
        else System.out.println("Stack is Empty")
    }

    fun isEmpty(): Boolean = top==-1

    fun isFull(): Boolean = top == STACK_SIZE

    fun peek():Int?{
        if(!isEmpty()){
            return list[top]
        }
        return null
    }
}
