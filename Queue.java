public class Queue{
    private int maxSize;
    private int[] array;
    private int front;
    private int back;
    private int currentSize;

		public Queue(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        front = 0;
        back = -1;
        currentSize = 0;
    }

		public void equeue(int data){
			if(back >= maxSize-1){
				System.out.println("Full");
				return;
			}
			array[++back]	=	data;
		}

	public int dequeue(){

			if(front >= maxSize-1){
				System.out.println("Empty");
				return;
			}
		return	array[front++];
		}

}