package sheji.wly.gongchangfangfa;

public class DianshijiFactory implements Factory{

	@Override
	public Chanpin createChanPin() {
		Chanpin cp = new Dianshiji();
		return cp;
	}

}
