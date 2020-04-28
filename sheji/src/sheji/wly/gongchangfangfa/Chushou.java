package sheji.wly.gongchangfangfa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//出售类
public class Chushou {
	public Chushou(){
		Chanpin cp = null;
		Factory factory = null;
		try {
			do {
				System.out.println("出售什么产品");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String type = br.readLine();
				if (type.equals("dianshiji")) {
					factory = new DianshijiFactory();
				} else if (type.equals("shouji")){
					factory = new ShoujiFactory();
				} else if (type.equals("diannao")) {
					factory = new DiannaoFactory();
				} else {
					System.out.println("有内鬼，终止交易");
					break;
				}
				cp = factory.createChanPin();
				cp.产品();
			} while (true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
