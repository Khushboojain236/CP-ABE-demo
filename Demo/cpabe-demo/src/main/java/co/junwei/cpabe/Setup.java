package co.junwei.cpabe;

public class Setup {
    static String dir = "demo/cpabe";

    static String pubfile = dir + "/pub_key";
	static String mskfile = dir + "/master_key";

public static void main(String[] args) throws Exception {
    Cpabe test = new Cpabe();
    
		System.out.println("//start to setup");
		test.setup(pubfile, mskfile);
		System.out.println("//end to setup");
}
}
