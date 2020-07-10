package com.vlad.algorithms;

import java.util.LinkedList;

/*
A TrainComposition is built by attaching and detaching wagons from the left and the right sides, efficiently with respect to time used.

For example, if we start by attaching wagon 7 from the left followed by attaching wagon 13, again from the left, we get a composition of two wagons (13 and 7 from left to right). Now the first wagon that can be detached from the right is 7 and the first that can be detached from the left is 13.

Implement a TrainComposition that models this problem.

train 13 - train 7
 */

public class TrainComposition {

    private LinkedList<Integer> train;

    public TrainComposition() {
        this.train = new LinkedList<>();
    }

    public void attachWagonFromLeft(int wagonId) {
        this.train.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
        this.train.addLast(wagonId);
    }

    public int detachWagonFromLeft() {
        if (!train.isEmpty()) {
            return this.train.removeFirst();
        }
        return -1;
    }

    public int detachWagonFromRight() {
        if (!train.isEmpty()) {
            return this.train.removeLast();
        }
        return -1;
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        System.out.println(tree.detachWagonFromRight()); // 7
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}