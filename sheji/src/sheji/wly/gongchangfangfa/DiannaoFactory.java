package sheji.wly.gongchangfangfa;

public class DiannaoFactory implements Factory{

	@Override
	public Chanpin createChanPin() {
		Chanpin cp = new Diannao();
		return cp;
	}

}
