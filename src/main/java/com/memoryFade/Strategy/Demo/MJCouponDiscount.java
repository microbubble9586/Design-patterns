package src.main.java.com.memoryFade.Strategy.Demo;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author memoryFade
 * @version 1.0
 * @date 2022/3/9 16:10
 */
public class MJCouponDiscount implements ICouponDiscount<Map<String, String>> {

    /**
     * 满减计算
     * 1.判断满足X元后-n元，否则不减
     * 2.最低支付金额1元
     *
     * @param couponInfo 券折扣信息，券折扣信息；直减、满减、折扣、N元购
     * @param skuPrice   sku金额
     * @return 金额
     */
    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
        String x = couponInfo.get("x");
        String o = couponInfo.get("o");
        if (skuPrice.compareTo(new BigDecimal(x)) < 0) {
            return skuPrice;
        }
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(o));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
