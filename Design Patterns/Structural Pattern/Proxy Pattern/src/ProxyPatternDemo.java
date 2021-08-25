/*
	Simply, proxy means an object representing another object.

	According to GoF, a Proxy Pattern "provides the control for accessing the original object".

	So, we can perform many operations like hiding the information of original object, on 
	demand loading etc.


*/
public class ProxyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OfficeInternetAccess access = new ProxyInternetAccess("Sohan Chougule");  
        access.grantInternetAccess(); 
	}

}
