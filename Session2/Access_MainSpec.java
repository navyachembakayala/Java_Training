package Package1;

import Oops_Concept.Access_Specifier;

public class Access_MainSpec {

	public static void main(String[] args) {

		Access_Specifier ac2 = new Access_Specifier();
      //ac2.default_access(); not allowed in different package
        ac2.public_access();

	}

}
