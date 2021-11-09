package lotto.domain;

public class PurchaseCount {

    private final int count;

    public PurchaseCount(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("구입 갯수는 0개 이상이어야 합니다. (입력값: " + count + ")");
        }
        this.count = count;
    }

    public boolean isGreaterThanZero() {
        return count > 0;
    }

    public PurchaseCount minus(int count) {
        return new PurchaseCount(this.count - count);
    }
}