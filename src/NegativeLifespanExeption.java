public class NegativeLifespanExeption extends Exception{
    public NegativeLifespanExeption(Person person) {
        super(String.format("%s, born %s later than  %s died", person.getName(), person.getBirthDate(), person.getDeathDate()));
    }
}