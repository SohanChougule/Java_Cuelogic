package StreamsDemo;

import java.util.*;
import java.util.stream.*;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class NewStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",32000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        List<Float> productPriceList2 =productsList.stream()  
	                                     .filter(p -> p.price > 30000)// filtering data  
	                                     .map(p->p.price)        // fetching price  
	                                     .collect(Collectors.toList()); // collecting as list  
	        System.out.println(productPriceList2);  
		
	        
	        
	        System.out.println("\n==========================================");
	        Stream.iterate(10, element->element+1)  
	        .filter(element->element%5==0)  
	        .limit(5)  
	        .forEach(System.out::println);  
	        
	        System.out.println("\n==========================================");
	        
	        Float totalPrice = productsList.stream()  
                    .map(product->product.price)  
                    .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
	        
	        System.out.println(totalPrice);  
	        
	        
	        // More precise code   
	        float totalPrice2 = productsList.stream()  
	                .map(product->product.price)  
	                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
	        
	        System.out.println(totalPrice2); 
	}

}
