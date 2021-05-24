package dataStructure_part_1

data class Queue(val value:String)

fun main() {

    val simpleQueue = SimpleQueue()
    simpleQueue.enQueue(Queue("Data1"))
    simpleQueue.enQueue(Queue("Data2"))
    simpleQueue.deQueue()
    simpleQueue.peek()
    simpleQueue.deQueue()
}


class SimpleQueue(): QueueAction() {

    override fun enQueue(item: Queue){

        when(!isFull()){
            true ->{
                array.add(item)
                if(isEmpty()) {
                    front++
                    rear++
                }
                else rear++
                println("${item.value} is added")
            }
            false -> queueFull()
        }

    }

    override fun deQueue(){
       when(isEmpty()){
           true -> queueEmpty()
           false -> {
              println("${array[front].value} is removed")
               array.removeAt(front)
               if(front == rear){
                   front --
                   rear --
               }
               else rear--

           }
       }
    }

    override fun isEmpty():Boolean =  front == -1

    override fun isFull():Boolean = rear == SIZE-1 && front == -1


}


