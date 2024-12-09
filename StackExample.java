// public class StackExample {
//     private int maxSize;
//     private int[] stackArray;
//     private int top;
    
//     public StackExample(int size) {
//         maxSize = size;
//         stackArray = new int[maxSize];
//         top = -1;
//     }

// //  method to push an element onto the stack

//     public void push(int value) {
//         if(top == maxSize - 1) {
//             System.out.println(" Stack Overflow ");
//             return;
//         }
//         stackArray[++top] = value;
//         System.out.println(value + "pushed into the stack");
//     }
    
//     // method to pop the element from the stack
//     public int pop() {
//         if (top == -1){
//             System.out.println(" stack underflow ");
//             return -1;
//         }
//         int poppedElement = stackArray[top++];
//         System.out.println(poppedElement + "popped from the stack ");
//         return poppedElement;
//     }
    
//     // method to peek the top element of the stack
     
//     public int top() {
//         if (top== -1) {
//             System.out.println("stack is empty");
//             return -1;
//         }
//         return stackArray[top];
//     } 
    
//     // method to check if the stack is empty
//     public boolean isEmpty() {
//         return(top==-1);
//     }
    
//     public static void main(String[] arg) {
//         StackExample stack = new StackExample(5);
        
//         stack.push(10);
//         stack.push(20);
        
//         System.out.println("top elment of the stack : " + stack.top());
        
//         stack.pop();
//         stack.pop();
//         stack.pop();
        
//         System.out.println("Is stack empty? " + stack.isEmpty());
        
//     }
    
// }


class Node{
    int data;
    Node next;
    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    } 
}

class Stack {
    Node head;

    Stack() { this.head = null ;}
    boolean isEmpty() {
        return head == null;
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);

        if (new_node == null) {
            System.out.println("\nStack Overflow");
            return;
        }
        new_node.next = head;
        head = new_node;
        
    }
    void pop() {
        if (isEmpty()) {
            System.out.println("\nStack Underfolw");
            return;
        }
        else{
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }
    
    int peek() {
        if (!isEmpty()) {
            return head.data;
        }
        else {
            System.out.println("\nStack is empty");
            return Integer.MIN_VALUE;
        }
    }
}

public class StackExample {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        System.out.println( "Top element is : " + st.peek());

        System.out.println("Removing two elements...");
        st.pop();
        st.pop();

        System.out.println("Top element is : " + st.peek());
    }
}