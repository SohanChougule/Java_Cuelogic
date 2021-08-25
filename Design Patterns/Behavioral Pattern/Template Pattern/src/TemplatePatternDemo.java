
public class TemplatePatternDemo {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {  
        
          
        Game game=(Game) new Chess();
        game.play(); 
        
        System.out.println("======================");
        
        Game game1=(Game) new Soccer();
        game1.play(); 
        
        
        
      }  
}
