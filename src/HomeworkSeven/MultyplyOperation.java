package HomeworkSeven;

public class MultyplyOperation implements ComplexOperation{
    public ComplexNumber calculate (ComplexNumber a, ComplexNumber b){
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(real, imaginary);
    }
}
