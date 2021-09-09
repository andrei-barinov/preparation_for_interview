package main.java.ru.gb.home_task_2.my_linked_list;
//
public class Node<E> {
    Node<E> previous;
    Node<E> next;
    Object data;

    public Node() {
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }



    public void setNext(Node<E> next) {
        this.next = next;
    }


    public void setData(Object data) {
        this.data = data;
    }
}
