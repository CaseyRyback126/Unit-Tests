import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testCalculateDiscountWithValidArguments() {
        BigDecimal purchaseAmount = BigDecimal.valueOf(100);
        double discountPercentage = 10;
        BigDecimal expectedAmountWithDiscount = BigDecimal.valueOf(90);

        BigDecimal amountWithDiscount = Calculator.calculateDiscount(purchaseAmount, discountPercentage);

        assertThat(amountWithDiscount).isEqualByComparingTo(expectedAmountWithDiscount);
    }

    @Test
    public void testCalculateDiscountWithZeroPurchaseAmount() {
        BigDecimal purchaseAmount = BigDecimal.ZERO;
        double discountPercentage = 10;

        assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountPercentage))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }

    @Test
    public void testCalculateDiscountWithNegativePurchaseAmount() {
        BigDecimal purchaseAmount = BigDecimal.valueOf(-100);
        double discountPercentage = 10;

        assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountPercentage))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }

    @Test
    public void testCalculateDiscountWithNegativeDiscountPercentage() {
        BigDecimal purchaseAmount = BigDecimal.valueOf(100);
        double discountPercentage = -10;

        assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountPercentage))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }

    @Test
    public void testCalculateDiscountWithExceedingDiscountPercentage() {
        BigDecimal purchaseAmount = BigDecimal.valueOf(100);
        double discountPercentage = 110;

        assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountPercentage))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }
}
