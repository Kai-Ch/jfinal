package demo;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class HelloController extends Controller {
    @ActionKey("/login")
	public void index() {
       renderText("Hello JFinal World.");
    }
    
    /**
     * 重定向
     */
    public void toBaidu(){
    	redirect("http://www.baidu.com");
    }
    
//    public void getImage(){
//    	renderFile("1.jpg");
//    }
}
