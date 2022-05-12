# 기능 요구사항

- [ ] 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
  - [ ] 로또 1장의 가격은 1000원이다. 
  - [ ] (구입금액 / 로또 한장 가격) 개 만큼 로또를 발급한다. 
  - [ ] 구매후 잔돈은 버린다 (1700원 -> 1장)
  - [ ] 구입 금액이 1장 가격보다 적으면 구매실패exception을 발생한다.
- [ ] 지난주 당첨 번호를 입력받는다.
- [ ] 당첨 통계는 3개가 일치한 로또의 개수부터 6개가 일치한 로또의 개수까지 보여준다.
- [ ] 총 수익률을 출력한다.
  - [ ] 총 수익률은 (당첨총액 / 구입금액)을 소수 둘쨰자리까지 표기한다.