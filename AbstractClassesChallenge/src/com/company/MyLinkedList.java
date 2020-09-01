package com.company;

public class MyLinkedList implements NodeList{

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            // The list is empty , so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem!=null){
            int comparision = (currentItem.compareTo(newItem));
            if(comparision < 0){
                // newItem is greater , move right
                if(currentItem.next()!=null){
                    currentItem = currentItem.next();
                }else {
                    // there is no next
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            }else if(comparision > 0){
                // newitem is less, move left
                if(currentItem.previous()!=null){
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                }else {
                    // node is root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }else {
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item!=null){
            System.out.println("Deleting item: " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem!=null){
            int comparision = currentItem.compareTo(item);
            if(comparision==0){
                if(currentItem==this.root){
                    this.root = currentItem.next();
                }else{
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next()!=null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if(comparision < 0){
                currentItem = currentItem.next();
            }else{
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("List is null");
        }else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }

        // not a good idea for linkedlist to use recursion
//        if(root != null){
//            System.out.println(root.getValue());
//            traverse(root.next());
//        }
    }
}
