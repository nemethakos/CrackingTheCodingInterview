package Chapter_13_Java;

public class ReturnFromFinally {

	public static void usualMethod() {
		try {
			// return from try..catch block, does the finally block executed?
			return;
		} catch (Exception e) {
			// there is nothing here...
		} finally {
			/**
			 * Executed always, except:
			 * <ul>
			 * <li>If the virtual machine exits during try/catch block execution. ( System.exit() )
			 * <li>If the thread which is executing during the try/ catch block gets killed.
			 * </ul>
			 */

			System.out.println("'Hello World!' from the finally block!");
		}
	}

}
