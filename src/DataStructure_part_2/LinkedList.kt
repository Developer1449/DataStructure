package DataStructure_part_2

fun main() {
    var linkedList = LinkedList()
    linkedList.addNode(Node(123))
    linkedList.addNode(Node("abcd"))
    linkedList.addNode(Node(123))
    linkedList.addNode(Node("abcd"))
    linkedList.printLinkedList()
}

data class Node(
    var value: Any,
    var next: Number? = null
)

class LinkedList{

    var list: MutableList<Node>? = mutableListOf()
    var header = 0


    fun addNode(node: Node){
        list?.add(node)
        if(header>0) {
            list?.get(header-1)?.next = (header)
            //list?.get(header + 1)?.next = null
        }
        header++
    }

    fun printLinkedList(){
        for(values in requireNotNull(list)){
            System.out.println(values.toString())
        }
    }
}