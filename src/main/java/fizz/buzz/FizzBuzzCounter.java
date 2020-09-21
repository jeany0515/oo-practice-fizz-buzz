package fizz.buzz;

public class FizzBuzzCounter extends AbstractCounter {

    @Override
    public String count(int number) {
        String result = String.valueOf(number);
        if(number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if(getNextCounter() != null) {
            result = getNextCounter().count(number);
        }

        return result;
    }
}
