public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight =50;
        int growth = 150;
        int imt = service.calculate(growth, weight);
        System.out.println(imt);

    }
}
