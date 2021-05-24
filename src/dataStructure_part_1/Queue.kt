package dataStructure_part_1

import com.sun.org.apache.xpath.internal.operations.Bool
const val SIZE = 5

fun main() {

    val simpleQueue = SimpleQueue()
    simpleQueue.enQueue(Queue("Data1"))
    simpleQueue.enQueue(Queue("Data2"))
    simpleQueue.deQueue()
    simpleQueue.peek()
    simpleQueue.deQueue()


}

data class Queue(val value:String)

class SimpleQueue(){

    var array = ArrayList<Queue>(SIZE)
    var front = -1
    var rear = -1

    fun enQueue(item: Queue){

        when(!isFull()){
            true ->{
                array.add(item)
                if(isEmpty()) {
                    front++
                    rear++
                }
                else rear++
                System.out.println("${item.value} is added")
            }
            false -> System.out.println("Array is Full")
        }

    }

    fun deQueue(){
       when(isEmpty()){
           true -> System.out.println("Array is Empty")
           false -> {
               System.out.println("${array[front].value} is removed")
               array.removeAt(front)
               if(front == rear){
                   front --
                   rear --
               }
               else rear--

           }
       }
    }

    fun isEmpty():Boolean =  front == -1

    fun isFull():Boolean = rear == SIZE-1 && front == -1

    fun peek(){
            when(isEmpty()){
                true -> System.out.println("Array is Empty")
                false -> System.out.println("First Element is ${array[front].value}")
            }
    }

}


