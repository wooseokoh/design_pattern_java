package strategy;

public class GaussSumStrategy implements  SumStragtegy{
    @Override
    public int get(int N) {
        return (N+1)*N/2;
    }
}
