package as;
import java.util.Scanner;

public class LinkedListOperations {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Element inserted successfully");
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node current = head;
            Node prev = null;
            while (current != null && current.data != data) {
                prev = current;
                current = current.next;
            }
            if (current == null) {
                System.out.println("Element not found in the linked list");
            } else {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                System.out.println("Element deleted successfully");
            }
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            System.out.println("Elements in the linked list are:");
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListOperations linkedListOperations = new LinkedListOperations();

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Insert element");
            System.out.println("2. Delete element");
            System.out.println("3. Display elements");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int element = scanner.nextInt();
                    linkedListOperations.insert(element);
                    break;
                case 2:
                    System.out.print("Enter element to delete: ");
                    int data = scanner.nextInt();
                    linkedListOperations.delete(data);
                    break;
                case 3:
                    linkedListOperations.display();
                    break;
                case 4:
                    System.out.println("Exiting program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again");
                    break;
            }
        }
    }
}
