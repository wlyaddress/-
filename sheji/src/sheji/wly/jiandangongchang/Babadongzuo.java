package sheji.wly.jiandangongchang;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Babadongzuo {
	// 动作方法
	static Baba baba = null;
	static String name = "";

	public Babadongzuo() {
		getName();
	}

	// 选择角色
	public static void getName() {
		
		try {
			do {
				System.out.println("-----------------");
				System.out.println("爸爸要找谁");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				name = br.readLine();
				if (name.equals("jiejie")) {
					baba = new Jiejie();
					baba.setName("姐姐");
				} else if (name.equals("gege")) {
					baba = new Gege();
					baba.setName("哥哥");
				} else {
					System.out.println("爸爸打我");
					baba.setName("我");
					break;
				}
				baba.动作();
				baba.检查作业();
				baba.打();
				baba.让孩子打酱油();
			} while (true);

		} catch (Exception e) {
			e.printStackTrace();
		}

	};
}
