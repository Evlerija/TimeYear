import java.time.Year;

public class Main {
    TimeYear timeYear;

    public static void main(String[] args) {
        TimeYear winter = TimeYear.SPRING;
        System.out.println(winter);
        System.out.println(winter.getDescription());

        for (TimeYear day : TimeYear.values()) {
            System.out.println(day);
        }
        //Year(winter);
    }

    public static void Year(TimeYear timeYear){
        switch (timeYear){
            case WINTER:
                System.out.println("Я люблю зиму!");
            case SUMMER:
                System.out.println("Я не люблю это");
            case SPRING:
                System.out.println("Я не люблю это");
            case AUTUMN:
                System.out.println("Я не люблю это");
        }
    }

}
