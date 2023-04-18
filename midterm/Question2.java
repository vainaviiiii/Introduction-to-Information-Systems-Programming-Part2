package midterm;

public class Question2 {
    // No need to modify the main method. It is just used for test cases
    public static void main(String[] args) {
        // Test code for SimpleLinearRegression
        SimpleLinearRegression slr = new SimpleLinearRegression(1, -5);
        double[] x = new double[1];
        x[0] = 10.0;
        System.out.println( slr.predict( x )); // -49.0

        // Test code for MultipleLinearRegression
        double[] beta = {2.2, 3.3};
        double[] X = {10,10};

        MultipleLinearRegression mlr = new MultipleLinearRegression(5.7, beta);

        System.out.println(mlr.predict( X )); // 60.7
    }
}

// Start working from here
abstract class LinearRegression {
    private String name = "Linear Regression";

    public String getName() {
        return name;
    }

    abstract public double predict(double[] x);

}


class SimpleLinearRegression extends LinearRegression {
    private double intercept;
    private double beta;

    public SimpleLinearRegression(){
        intercept = 0;
        beta = 0;
    }

    public SimpleLinearRegression(double intercept,double beta){
        this.intercept = intercept;
        this.beta = beta;
    }

    @Override
    public double predict(double[] x) {
        double output = 0;
        for (double element:x){
            output = this.intercept + this.beta*(element);
        }
        return output;
    }
}


class MultipleLinearRegression extends LinearRegression {
    private double intercept;
    private double[] beta;

    public MultipleLinearRegression(){
        this.intercept = 0;
        this.beta = new double[1];
    }

    public MultipleLinearRegression(double intercept, double[] beta){
        this.intercept = intercept;
        this.beta = beta;
    }

    @Override
    public double predict(double[] x) {
        double output =0;
        for (int i =0;i<x.length;i++){
            output += (x[i])*(this.beta[i]);
        }
        output += this.intercept;

        return output;
    }
}

