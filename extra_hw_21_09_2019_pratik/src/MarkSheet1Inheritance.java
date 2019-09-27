public class MarkSheet1Inheritance extends MarkSheet1 {
// Inheritance from Marksheet1
//    Program for generating Marksheet through use of 'extends' from "Marksheet1"
    public MarkSheet1Inheritance(String name) {
        super(name);
    }

    public static void main(String[] args) {
        String name = null;


        MarkSheet1Inheritance obj = new MarkSheet1Inheritance(name);
        obj.student();
        obj.number();
        obj.setMathsmarks();
        obj.setSciencemarks();
        obj.setEnglishmarks();
        obj.setResult();
    }

    private void Rollno() {
    }
}
