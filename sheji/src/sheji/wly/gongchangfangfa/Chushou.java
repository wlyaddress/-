package sheji.wly.gongchangfangfa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//出售产品
public class Chushou {
	public Chushou(){
		Hege hg = null;
		chanpin cp = null;
		try {
			System.out.println("---------请输入出售类型----------");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String csType = br.readLine();
			if (csType.equals("出售")) {
				hg = new Hege90(); 
			}else if(csType.equals("出口")) {
				hg = new Hege100();
			}else {
				System.out.println("类型错误");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
