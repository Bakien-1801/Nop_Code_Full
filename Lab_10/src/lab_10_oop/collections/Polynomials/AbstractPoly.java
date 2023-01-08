package lab_10_oop.collections.Polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {

    double[] derive() {
        if (degree() == 0) {
            return new double[]{0};
        }
        double[] diff = new double[degree()];
        for (int i = 0; i < degree(); i++) {
            diff[i] = coefficient(i + 1) * (i + 1);
        }
        return diff;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Poly poly = (Poly) obj;
        if (degree() != poly.degree()) {
            return false;
        }
        for (int i = 0; i <= degree(); i++) {
            if (coefficient(i) != poly.coefficient(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        String s = "Poly[";
        for (int i = 0; i <= degree(); i++) {
            if (coefficient(i) != 0) {
                if (i == 0) {
                    s += coefficient(i);
                } else {
                    if (s.charAt(s.length() - 1) != '[') {
                        if (coefficient(i) > 0) {
                            s += " + ";
                        } else {
                            s += " - ";
                        }
                    }
                    s += Math.abs(coefficient(i));
                    if (i == 1) {
                        s += "x";
                    } else {
                        s += "x^" + i;
                    }
                }
            }
        }
        s += "]";
        return s;
    }
}