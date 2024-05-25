package Class8;

public class GenericMain {
    public static void main(String[] args) {
        System.out.println("=================Non - Generic================");
        StringTest test = new StringTest("Sagar");
        System.out.println(test.getStr());

        IntegerTest integer = new IntegerTest(100);
        System.out.println(integer.getInteger());

        LongTest ltest = new LongTest(885L);
        System.out.println(ltest.getaLong());

        DoubleTest dtest = new DoubleTest(441.25);
        System.out.println(dtest.getaDouble());
        System.out.println("=================Generic Without Restriction================");
        Generic<String> stringGeneric = new Generic<>("SAGAR");
        System.out.println(stringGeneric.getObj());

        Generic<Integer> integerGeneric = new Generic<>(155);
        System.out.println(integerGeneric.getObj());

        Generic<Long> Along = new Generic<>(4144L);
        System.out.println(Along.getObj());

        Generic<Float> aFloat = new Generic<Float>(4551.32f);
        System.out.println(aFloat.getObj());

        Generic<Double> aDouble = new Generic<>(445.2);
        System.out.println(aDouble.getObj());

        System.out.println("=================Generic With Restriction================");
        NumberTest<Integer> integerNumberTest = new NumberTest<>(452);
        System.out.println(integerNumberTest.getObj());

        NumberTest<Double> doubleNumberTest= new NumberTest<>(451.36);
        System.out.println(doubleNumberTest.getObj());


//        NumberTest<String> stringNumberTest = new NumberTest<String>("5555");
//        System.out.println(stringNumberTest.getObj());





    }
}
