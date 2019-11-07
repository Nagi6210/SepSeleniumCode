package Constructors;


import java.util.ArrayList;

public class Browsers {
	
	String browserName;
	String vendorName;
	String currentVersion;
	ArrayList<String> plugins = new ArrayList<String>();
	
	public Browsers(String browserName) {
		this.browserName = browserName;
	}


	public Browsers(String browserName, String vendorName) {
		this.browserName = browserName;
		this.vendorName = vendorName;
	}

	

	public Browsers(String browserName, String vendorName, String currentVersion, ArrayList<String> plugins) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.plugins = plugins;
	}


	public static void main(String[] args) {
		Browsers FF1=new Browsers("Firefox");
		Browsers FF2=new Browsers("Firefox", "Mozilla");
		ArrayList<String> plugins=new ArrayList<String>();
		plugins.add("chromecast");
		plugins.add("firefox");
		Browsers FF3=new Browsers("Firefox", "Mozilla", "56.1.1", plugins);

	}

}
