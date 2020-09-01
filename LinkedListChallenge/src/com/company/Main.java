package com.company;

import java.util.*;

public class Main {

    /////////  iterator me current vala object us variable k andar hota h ///////////

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Storm Bringer", "Deep Purple");
        album.addSong("StormBringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The Gypsy", 4.2);
        album.addSong("Soldier of the fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Let's rock", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("SnowBalled", 4.51);
        album.addSong("Evil Walks", 5.25);
        album.addSong("C.O.D.", 5.32);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed King", playList); // Does not exist

        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList); // Does not exist

        play(playList);


    }

    private static void play(LinkedList<Song> playList){

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.size()==0){
            System.out.println("no song in playList");
            return;
        }else{
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist Complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Playing: " + listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of the playlist!!!!!!");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now Playing: " + listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist!!!!!!");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now rePlaying: " + listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("We are at the start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now rePlaying: " + listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("We have reached end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing: " + listIterator.next());
                    }else if(listIterator.hasPrevious()){
                        System.out.println("Now playing: " + listIterator.previous());
                    }
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions: \nPress:");
        System.out.println("0 - To quit\n" +
                           "1 - To play next song\n" +
                           "2 - To play previous song\n" +
                           "3 - To replay the current song\n" +
                           "4 - To Print the songs of playlist\n" +
                           "5 - To Print available actions\n" +
                           "6 - To delete current song from playList");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("============================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("============================");
    }
}
