package fizz.buzz;

public class DefaultFizzCounter extends AbstractCounter{
    @Override
    public String count(int number) {
        String result = String.valueOf(number);
        if(result.contains("3")) {
            result = "Fizz";
        } else if(getNextCounter() != null) {
            result = getNextCounter().count(number);
        }

        return result;
    }
}
