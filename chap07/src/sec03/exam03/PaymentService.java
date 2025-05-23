package sec03.exam03;

// 부모 클래스: 공통 결제 서비스 -> (추상화) -> 추상 클래스: 결제 서비스의 공통 설계도
public abstract class PaymentService {
	public abstract void pay(int amount);
	
}
