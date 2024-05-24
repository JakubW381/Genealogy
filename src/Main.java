import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PlantUMLRunner.setJarPath("./plantuml-1.2024.3.jar");
        try {
            List<Person> people = Person.fromCsv("family.csv");
            PlantUMLRunner.generate(
                    Person.generateTree(people,
                            //person -> Person.sortByLifespan(people).contains(person),
                            person -> Person.findOldestLiving(people) == person,
                            text->text+" #FFFF00"),
                    "image_output", "all"
            );
            System.out.println(Person.findOldestLiving(people));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}