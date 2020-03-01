package somme;

public class Solver implements SolverInterface {
    @Override
    public Double resolve(double x, double y) {
        if (x>y){
            return y+x;
        }
        else{
            return x + y;
        }
    }
}
