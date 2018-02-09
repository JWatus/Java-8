package ex_3;

import ex_3.MathOperation;

import java.util.Collections;
import java.util.List;

public class MinOperation implements MathOperation {
    @Override
    public Integer calculate(List<Integer> list) {

        Integer i = Collections.min(list);

        return i;
    }
}
