package sheji.wly.gongchangfangfa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {

	/* ** 工厂方法模式 **
	 * 工厂模式生产不同的产品（手机。电脑。电视机），根据出售渠道的不同，生产标准也不一样，在不同的工厂生产（合格率90%的工厂。合格率100%的工厂）
	 * 1.厂方法用来创建客户所需要的产品,同时还向客户隐藏了哪种具体产品类将被实例化这一细节,
	 * 用户只需要关心所需产品对应的工厂,无须关心创建细节，甚至无需知道具体产品类的类名。
	 * 
	 * 2.基于工厂角色和产品角色的多态性设计是工厂方法模式的关键。它能够让工厂自主确定创建何种产品对象,
	 * 而如何创建这个对象的细节完全封装在具体工厂内部。
	 * 工厂方法模式之所以又被称为多态工厂模式,正是因为所有的具体工厂类都具有同一抽象父类。
	 * System.out.println("出售什么产品");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String type = br.readLine();
			if (type.equals("dianshiji")) {
				factory = new DianshijiFactory();
			} else if (type.equals("shouji")){
				factory = new ShoujiFactory();
			} else if (type.equals("diannao")) {
				factory = new DiannaoFactory();
			}
			cp = factory.createChanPin();
			cp.产品();
	 * 3.系统中加入新产品时无须修改抽象工厂和抽象产品提供的接口,无须修改客户端,
	 * 也无须修改其他的具体工厂和具体产品,只需要添加一个具体工厂和具体产品即可,这样系统的可扩展性也就变得非常好,完全符合开闭原则。
	 */
	
	public static void main(String[] args) {
		new Chushou();
	}

}
