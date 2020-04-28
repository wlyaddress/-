package sheji.wly.gongchangfangfa;

public class ShoujiFactory implements Factory{

	@Override
	public Chanpin createChanPin() {
		Chanpin cp = new Shouji();
		return cp;
	}

}
