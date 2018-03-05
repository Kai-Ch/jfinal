package config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PropKit;

import demo.HelloController;
import demo.IndexController;

public class DemoConfig extends JFinalConfig{

	/**
	 * 配置常量
	 * @param me
	 */
	@Override
	public void configConstant(Constants me) {
		me.setEncoding("UTF-8");
		//设置视图为jsp
//		me.setViewType(ViewType.JSP);
		
		// 加载少量配置文件，随后可用PropKit.get(...)获取值
		PropKit.use("a_little_config.txt");
		PropKit.use("config.properties");
		
		//设置当前是否为开发者模式
		me.setDevMode(PropKit.getBoolean("devMode", false));
		
		//设置文件上传路径
		String fileUploadPath = "upload/image";
		me.setBaseUploadPath(fileUploadPath);
		
		//JspRender对HttpServletRequest对象中的数据进行了处理，数据全部放入了Map之中，设置数据不处理
		//JspRender.setSupportActiveRecord(true);
	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configPlugin(Plugins me) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 配置路由
	 */
	@Override
	public void configRoute(Routes me) {
		// 第三个参数省略时默认与第一个参数值相同
		me.add("/hello", HelloController.class);
		// 第三个参数为该Controller的视图存放路径
		me.add("/", IndexController.class, "/static/index");
		
	}

}
