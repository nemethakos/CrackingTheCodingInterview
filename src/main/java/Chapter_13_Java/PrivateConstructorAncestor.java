package Chapter_13_Java;

class ExternalClass {
	
	// "external classes" can also access the private constructor
	PrivateConstructorClass privateConstructorClass = new PrivateConstructorClass();

	class PrivateConstructorClass {

		private PrivateConstructorClass() {
		}

		// only the inner class can be a subclass of a class with private constructor
		class InnerClass extends PrivateConstructorClass {

		}

	}
}

/*
 * Non inner class subclass of a class with the private constructor does not compile, since the
 * super constructor cannot be invoked!
 * 
 * class SubClass extends PrivateConstructorAncestor {
 * 
 * public SubClass() {} }
 */