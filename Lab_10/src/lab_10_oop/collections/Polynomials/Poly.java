package lab_10_oop.collections.Polynomials;

public interface Poly {
    int degree();

    Poly derivative();

    double coefficient(int degree);

    double[] coefficients();

}
