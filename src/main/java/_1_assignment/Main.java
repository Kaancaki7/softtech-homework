import _1_assignment.housefactory.HouseFactory;
import _1_assignment.housefactory.SummerHouseFactory;
import _1_assignment.housefactory.VillaFactory;
import _1_assignment.housetypes.House;
import _1_assignment.service.MethodService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        HouseFactory houseFactory = new HouseFactory();
        List<House> houses = houseFactory.getList();
        VillaFactory villaFactory = new VillaFactory();
        List<House> villas = villaFactory.getList();
        SummerHouseFactory summerHouseFactory = new SummerHouseFactory();
        List<House> summerHouses = summerHouseFactory.getList();

        System.out.println(MethodService.totalPrice(houses));
        System.out.println(MethodService.totalPrice(villas));
        System.out.println(MethodService.totalPrice(summerHouses));

        System.out.println(MethodService.averageSquareMeter(houses));
        System.out.println(MethodService.averageSquareMeter(villas));
        System.out.println(MethodService.averageSquareMeter(summerHouses));

        //random roomCount and saloonCount
        System.out.println(MethodService.houseFilteredRoomsAndSaloons(houses,3,1));
        System.out.println(MethodService.houseFilteredRoomsAndSaloons(villas,5,2));
        System.out.println(MethodService.houseFilteredRoomsAndSaloons(summerHouses,2,1));


    }
}
