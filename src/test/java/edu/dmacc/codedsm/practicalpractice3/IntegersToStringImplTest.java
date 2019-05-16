package edu.dmacc.codedsm.practicalpractice3;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class IntegersToStringImplTest {
    private IntegersToStringImpl classUnderTest;

    @Before
    public void setup()throws Exception {

        classUnderTest = new IntegersToStringImpl();

    }

    @Test
    public String shouldAddTen() {

        java.util.List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        java.util.List<Integer> add10 = list2.stream()
                .map(x -> x + 10)
                .collect(Collectors.toList());
        return add10;

        assertSame(shouldAddTen(), shouldAddTen());

    }
}