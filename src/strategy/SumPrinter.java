package strategy;

public class SumPrinter {
    void print(SumStragtegy stragtegy, int N){
        System.out.printf("The Sum of 1 - %d: ", N);
        System.out.println(stragtegy.get(N));
    }

}
