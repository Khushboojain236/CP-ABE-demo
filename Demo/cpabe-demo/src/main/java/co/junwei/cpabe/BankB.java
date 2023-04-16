package co.junwei.cpabe;


public class BankB {
    static String dir = "demo/cpabe";

    static String pubfile = dir + "/pub_key";
	static String prvfile = dir + "/prv_key_2";

	static String encfile = dir + "/abc.txt.cpabe";
	static String decfile = dir + "/abc.txt.new";

    public static void main(String[] args) throws Exception {
       
        Cpabe test = new Cpabe();
        System.out.println("//start to dec");
		test.dec(pubfile, prvfile, encfile, decfile);
		System.out.println("//end to dec");

    }


}
