package sheji.wly.danli;
//单例 静态内部类
public class danli4 {
	private danli4(){}
	
	private static class getDanli{
		private static danli4 danli = new danli4();
	}
	
	public static danli4 getDanli4(){
		return getDanli.danli;
	}

}
 