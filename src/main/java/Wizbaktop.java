import java.util.ArrayList;
import java.util.List;

public class Wizbaktop {

    private int number;


    public Wizbaktop(int number) {
        this.number = number;
    }

    public String execute() {
        StringBuilder stringBuilder = new StringBuilder();
        if(number % 3 == 0) {
            stringBuilder.append("Wiz");
        }

        if(number % 5 == 0) {
            stringBuilder.append("Bak");
        }

        if(number % 7 == 0) {
            stringBuilder.append("Top");
        }

        List<Integer> integers = extractDigit(number);

        for(int i = integers.size()-1; i > -1; i--) {

            String tmp = String.valueOf(integers.get(i));
            if(tmp.contains("3")) {
                stringBuilder.append("Wiz");
            }
            if(tmp.contains("5")) {
                stringBuilder.append("Bak");
            }

            if(tmp.contains("7")) {
                stringBuilder.append("Top");
            }

            if(tmp.contains("0")) {
                stringBuilder.append("*");
            }

        }

        if(stringBuilder.toString().equals("")) {
            stringBuilder.append(number);

            return stringBuilder.toString();
        }
        return stringBuilder.toString();
    }

    private ArrayList<Integer> extractDigit(int n) {
        ArrayList<Integer> numbers  = new ArrayList<Integer>();

        while (n > 0) {
            int d = n / 10;
            int k = n - d * 10;
            n = d;
            numbers.add(k);
        }

        return numbers;

    }

    public static String run(int number) {
        Wizbaktop wizbaktop = new Wizbaktop(number);
        return wizbaktop.execute();
    }

}
