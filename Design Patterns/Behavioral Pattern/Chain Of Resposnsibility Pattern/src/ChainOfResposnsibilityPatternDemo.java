
public class ChainOfResposnsibilityPatternDemo {
	
	public static void main(String[] args) {
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubNumbers();
		Chain chainCalc3 = new MulNumbers();
		Chain chainCalc4 = new DivNumbers();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		Numbers request = new Numbers(4,2,"add");
		
		chainCalc1.calculate(request);
		
		System.out.println("===============================");
		
		Numbers request1 = new Numbers(4,2,"div");
		
		chainCalc1.calculate(request1);
		
	}
	
}
