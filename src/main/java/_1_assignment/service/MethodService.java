package _1_assignment.service;

import _1_assignment.housetypes.House;

import java.util.ArrayList;
import java.util.List;

public class MethodService {

    public static long totalPrice(List<House> houses){
        long totalPrice = 0;
        for (House house : houses){
            totalPrice += house.getPrice();
        }
        return totalPrice;
    }

    public static long averageSquareMeter(List<House> houses){
        long totalSquareMeter = 0;
        for (House house : houses){
            totalSquareMeter += house.getSquareMeter();
        }
        int numberOfHouse = houses.size();
        return totalSquareMeter / numberOfHouse;
    }

    public static List<House> houseFilteredRoomsAndSaloons(List<House> houses,int roomCount, int saloonCount) {
        List<House> filteredHouses = new ArrayList<House>();
        for (House house : houses){
            if (house.getNumberOfRooms() == roomCount && house.getNumberOfSaloon() == saloonCount){
                filteredHouses.add(house);
            }
        }
        return filteredHouses;
    }
}
