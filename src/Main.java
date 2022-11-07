import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Car car1=new Car();
        car1.setModels("MERS");

        Car car2=new Car();
        car2.setModels("BMW");

        Car car3=new Car();
        car3.setModels("TOYOTA");



        University university1=new University();
        university1.setUniversity("ALA-TOO");

        University university2=new University();
        university2.setUniversity("MANAS");

        University university3=new University();
        university3.setUniversity("BULAK");




        School school1=new School();
        school1.setLessons("MATHEMATIC");

        School school2=new School();
        school2.setLessons("LIBRIERY");

        School school3=new School();
        school3.setLessons("ENGLISH");



        Pers pers1=new Pers();
        pers1.setName("AKYL");

        Pers pers2=new Pers();
        pers2.setName("ALIM");

        Pers pers3=new Pers();
        pers3.setName("ALYMBEK");







        String[] cars={car1.getModels(),car2.getModels(),car3.getModels()};
        System.out.println(Arrays.toString(Arrays.stream(cars).toArray()));

        String[] universities={university1.getUniversity(),university2.getUniversity(),university3.getUniversity()};
        System.out.println(Arrays.toString(Arrays.stream(universities).toArray()));

        String[] schools={school1.getLessons(),school2.getLessons(),school3.getLessons()};
        System.out.println(Arrays.toString(Arrays.stream(schools).toArray()));

        String[] pers={pers1.getName(),pers2.getName(),pers3.getName()};
        System.out.println(Arrays.toString(Arrays.stream(pers).toArray()));


    }
}
