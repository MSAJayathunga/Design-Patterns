

    public class adapterDemo {
        public static void main(String[] args) {

            // Create instances of SimpleCalculator, AdvancedCalculator, and Adapter
            Adaptor adaptor = new Adaptor();
            Adaptor.SimpleCalculatorInterface simpleCalculator = adaptor.new SimpleCalculator();
            Adaptor.AdvancedCalculatorInterface advancedCalculator = adaptor.new AdvancedCalculator();


            // Perform addition using SimpleCalculator
            int simpleAdditionResult = simpleCalculator.add(5, 4);
            System.out.println("SimpleCalculator Addition: " + simpleAdditionResult);

            // Perform addition and subtraction using AdvancedCalculator
            int advancedAdditionResult = advancedCalculator.add(5, 4);
            int advancedSubtractionResult = advancedCalculator.subtract(5, 4);
            System.out.println("AdvancedCalculator Addition: " + advancedAdditionResult);
            System.out.println("AdvancedCalculator Subtraction: " + advancedSubtractionResult);
        }
    }

