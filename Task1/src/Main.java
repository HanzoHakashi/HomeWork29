import java.util.Comparator;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);
        print("Sort by breed");
        cats.sort(Comparator.comparing(Cat::getBreed));//Сортировка по породе
        Printer.print(cats);
        print("Sort by name, then goes age");
        cats.sort(Comparator.comparing(Cat::getName).thenComparing(Cat::getAge));//Сортировка по имени и возрасту
        Printer.print(cats);
        print("Eliminating by lenght of name");
        cats.removeIf(i->i.getName().length()==5);//Удаление элемента из списка, при условии, что длина равна 5
        Printer.print(cats);
        print("Eliminating by color of cat");
        cats.removeIf(i->i.getColor().equals(Cat.Color.SILVER));//Удаление элемента из списка, по цвету.
        Printer.print(cats);

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        //cats.sort(?);
        //Printer.print(cats);
    }

    public static void print(String message){
        System.out.println(message);
    }


}
