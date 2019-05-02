/**
 * *Erreur : impossible de trouver ou de charger la classe principale
 *  ExceptionTryCatchThrow.ExceptionTryCatchThrowKt
*Causé par : java.lang.ClassNotFoundException: 
*ExceptionTryCatchThrow.ExceptionTryCatchThrowKt

 *
 */
package ExceptionFd;

/**
 * @author franck Desmedt
 *
 */
public class InvalidExceptionFd extends ClassNotFoundException {

	/**
	 * 
	 */
	public InvalidExceptionFd() {
	}

	/**
	 * @param arg0
	 */
	public InvalidExceptionFd(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public InvalidExceptionFd(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}
