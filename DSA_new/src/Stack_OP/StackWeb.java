package Stack_OP;

import java.util.Stack;

class webHistory{
	public String currentPage;
	private Stack<String> bws, fws;// bws for backward and fws for forward	
	
	public webHistory() {
		this.currentPage="Home page";   //here we are initializing the current page to home page
		bws=new Stack<String>(); 
		fws=new Stack<String>();//here we are initializing the backward stack	
	}
	public void visit(String page) {
		bws.push(currentPage);//
		currentPage=page;
		fws.clear();
	}
	public void previous() {
		if(!bws.isEmpty()) {
			fws.push(currentPage);
			currentPage=bws.pop();
		}
	}
}

public class StackWeb {

}
