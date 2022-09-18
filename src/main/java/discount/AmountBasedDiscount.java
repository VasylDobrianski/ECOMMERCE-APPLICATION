package discount;

import java.util.UUID;

public class AmountBasedDiscount extends Discount{

    private Double discountAmount;

    public AmountBasedDiscount(UUID Id, String name, Double thresholdAmount, Double discountAmount) {
        super(Id, name, thresholdAmount);
        this.discountAmount = discountAmount;
    }


    @Override
    public Double calculateCartAmountAfterDiscountApplied(Double amount) {
        return null;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }
}
