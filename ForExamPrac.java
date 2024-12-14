
class TComplex {
    int real;
    int imag;
    int real1;
    int img1;

    void setComplex(TComplex c) {
        this.real = c.real;
        this.imag = c.imag;
    }

    void mult(TComplex c1, TComplex c2) {
        real = (c1.real * c2.real) - (c1.imag * c2.imag);
        imag = (c1.real * c2.imag) + (c1.imag * c2.real);
    }

    void sum(TComplex c1, TComplex c2){
        real1 = (c1.real+c2.real);
        img1 = (c1.imag+c2.imag);
    }

    void display() {
        // System.out.println(real + "+" + "i" + imag);
        System.out.println(real1+"+"+"i"+img1);
    }
}

public class ForExamPrac {
    public static void main(String[] args) {
        TComplex c1 = new TComplex();
        c1.real = 10;
        c1.imag = 20;
        c1.setComplex(c1);

        TComplex c2 = new TComplex();
        c2.real = 30;
        c2.imag = 40;
        c2.setComplex(c2);
        
        // TComplex makeMultiplication = new TComplex();
        // makeMultiplication.mult(c1, c2);
        // makeMultiplication.display();

        TComplex sum = new TComplex();
        sum.sum(c1, c2);
        sum.display();
}
}