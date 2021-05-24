package dataStructure_part_1

abstract class QueueAction {
    val SIZE = 5

    var array = ArrayList<Queue>(SIZE)
    var front = -1
    var rear = -1

    fun peek() {
        when(isEmpty()){
            true -> queueEmpty()
            false -> println("First Element is ${array[front].value}")
        }
    }

    abstract fun enQueue(item: Queue)
    abstract fun deQueue()
    abstract fun isEmpty():Boolean
    abstract fun isFull():Boolean

    fun queueFull() = println("Queue is Full")
    fun queueEmpty() = println("Queue is Empty")
    fun queueOverFlow() = println("Queue ovreFlow")
}