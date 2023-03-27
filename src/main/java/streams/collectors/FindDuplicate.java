package streams.collectors;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,2,3,4,5,6,7,8,9,5,4,6);
        Set<Integer> duplicateList  =list.stream().filter(a-> Collections.frequency(list,a)>1).collect(Collectors.toSet()) ;
        System.out.println(duplicateList);
    }
}
