package co.junwei.cpabe;

public class Regulator {
    static String dir = "demo/cpabe";

    static String pubfile = dir + "/pub_key";
	static String mskfile = dir + "/master_key";

    static String prvfile1 = dir + "/prv_key_1";
    static String prvfile2 = dir + "/prv_key_2";
    
    static String bank_attr_1 = "bankId:banka";
    
    static String bank_attr_2 = "bankId:bankb";

    public static void main(String[] args) throws Exception {

       // String attr_str;
       //attr_str = bank_attr_1;

       // String attr_str2;
        //attr_str2 =bank_attr_2;

        Cpabe test = new Cpabe();

        System.out.println("//start to keygen for Bank A");
		test.keygen(pubfile, prvfile1, mskfile, bank_attr_1);
	    System.out.println("//end to keygen");

        System.out.println("//start to keygen for Bank B");
		test.keygen(pubfile, prvfile2, mskfile, bank_attr_2);
	    System.out.println("//end to keygen");
    }

    
}
