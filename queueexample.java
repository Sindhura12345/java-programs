public class queueexample {
    static class queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;

        queue(int size)
        {
            arr=new int[size];
            this.size=size;

        }
        public static boolean isEmpty()
        {
            return rear == -1 && front == -1;
        }
        public static boolean isFull()
        {
            return (rear+1)%size == front;
        }
        //add
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("full Queue");
                return;
            }
            //add 1st element
            if(front==-1)
            {
                front=0;

            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }
        //remove /dequeue
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("empty Queue");
                return -1;
            }
            int result=arr[front];
            if(rear==front)
            {
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
           
            return result;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("empty Queue");
                return -1;
            }
            return arr[front];
            
        }

    }
    public static void main(String[] args) {
        queue q=new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        while(!q.isEmpty())
        {
            System.out.println(q.remove());
            
        }

    }
}
