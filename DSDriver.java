import java.util.Scanner;
import java.io.*;

public class DSDriver{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (input.equals("stack")) {
            stack();
        } else if (input.equals("queue")) {
            queue();
        }else{
            System.out.println("Not a valid input");
        }




    }

    static void queue(){
        Queue q = new Queue();
        q.queue_init();
        Scanner sc = new Scanner(System.in);
        String breakChar = "!";
        String input = "";
        while (true) {
            input = sc.next();
            if (input.contains("!")) {
                break;
            }
            int inVal = Integer.parseInt(input);
            if (inVal == -1) {
                int out = q.front();
                if (out != -9999) {
                    System.out.println("Front: " + out);
                }
            } else if (inVal == 0) {
                int out = q.dequeue();
                if (out != -9999) {
                    System.out.println("Dequeue: " + out);
                }
            } else {
                q.enqueue(inVal);
            }
        }
    }

    static void stack(){
        Stack stack = new Stack();
        stack.stack_init();
        Scanner sc = new Scanner(System.in);
        String breakChar = "!";
        String input = "";
        while (true) {
            input = sc.next();
            if (input.contains("!")) {
                break;
            }
            int inVal = Integer.parseInt(input);
            if (inVal == -1) {
                int out = stack.top();
                if (out != -9999) {
                    System.out.println("Top: " + out);
                }
            } else if (inVal == 0) {
                int out = stack.pop();
                if (out != -9999) {
                    System.out.println("Pop: " + out);
                }
            } else {
                stack.push(inVal);
            }
        }
    }
}