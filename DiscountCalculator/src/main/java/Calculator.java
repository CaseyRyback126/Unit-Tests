import java.math.BigDecimal;

public class Calculator {
    public static BigDecimal calculateDiscount(BigDecimal purchaseAmount, double discountPercentage) {
        if (purchaseAmount == null || purchaseAmount.compareTo(BigDecimal.ZERO) <= 0 ||
                discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Invalid arguments");
        }

        BigDecimal discount = purchaseAmount.multiply(BigDecimal.valueOf(discountPercentage / 100));
        return purchaseAmount.subtract(discount);
    }
}
