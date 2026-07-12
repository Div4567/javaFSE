package Algorithm;

public class FinancialForecast {

    /**
     * Recursively calculates the future value based on past/expected growth.
     * 
     * @param currentValue The current value of the asset or portfolio.
     * @param growthRate   The expected annual growth rate (e.g., 0.05 for 5%).
     * @param years        The number of years into the future to forecast.
     * @return             The predicted future value.
     */
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        // Base Case: If we have reached 0 years, the forecast is complete.
        if (years <= 0) {
            return currentValue;
        }
        
        // Recursive Case: Calculate the value for the next year, 
        // then recursively call the function for the remaining years.
        double nextYearValue = currentValue + (currentValue * growthRate);
        
        return predictFutureValue(nextYearValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialInvestment = 10000.00; // $10,000
        double expectedGrowthRate = 0.07;    // 7% annual growth
        int forecastPeriod = 10;             // 10 years
        
        System.out.println("--- Financial Forecast ---");
        System.out.println("Initial Value: $" + initialInvestment);
        System.out.println("Annual Growth Rate: " + (expectedGrowthRate * 100) + "%");
        
        double projectedValue = predictFutureValue(initialInvestment, expectedGrowthRate, forecastPeriod);
        
        System.out.printf("Projected Value after %d years: $%.2f%n", forecastPeriod, projectedValue);
    }
}
