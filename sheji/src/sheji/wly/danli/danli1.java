package sheji.wly.danli;
//懒汉模式  双重判断
public class danli1 {
	private danli1(){}
	private static volatile danli1 danli =null;
	public static danli1 getDanli1(){
		if (danli==null) {
			synchronized (danli1.class) {
				if (danli==null) {
					danli = new danli1();
				}
			}
		}
		return danli;
	}
}
