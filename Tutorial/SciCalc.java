public class SciCalc extends advCalc{// advCalc inharits cals and SciCalc inharits advCalc There fore this is called multilevel Inharitance.
    public int power(int x, int n){
        return (int)Math.pow(x, n);
    }
    public double root(int x){
        return Math.pow(x,0.5);
    }
}
