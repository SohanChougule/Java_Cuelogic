
public class CommandPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc = new Document();  
        
        ActionListenerCommand clickOpen = new ActionOpen(doc);  
        ActionListenerCommand clickSave = new ActionSave(doc);  
          
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);  
          
        menu.clickOpen();  
        menu.clickSave();
	}

}
