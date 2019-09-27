public class CalculatorInheritance extends Calculator{
    public CalculatorInheritance(int a) {super(a); }

    public static void main(String[] args) {
        int a = 0;
        CalculatorInheritance cal = new CalculatorInheritance(a);
        cal.Add();
        cal.Sub();
        cal.Multi();
        cal.Div();

    }
}
