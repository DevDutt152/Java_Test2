package CollectionsCode.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Set_Code {
    public static void main(String... args) {
        List<Integer> nums = List.of(55, 66, 55, 43, 65, 23, 65, 32, 433);
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        System.out.println(list);
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }


    }
}
/*
i ll never break your hear and ove the cry in the broke down car and four years n call now
u look  pretty ujn an hto+l
 */