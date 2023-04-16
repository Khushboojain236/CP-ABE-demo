package co.junwei.cpabe;

public class Client {
    static String dir = "demo/cpabe";

    static String pubfile = dir + "/pub_key";
	static String prvfile = dir + "/prv_key";

	static String inputfile = dir + "/abc.txt";
	static String encfile = dir + "/abc.txt.cpabe";
	static String decfile = dir + "/abc.txt.new";

    static String policy = "bankId:banka bankId:bankb 1of2";
   

    public static void main(String[] args) throws Exception {
		

		System.out.println(policy); 
		

		Cpabe test = new Cpabe();


		System.out.println("//start to enc");
		test.enc(pubfile, policy, inputfile, encfile);
		System.out.println("//end to enc");

	}

}