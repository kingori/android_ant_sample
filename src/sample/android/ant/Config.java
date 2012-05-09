package sample.android.ant;

public interface Config {
	enum TargetServer {
		DEV, REAL
	}

	TargetServer getServer();

	boolean isUseProxy();

	String getMarketUrl();
}
