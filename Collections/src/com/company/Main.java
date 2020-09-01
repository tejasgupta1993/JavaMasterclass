package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian", 8, 12);
//        theatre.getSeats();

//        if(theatre.reserveSeat("H11")){
//            System.out.println("Please Pay");
//        }else{
//            System.out.println("Sorry seat is taken");
//        }
//
//        if(theatre.reserveSeat("H11")){
//            System.out.println("Please Pay");
//        }else{
//            System.out.println("Sorry, seat is taken");
//        }

        if(theatre.reserveSeat("D12")){
            System.out.println("Please Pay for D12");
        }else{
            System.out.println("Sorry seat D12 is taken");
        }

        if(theatre.reserveSeat("D12")){
            System.out.println("Please Pay for D12");
        }else{
            System.out.println("Sorry seat D12 is taken");
        }

        if(theatre.reserveSeat("B13")){
            System.out.println("Please Pay for B13");
        }else{
            System.out.println("Sorry seat B13 is taken");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);
//        printList(seatCopy);

//        seatCopy.get(1).reserve();

//        if(theatre.reserveSeat("A02")){
//            System.out.println("Please Pay");
//        }else{
//            System.out.println("Sorry seat is taken");
//        }

//        Collections.reverse(seatCopy);
//        Collections.shuffle(seatCopy);
//        System.out.println("Print seatCopy: ");
//        printList(seatCopy);
//        System.out.println("Printing theatre.seat");
//        printList(theatre.seats);
//
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("Min seat number: " + minSeat.getSeatNumber() +
//                                    "\nMax seat number: " + maxSeat.getSeatNumber());
//
//        sortList(seatCopy);
//        System.out.println("Print sorted seatCopy: ");
//        printList(seatCopy);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13));
        priceSeats.add(theatre.new Seat("A00", 13));
        priceSeats.add(theatre.new Seat("C00", 13));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat: list){
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("===================================================================================");
    }

//    public static void sortList(List<? extends Theatre.Seat> list){
//        for(int i = 0; i< list.size()-1; i++){
//            for(int j = i+1; j< list.size(); j++){
//                if(list.get(i).compareTo(list.get(j)) > 0){
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }
}
