package calc_1;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator calculator = new MyCalculator();
		calculator.calAdd(10,5, new CalAdd());
		calculator.calSub(10,5, new CalSub());
		calculator.calMul(10,5, new CalMul());
		calculator.calDiv(10,5, new CalDiv());
	}
}