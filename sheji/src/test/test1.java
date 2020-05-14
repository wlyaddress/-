package test;

public class test1 {
	
	public static void main(String[] args) {
		//char数组，final类型,改变值的话会重新划分出一块空间
		String a = "1";
		
		//继承AbstractStringBuilder append方法有加锁 线程安全
		StringBuffer sb = new StringBuffer();
		sb.append("1");
		
		//继承AbstractStringBuilder append方法没加锁 线程不安全
		StringBuilder sbd = new StringBuilder();
		sbd.append("1");
	}
}
