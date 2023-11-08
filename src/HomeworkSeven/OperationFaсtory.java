package HomeworkSeven;

// использую паттерн фабрика
public class OperationFaсtory {
    public static ComplexOperation getOperation(String type) {
        switch (type) {
            case "+":
                return new SumOperation();
            case "-":
                return new SubstractionOperation();
            case "*":
                return new MultyplyOperation();
            case "/":
                return new DivisionOperation();
            default:
                throw new IllegalArgumentException("Unknown operation: " + type);
        }
    }

}
