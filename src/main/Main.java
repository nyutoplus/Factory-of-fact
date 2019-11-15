package main;

import assets.util.Config;
import assets.util.Logger;
import assets.util.Register;

public class Main {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	public static Logger logger;

	public static Register register;

	public static void main(String[] args) {
		logger = new Logger(System.out);
		System.setOut(logger);
		register = new Register();
//		System.out.println(System.);
		Config config = new Config();
		config.readConfig("/defaultconfig.conf");
//		config.con("/defaultconfig.conf");
		register.register("test","test");
		//下のコメントアウトした部分を有効にするとキーが重複しているので例外が発生します
		//register.register("test","test2");
		register.register("try","test3");

		System.out.println(register.getString("test"));
		//下のコメントアウトした部分を有効にすると指定したキーが発見できないので例外が発生します
		//System.out.println(register.getString("tyy"));
		System.out.println(register.getString("try"));
	}

}