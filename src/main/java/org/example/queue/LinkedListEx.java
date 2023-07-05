package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alex");
        queue.add("Alla");
        queue.add("Mars");
        //если бы очередь была ограничена двумя людьми, то при добавлении марса вышел бы exeption

        queue.offer("Alex");
        queue.offer("Alla");
        queue.offer("Mars");
        //а если добавлять через offer(), то такой проблемы не будет

        System.out.println(queue);
    }
}
