package _1_assignment.housefactory;

import _1_assignment.housetypes.House;
import _1_assignment.housetypes.Villa;

import java.util.List;

public class VillaFactory implements ListFactory{

    @Override
    public List<House> getList() {
        House house1 = new Villa(1_000_000L,250,5,2);
        House house2 = new Villa(1_000_000L,250,5,2);
        House house3 = new Villa(1_000_000L,250,5,2);

        return List.of(house1,house2,house3);
    }
}
