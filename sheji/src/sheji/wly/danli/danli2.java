package sheji.wly.danli;
//单例 饿汉模式
public class danli2 {
	private danli2(){}
	
	private static danli2 danli = new danli2();
	
	public static danli2 getDanli2(){
		return danli;
	}
}
