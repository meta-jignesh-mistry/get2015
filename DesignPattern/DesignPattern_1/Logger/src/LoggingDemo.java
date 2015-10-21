import java.nio.file.ReadOnlyFileSystemException;
import java.util.logging.Level;

public class LoggingDemo {
	public static void main(String args[]) {
		LoggerWrapper.getInstance();
		// generating the Arithmetic Exception manually
		try {
			int c = 5 / 0;
		} catch (Exception e) {
			// logging the Exception in log file
			LoggerWrapper.myLogger.log(Level.SEVERE, "" + e.fillInStackTrace());
		}
		try {
			// throwing the ReadOnlyFileSystemException manually
			throw new ReadOnlyFileSystemException();
		} catch (Exception e) {
			// logging the Exception in log file
			LoggerWrapper.myLogger.log(Level.SEVERE, "" + e.fillInStackTrace());

		}
	}
}
