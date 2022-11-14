package stack;

public class Stack {

    int maxSize;
    int[] s;
    int top;

    Stack(int data){
       this.maxSize=data;
       this.s=new int[data];
       this.top=-1;
    }

    public void push(int val){
        if(!isFull()){
            top++;
            s[top]=val;
            System.out.println("Pushed element:" + val);
        } else {
            System.out.println("Stack is full !");
        }


    }

    public int pop(){
        if(!isEmpty()){
            int returnedTop = s[top];
            top--;
            System.out.println(returnedTop+" is removed from stack");
            return returnedTop;
        }
        else {
            System.out.println("empty stack");
            return  -1;
        }

    }

    public int peek(){

        if(!this.isEmpty())
            return s[top];
        else
        {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }


}
