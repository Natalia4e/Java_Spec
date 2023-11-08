package HomeworkSeven;

public class DivisionOperation implements ComplexOperation{
    public ComplexNumber calculate (ComplexNumber a, ComplexNumber b){
        double realPart = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) /
                (b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary());
        double imaginaryPart = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) /
                (b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary());
        return new ComplexNumber(realPart, imaginaryPart);
    }
    }

