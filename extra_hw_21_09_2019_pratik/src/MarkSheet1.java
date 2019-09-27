import java.util.Scanner;
//Program for generating Marksheet

public class MarkSheet1 {
     String Studentname;
     int Rollno;
     int Mathsmarks;
     int Sciencemarks;
     int Englishmarks;
     int Percentage;
     String  Result;
     String Grade;



    public MarkSheet1(String name) {this.Studentname = name;}


    public  void student () {

        Scanner SC = new Scanner(System.in);
        System.out.println("Please Input Student Name:");
        Studentname = SC.nextLine();
    }
    public void number() {
        System.out.println("Please Input Roll No:");
        Scanner SC = new Scanner(System.in);
        Rollno = SC.nextInt();
        System.out.println("Please Input Maths Marks:");
    }
    public void setMathsmarks() {
        Scanner SC = new Scanner(System.in);
        Mathsmarks = SC.nextInt();
        if (Mathsmarks < 0 || Mathsmarks > 100) {
            System.out.println("Error Msg: Marks must not be less than 0 and greater than 100");
            System.out.println("Please Input Maths Marks:");
            Mathsmarks = SC.nextInt();
        }
    }
        public void setSciencemarks() {
            System.out.println("Please Input Science Marks:");
            Scanner SC = new Scanner(System.in);
            Sciencemarks = SC.nextInt();
            if (Sciencemarks < 0 || Sciencemarks > 100) {
                System.out.println("Error Msg: Marks must not be less than 0 and greater than 100");
                System.out.println("Please Input Science Marks:");
                Sciencemarks = SC.nextInt();
            }
        }
        public void setEnglishmarks() {
            System.out.println("Please Input English Marks:");
            Scanner SC = new Scanner(System.in);
            Englishmarks = SC.nextInt();
            if (Englishmarks < 0 || Englishmarks > 100) {
                System.out.println("Error Msg: Marks must not be less than 0 and greater than 100");
                System.out.println("Please Input English Marks:");
                Englishmarks = SC.nextInt();
            }
        }
        public void setResult(){
        Percentage = 100*(Mathsmarks+Sciencemarks+Englishmarks)/300;

        if (Percentage >= 35){
            Result = "PASS";
        }
        else if (Percentage < 35) {
            Result = "FAIL";
        }
        if (Percentage >=80){
            Grade = "A+";
        }
        else if (Percentage >=60){
            Grade = "A";
        }
        else if (Percentage >=50){
            Grade = "B";
        }
        else if (Percentage >=35){
            Grade = "C";
        }

        System.out.println(" ________________________________________");
        System.out.println("|                                        |");
        System.out.println("|                Mark Sheet              |");
        System.out.println("|________________________________________|");
        System.out.println("|        Name        :         " + (Studentname) + "       |");
        System.out.println("|       Roll No      :          " + (Rollno) + "        |");
        System.out.println("|________________________________________|");
        System.out.println("|      Subjects      :       Marks       |");
        System.out.println("|________________________________________|");
        System.out.println("|        Math        :         " + (Mathsmarks) + "        |");
        System.out.println("|       Science      :         " + (Sciencemarks) + "        |");
        System.out.println("|       English      :         " + (Englishmarks) + "        |");
        System.out.println("|________________________________________|");
        System.out.println("|        Total       :        " + (Mathsmarks + Sciencemarks + Englishmarks) + "        |");
        System.out.println("|      Percentage    :         " +(Percentage) + "        |");
        System.out.println("|        Result      :        "+(Result)+"       |");
        System.out.println("|         Grade      :         "+(Grade)+"        |");
        System.out.println("|________________________________________|");
    }
}
