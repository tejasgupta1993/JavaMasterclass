package com.company;

public class Main {

    public static void main(String[] args){

//        MyLinkedList list = new MyLinkedList(null);
//        list.traverse(null);
//
//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
//        String[] data = stringData.split(" ");
//        for(String s: data){
//            list.addItem(new Node(s));
//        }
//
//        list.traverse(list.getRoot());

//        MyLinkedList list1 = new MyLinkedList(null);
//        list1.traverse(null);
//
//        String stringData1 = "5 7 3 9 8 2 1 0 4 6";
//        String[] data1 = stringData1.split(" ");
//        for(String s: data1){
//            list1.addItem(new Node(s));
//        }
//
//        list1.traverse(list1.getRoot());
//
//        list1.removeItem(new Node("3"));
//        list1.traverse(list1.getRoot());
//
//        list1.removeItem(new Node("5"));
//        list1.traverse(list1.getRoot());
//
//        list1.removeItem(new Node("0"));
//        list1.removeItem(new Node("4"));
//        list1.removeItem(new Node("2"));
//        list1.traverse(list1.getRoot());
//
//        list1.removeItem(new Node("9"));
//        list1.traverse(list1.getRoot());
//        list1.removeItem(new Node("8"));
//        list1.traverse(list1.getRoot());
//        list1.removeItem(new Node("6"));
//        list1.traverse(list1.getRoot());
//        list1.removeItem(list1.getRoot());
//        list1.traverse(list1.getRoot());
//        list1.removeItem((list1.getRoot()));
//        list1.traverse(list1.getRoot());

        SearchTree tree = new SearchTree(null);
        tree.traverse(null);

//        String stringData1 = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData1 = "5 7 3 9 8 2 1 0 4 6";
        String[] data1 = stringData1.split(" ");
        for(String s: data1){
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
        tree.removeItem((tree.getRoot()));
        tree.traverse(tree.getRoot());
    }
}
