package fizz.buzz;

public class BuzzCounter extends AbstractCounter {
    @Override
    public String count(int number) {
        String result = String.valueOf(number);
        if(number % 5 == 0) {
            result = "Buzz";
        } else if(getNextCounter() != null) {
            result = getNextCounter().count(number);
        }
        return result;
    }
}
