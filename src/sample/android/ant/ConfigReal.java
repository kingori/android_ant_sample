package sample.android.ant;

public class ConfigReal implements Config{

	@Override
	public TargetServer getServer() {
		return TargetServer.REAL;
	}

	@Override
	public boolean isUseProxy() {
		return false;
	}

	@Override
	public String getMarketUrl() {
		return "market://blahblah";
	}
}
