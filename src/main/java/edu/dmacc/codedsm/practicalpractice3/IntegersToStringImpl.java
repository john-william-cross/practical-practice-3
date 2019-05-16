package edu.dmacc.codedsm.practicalpractice3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class IntegersToStringImpl implements IntegersToString {

    @Override
    public List<String> integersToString(List<Integer> integers) {


        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);

        List<String> newList = list.stream()
                .map(s -> String.valueOf(s))
                .collect(Collectors.toList());
        newList = Collections.singletonList("Number was: " + newList);
        return  newList;
    }

    public String addTen() {
        java.util.List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        java.util.List<Integer> add10 = list2.stream()
                .map(x -> x + 10)
                .collect(Collectors.toList());
        return "add 10: " + add10;
    }


}
