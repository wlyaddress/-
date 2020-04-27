package sheji.wly.jiandangongchang;
//简单工厂模式实例
//爸爸类
public abstract class Baba {
	
	protected String name;
	
	public abstract void 动作();
	
	//爸爸打孩子
	public void 打(){
		System.out.println("爸爸打"+name);
	};
	//爸爸让孩子打酱油
	public void 让孩子打酱油(){
		System.out.println("爸爸让"+name+"打酱油");
	};
	//爸爸检查作业
	public void 检查作业(){
		System.out.println("爸爸检查"+name+"作业");
	};
	
	public void setName(String name){
		this.name = name;
	}
}
