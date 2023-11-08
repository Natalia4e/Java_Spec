package HomeworkSeven;

public class ComplexCalculator {
    public ComplexNumber calculate(String operationType, ComplexNumber a, ComplexNumber b) {
        ComplexOperation operation = OperationFaсtory.getOperation(operationType);
        return operation.calculate(a, b);
    }
}

