import java.util.Scanner;

public class MyCalc {
	
	Scanner scanner = new Scanner(System.in);
	
	int select

	private int num2;
	
	MyCalc(){
		this.x = scanner.nextInt();
		this.y = scanner.nextInt();
		this.select = scanner.nextInt();
	}
	
	void showMenu() {
		Scanner input = new Scanner(System.in);
		
		int choice = input.nextInt();
		
		
		double num1 = 0;
		double num2 = 0;
		if (choice == 1)
				addNumbers(num1, num2);
		if (choice == 2)
				subNumbers(num1, num2);
		if (choice == 3)
				multNumbers(x, y);
		if (choice == 4)
				divNumbers(x, y);
		
		}
	
	
	void getNumbers() {
		getFirstNumber();
		getSecondNumber();
	}

	double getSecondNumber() {
		Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the second number : ");
        double num2 = input.nextDouble(); // Second number storage

        return num2;
	}

	double getFirstNumber() {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble(); // First number storage

        return num1;
	}

	double divNumbers(double x, double y) {
		// TODO Auto-generated method stub
		double result = y / x;
		return result;
	}

	double multNumbers(double x, double y) {
		// TODO Auto-generated method stub
		double result = x * y;
		return result;
	}

	double subNumbers(double x, double y) {
		// TODO Auto-generated method stub
		double result = x - y;
		return result;
	}

	double addNumbers() {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	
//	boolean checkIfDigit(int x, int y) {
//		if(x == int(x) && (y == int(y))) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
	Double convertNumbers(String a, String b) {
		Double conv_x = Double.valueOf(a);
		Double conv_y = Double.valueOf(b);
		
		return conv_x + conv_y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc myCalc = new MyCalc();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("메뉴를 선택해 주세요 : ");
		myCalc.showMenu();
		
		double x = getFirstNumber();
		double y = getSecondNumber();
		
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		myCalc.getFirstNumber();
		
		System.out.print("두번째 숫자를 입력해주세요 : ");
		myCalc.getSecondNumber();
		
		
		
	}
}
