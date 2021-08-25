
public class MenuOptions {

	private ActionListenerCommand clickOpen;
	private ActionListenerCommand clickSave;
	
	
	public MenuOptions(ActionListenerCommand clickOpen, ActionListenerCommand clickSave) {
		// TODO Auto-generated constructor stub
		this.clickOpen = clickOpen;
		this.clickSave = clickSave;
	}

	public void clickOpen() {
		// TODO Auto-generated method stub
		clickOpen.execute();
	}

	public void clickSave() {
		// TODO Auto-generated method stub
		clickSave.execute();
	}

}
