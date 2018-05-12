package object.sort;

import java.util.Arrays;

import object.Employer;

public class Main {

	public static void main(String[] args) {

		Employer[] employers = new Employer[5];

		employers[0] = new Employer(1000);
		employers[1] = new Employer(2000);
		employers[2] = new Employer(7000);
		employers[3] = new Employer(321.5);
		employers[4] = new Employer(5921.5);

		Arrays.sort(employers);
		
		for(Employer e : employers) {
			System.out.println(e.getSalary());
		}
		
	}

}
