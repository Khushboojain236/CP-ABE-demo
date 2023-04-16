import cpabe.Cpabe;

public class DemoForCpabe {
	final static boolean DEBUG = true;

	
	static String[] attr = { "baf", "fim1", "foo" };
	static String[] another_attr = { "baf1", "fim1", "foo" };
	static String policy = "foo bar fim 2of3 baf 1of2";

	static String student_attr = "objectClass:inetOrgPerson "
		+ "objectClass:organizationalPerson sn:student3 cn:student2 "
		+ "uid:student2 userPassword:student2 ou:idp o:computer "
		+ "mail:student2@sdu.edu.cn title:student";

	static String student_attr1 = "objectClass:inetOrgPerson "
		+ "objectClass:organizationalPerson sn:student3 cn:student2 "
		+ "uid:student2 userPassword:student2 ou:idp o:computer "
		+ "mail:student2@sdu.edu.cn title:student";

	static String student_policy = "sn:student2 cn:student2 "
		+ "uid:student2 3of3";

	public static void main(String[] args) throws Exception {
		String attr_str;
		// policy = student_policy;
		// attr_str = array2Str(student_attr);

		attr_str = student_attr;
		policy = student_policy;


		BswabePub pub = new BswabePub();
		BswabeMsk msk = new BswabeMsk(); 

		//attr = attr_kevin;
		//attr = attr_sara;
		// policy = policy_kevin_or_sara;

		Bswabe.setup(pub, msk);
		
		prv = Bswabe.keygen(pub, msk, attr);
		
		for (int i=0;i<attr.length;i++)
		println("Attribute: "+attr[i]);
		
		println("Policy: "+policy);

		
		keyCph = Bswabe.enc(pub, policy);
		cph = keyCph.cph;
		m = keyCph.key;

		cphBuf = SerializeUtils.bswabeCphSerialize(cph);

		plt = message.getBytes();
		aesBuf = AESCoder.encrypt(m.toBytes(), plt);

		
		// Decrypt
		
		cph = SerializeUtils.bswabeCphUnserialize(pub, cphBuf);

		BswabeElementBoolean beb = Bswabe.dec(pub, prv, cph);
		System.err.println("e = " + beb.e.toString());
		if (beb.b) {
			plt = AESCoder.decrypt(beb.e.toBytes(), aesBuf);
			String s = new String(plt);
			println("Decrypt: "+s);
		} else {
			println("CANNOT DECRYPT!");
			System.exit(0);
		}
		

	}


	/* connect element of array with blank */
	public static String array2Str(String[] arr) {
		int len = arr.length;
		String str = arr[0];

		for (int i = 1; i < len; i++) {
			str += " ";
			str += arr[i];
		}

		return str;
	}

	private static void println(Object o) {
		if (DEBUG)
			System.out.println(o);
	}
}
