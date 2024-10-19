public class Adaptor {
      interface SimpleCalculatorInterface {
        int add(int a, int b);
    }

    class SimpleCalculator implements SimpleCalculatorInterface {
        @Override
        public int add(int a, int b) {

            return a + b;
        }
    }

    interface AdvancedCalculatorInterface {
        int add(int a, int b);

        int subtract(int a, int b);
    }

      class AdvancedCalculator implements AdvancedCalculatorInterface {
        @Override
        public int add(int a, int b) {

            return a + b;
        }
        @Override
        public int subtract(int a, int b) {

            return a - b;
        }
    }
    // CalculatorAdapter.java
    class CalculatorAdapter implements SimpleCalculatorInterface {
        private AdvancedCalculatorInterface advancedCalculator;

        public CalculatorAdapter(AdvancedCalculatorInterface advancedCalculator) {
            this.advancedCalculator = advancedCalculator;
        }

        @Override
        public int add(int a, int b) {
            // Adapt the sum method to the add method
            return advancedCalculator.add(a, b);
        }
    }
}