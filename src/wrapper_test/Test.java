package wrapper_test;

import org.apache.log4j.xml.DOMConfigurator;

public class Test {
	
	public static void main(String[] args) {
		DOMConfigurator.configure(System.getProperty("user.dir") + "/conf/log4j.xml");
		while(true){
			
		}
	}
	
	public void start(){
		System.out.println("start");
		while(true){
			
		}
		
	}
	
	public void destroy(){
		System.out.println("destroy");
	}
	
	public void stop(){
		System.out.println("stop");
	}
}
