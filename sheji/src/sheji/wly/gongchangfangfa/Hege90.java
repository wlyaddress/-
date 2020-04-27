package sheji.wly.gongchangfangfa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hege90 implements Hege {
	public Hege90() {
		hege();
	}

	@Override
	public void hege() {
		System.out.println("合格率超过百分之90才能出售");
		hege90();
	}

	public void hege90() {
		chanpin cp = null;
		try {
			System.out.println("--------生产什么产品--------");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String type = br.readLine();
			if ("dianshiji".equals(type)) {
				cp = new Dianshiji();
			} else if ("shouji".equals(type)) {
				cp = new Shouji();
			} else if ("diannao".equals(type)) {
				cp = new Diannao();
			} else {
				System.out.println("该产品不存在");
			}
			cp.产品();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
