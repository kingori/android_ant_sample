package sample.android.ant;

public class ConfigDev implements Config {
	@Override
	public boolean isUseProxy() {
		return true;
	}

	@Override
	public String getMarketUrl() {
		return "market://blahblah";
	}

	@Override
	public TargetServer getServer() {
		return TargetServer.DEV;
	}
}
