package com.skillstorm;

public class TestCustomExceptions {

	public static void main(String[] args) throws Exception {
		// TODO Add your code without overwriting anyone else's
		// submit the .java file at the time you merged
		// Step 1: Create a custom exception (inherit from whatever you want)
		// Step 2: Add a catch clause (and any other code your need)

		// TODO Add your code without overwriting anyone else's
		// submit the .java file at the time you merged
		// Step 1: Create a custom exception (inherit from whatever you want)
		// Step 2: Add a catch clause (and any other code your need)
		try {
			doStuff();
		} catch (KsenasCustomException e) {
			System.out.println(e)
		} catch (BlakesException2 e) {
			System.out.println(e);
		} catch (BlakesException3 e) {
			System.out.println(e);
		} catch (EricasException2 e) {
			System.out.println(e);
		} catch (EricasException3 e) {
			System.out.println(e);
		} catch (BlakesException e) {
			System.out.println(e);
		} catch (EricasException e) {
			System.out.println(e);
		} catch (DaunsException2 e) {
			System.out.println(e);
		} catch (DaunsException3 e) {
			System.out.println(e);
		} catch (DaunsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

	}


		try {
			doStuff();
		} catch (TonysException e) {
			System.out.println(e);
		}
		

	}
	

	public static void doStuff() throws EricasException, DaunsException,TonysException, KsenasCustomException {

	}
	

	// Erica's code
	class EricasException extends Exception {
	}
	


	class EricasException2 extends EricasException {
	}

	class EricasException3 extends EricasException {
	}

	// Daun's code
	class DaunsException extends Exception {
	}

	class DaunsException2 extends DaunsException {
	}

	class DaunsException3 extends DaunsException {
	}

// Blake's code


// Ksena's code
class KsenasCustomException extends EricasException2 {}


	class BlakesException extends EricasException {
	}

	class BlakesException2 extends BlakesException {
	}

class BlakesException3 extends BlakesException{}


	class TonysException extends Exception {}
}

