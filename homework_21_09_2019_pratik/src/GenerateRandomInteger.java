public class GenerateRandomInteger {
//    24. Write a Java program to generate random integers in a specific range.
public static void main(String[] args) {
generate();
}

    public static void generate(){
        System.out.println("Genrating Random Integer Between 1 to 50: \n ");
    double randomdouble = Math.random();
    randomdouble = randomdouble*50+1;
    int randomInt = (int) randomdouble;
        System.out.println(randomInt);

    }
}
