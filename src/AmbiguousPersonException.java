public class AmbiguousPersonException extends Exception {
    public AmbiguousPersonException(Person person) {
        super(String.format("%s shows multiple times", person.getName()));
    }
}