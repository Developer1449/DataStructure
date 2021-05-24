package dataStructure_part_1


fun main() {
    val circularQueue = CircularQueue()
    circularQueue.enQueue(Queue("Data1"))
    circularQueue.enQueue(Queue("Data2"))
    circularQueue.enQueue(Queue("Data3"))
    circularQueue.enQueue(Queue("Data4"))
    circularQueue.enQueue(Queue("Data5"))
    circularQueue.deQueue()
    circularQueue.enQueue(Queue("Data6"))
}

class CircularQueue : QueueAction() {
    override fun enQueue(item: Queue) {
        when(!isFull()){
            true -> {
                if(front == -1) front = 0
                rear = (rear + 1) % SIZE
                array.add(item)
                println("${item.value} is added")
            }
            false -> queueOverFlow()
        }
    }

    override fun deQueue() {
        when(!isEmpty()){
            true -> {
                println("${array[front].value} is removed")
                if(front == rear){
                    front = -1
                    rear = -1
                }
                else
                    front = (front + 1) % SIZE
            }
            false -> queueEmpty()
        }
    }

    override fun isEmpty(): Boolean = front == -1

    override fun isFull(): Boolean  = (front == 0 && rear == SIZE-1) || (front == rear+1)

}