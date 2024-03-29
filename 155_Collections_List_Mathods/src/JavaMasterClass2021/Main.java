package JavaMasterClass2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();

        if (theatre.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        //Collections.reverse(seatCopy);
        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number " + minSeat.getSeatNumber());
        System.out.println("Max seat number " + maxSeat.getSeatNumber());

        System.out.println("----------------------------------");

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);

        // Need to know 'amount of elements' otherwise - Source does not fit in destination
        // Better not to use (below) that way!!!
        //List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
        //Collections.copy(newList, theatre.seats);


    }

    public static void printList (List<Theatre.Seat> list){
        for (Theatre.Seat seat: list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==============================================================");
    }


    public static void sortList (List<? extends Theatre.Seat> list){
        for (int i = 0; i< list.size() - 1; i++){
            for (int j = i+1; j < list.size(); j++){
                if (list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list, i, j);
                }
            }
        }
    }

}




