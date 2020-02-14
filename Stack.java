public class Stack{

    private int A[];

    public void stack_init(){
        A = new int[0];
    }

    public boolean empty(){
        return A.length == 0;
    }

    //no need to check for empty
    public void push(Integer val){
        int[] temp =  new int[A.length + 1];
        for(int i = 0; i < A.length; i++){
            temp[i] = A[i];
        }
        temp[temp.length -1] = val;
        A = temp;
    }


    public Integer pop(){
        if(!empty()){
            int[] temp = new int[A.length -1];
            int popped = A[A.length -1];
            for(int i = 0; i < temp.length; i++){
                temp[i] = A[i];
            }
            A = temp;
            return popped;
        }else{
            System.out.println("Error - Stack is empty");
            return -9999;
        }
    }

    public Integer top(){
        if(!empty()){
            return A[A.length -1];
        }else{
            System.out.println("Error - Stack is empty");
            return -9999;
        }
    }
}