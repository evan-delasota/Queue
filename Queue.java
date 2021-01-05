import java.util.LinkedList;

class Queue {
  private LinkedList<Integer> queue;

  Queue() {
    queue = new LinkedList<>();
  }


  public void enqueue(int input) {
    queue.addFirst(input);
  }

  public void dequeue() {
    queue.removeFirst();
  }

  public int peek() {
    return queue.peekFirst();
  }

}