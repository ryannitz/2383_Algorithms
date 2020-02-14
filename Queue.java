public class Queue{

    public int[] Q;

    public void queue_init(){
        Q = new int[0];
    }

    public boolean empty(){
        return Q.length == 0;
    }

    public void enqueue(Integer val){
        int[] temp = new int[Q.length +1];
        for(int i = 0; i < Q.length; i++){
            temp[i] = Q[i];
        }
        temp[temp.length -1] = val;
        Q = temp;
    }

    public int dequeue(){
        if(!empty()){
            int[] temp = new int[Q.length -1];
            int dequeued = Q[0];
            for(int i = 1; i < Q.length; i++){
                temp[i-1] = Q[i];
            }
            Q = temp;
            return dequeued;
        }
        System.out.println("Error - Stack is empty");
        return -9999;
    }

    public int front(){
        if(!empty()){
            return Q[0];
        }
        System.out.println("Error - Stack is empty");
        return -9999;
    }

}