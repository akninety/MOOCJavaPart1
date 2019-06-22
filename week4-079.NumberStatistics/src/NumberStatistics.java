public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
    }

    public void addNumber(int number) {
        // code here
        amountOfNumbers++;
        sum += number;
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }

    public int sum() {
        // code here
        return sum;
    }


    public double average() {
        // code here
        if(amountOfNumbers != 0){
            double average = (1.0 * sum())/amountOfNumbers;
            return average;
        }
        return 0;
        }
}
