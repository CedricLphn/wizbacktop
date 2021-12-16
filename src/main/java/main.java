public class main {

    public static void main(String[] args) {
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            System.out.println(Wizbaktop.run(num));
        }
    }

}
