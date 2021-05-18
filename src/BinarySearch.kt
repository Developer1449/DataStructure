fun main() {
  var array = intArrayOf(5, 6, 15, 20, 60, 80)
  val index = binarySearch(array,60,0,array.size-1)
  when{
    index > 0 -> System.out.println("Element found at index $index")
    else -> System.out.println("Element not found")
  }
}

fun binarySearch(array: IntArray,num:Int, start:Int, end:Int): Int{

  while (start<=end){
    val mid = (start+end)/2
    when{
      num > array[mid] -> return binarySearch(array,num,mid+1,end)
      num < array[mid] -> return binarySearch(array,num,start,mid-1)
      num == array[mid] -> return mid
    }
  }
  return -1
}