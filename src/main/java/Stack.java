/*
Stack:
1. Create Stack
2. Implement stack functionality
   1. create stack define size new Stack(10)
   2. push / if stack is full - throw new IllegalStateException(“overflow”)
   3. pop/ if stack is empy - throw new IllegalStateException(“underflow”)
   4. size
   5. isEmpty
3. Implementation must be based on array
 */


public class Stack {
    private int[] array;
    private int top = -1;

    public Stack(int size) {
        this.array = new int[size];
    }

    public void printArray() {
        for (int i = 0; i < top+1; i++) {
            System.out.println(array[i]);
        }
    }

    public boolean isEmpty (){
        return (top==-1);
    }

    public int size() {
        return top+1;
    }

    public void push(int number) {
        if(top +1 == array.length) throw new IllegalStateException("overflow");
        top++;
        array[top] = number;
    }

    public int pop() {
        if(isEmpty()) {
            throw new IllegalStateException("overflow");
        }
        int oldTop = top;
            top--;
            return array[oldTop];
        }
    }

