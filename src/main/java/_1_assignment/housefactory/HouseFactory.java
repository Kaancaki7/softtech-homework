package _1_assignment.housefactory;

import _1_assignment.housetypes.House;

import java.util.List;

public class HouseFactory implements ListFactory{

    @Override
    public List<House> getList(){
        House house1 = new House(200_000L,120,3,1);
        House house2 = new House(200_000L,120,3,1);
        House house3 = new House(200_000L,120,3,1);

        return List.of(house1,house2,house3);
    }
}
