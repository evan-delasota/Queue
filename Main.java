class Main {
  public static void main(String[] args) {
    Queue myQueue = new Queue();

    myQueue.enqueue(3);
    myQueue.enqueue(5);
    myQueue.enqueue(100);

    System.out.println(myQueue.peek() + " is currently first in queue.\n");

    myQueue.dequeue();

    System.out.println(myQueue.peek() + " is currently first in queue.\n");

  }
}