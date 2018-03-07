package ex_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainTwo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 10821, 223, 232, 1, -48923, 3, 1, 34);

        getResult(list, new MathOperation() {
            @Override
            public Integer calculate(List<Integer> integers) {  // nie potrzeba tu nawet klas MaxOperation i MinOperation
                Integer i = Collections.max(integers);          // klasa anonimowa - stworzenie nowej instancji interfejsu oraz
                return i;                                       // implementacja jego metody abstrakcyjnej i jej wypełnienie
            }
        });
                                                        // implementacja instancji interfejsu :
        // przy pomocy lambdy                           // <lista parametrów> -> <ciało wyrażenia> (integers -> {..ciało..})
                                                        // integers - argument metody abstrakcyjnej interfejsu
        getResult(list, integers -> {                   // pominięcie jawnego tworzenia instancji interfejsu i nazwy metody
                                                        // tworzenie ciała metody abstrakcyjnej
            Integer i = Collections.min(integers);
            return i;

        });
    }

    // argumenty - lista integerow i implementacja interfejsu Mathoperation

    public static void getResult(List<Integer> ints, MathOperation mathOperation) {
        Integer result = mathOperation.calculate(ints);     // implementacja metody abstrakcyjnej interfejsu
        System.out.println(result);

    }
}
