import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* Исполняемый код */
        System.out.println("Hello World!");

        /* Примитивы */
        boolean bool = true; //false
        int number = 1; // -+8 billions
        double piNumber = 3.14;

        /* Можно делать арифметические операции */
        int x = 1;
        int y = 2;
        System.out.println(x + y);
        char ch = 'X';

        /* Можно делать массивы */
        int[] ints = {1, 2, 3};
        char[] chars = {'V', 'A'};

        /* Так как язык объектный, то на все примитивы есть объекты */
        Boolean boolObject = new Boolean(true);
        Integer integerObject = new Integer(5);
        String string = "Some string";
        System.out.println(string);
        List<Integer> integers = new ArrayList<>();

        Object o = new Object();

        /* Почитать про POJO */
        Human anton = new Human(2, 2, true);
        System.out.println(anton.getHands());
        anton.setHands(1);
        System.out.println(anton.getHands());

        /* Создали */
        anton.move("here", "nahui");


        // 1. Почитать про POJO, Уровни доста к полям/методам, класс Object, Инкапсуляция
        // 2. Факультативно почитать про Полиморфизм
        // 3. Создать класс Автомобиль соответствующий POJO
        // 4. У машины должен быть двигатель с какими - то параметрами, бензобак и расход топлива. Метод рассчитает за
        // какое время машина может преодолеть [входное число км] и хватит ли бензина
        // Примерный вывод в консоль
        // Время : 500 секунд
        // true

        /* Со звездочкой имитировать а чтобы она реально ехала */

    }
}
