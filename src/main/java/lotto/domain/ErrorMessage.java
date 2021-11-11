package lotto.domain;

public enum ErrorMessage {

	MONEY_ONLY_POSITIVE_NUMBER("돈은 0 이상의 정수여야 합니다"),
	NUMBER_ONLY_POSITIVE_NUMBER("숫자는 0이상의 정수여야 합니다"),
	LOTTO_NUMBER_OUT_OF_RANGE("로또번호는 1~45번호이여야 합니다"),
	LOTTO_NUMBER_COUNT_INVALID("로또 번호 6개여야 합니다"),
	LOTTO_NUMBER_NOT_DUPLICATE("로또 티켓은 번호 중복이 없어야 합니다"),
	BONUS_NUMBER_NOT_DUPLICATE("보너스 번호는 로또 번호와 중복되면 안됩니다"),
	MATCH_CNT_OUT_OF_RANGE("일치하는 갯수는 0~6이어야 합니다");

	private final String message;

	ErrorMessage(String message) {
		this.message = message;
	}

	public String value() {
		return this.message;
	}

}