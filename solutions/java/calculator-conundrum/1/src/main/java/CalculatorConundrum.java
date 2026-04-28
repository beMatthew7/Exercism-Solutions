
    class CalculatorConundrum {
        public String calculate(int operand1, int operand2, String operation) {
            // Handle null first to avoid NullPointerException in the switch
            if (operation == null) {
                throw new IllegalArgumentException("Operation cannot be null");
            }
            if (operation.isEmpty()) {
                throw new IllegalArgumentException("Operation cannot be empty");
            }

            String s1 = Integer.toString(operand1);
            String s2 = Integer.toString(operand2);

            switch (operation) {
                case "+":
                    return s1 + " + " + s2 + " = " + (operand1 + operand2);
                case "*":
                    return s1 + " * " + s2 + " = " + (operand1 * operand2);
                case "/":
                    try {
                        int result = operand1 / operand2;
                        return s1 + " / " + s2 + " = " + result;
                    } catch (ArithmeticException e) {
                        // Instruction: throw IllegalOperationException with message and cause
                        throw new IllegalOperationException("Division by zero is not allowed", e);
                    }
                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        }
    }
