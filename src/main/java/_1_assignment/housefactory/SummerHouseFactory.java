package _1_assignment.housefactory;

import _1_assignment.housetypes.House;
import _1_assignment.housetypes.SummerHouse;

import java.util.List;

public class SummerHouseFactory implements ListFactory{

    @Override
    public List<House> getList() {
        House house1 = new SummerHouse(600_000L,100,2,1);
        House house2 = new SummerHouse(600_000L,100,2,1);
        House house3 = new SummerHouse(600_000L,100,2,1);

        return List.of(house1,house2,house3);

    }
}
