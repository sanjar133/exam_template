package question4;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogExam {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(question4.LogExam.class.getName());
        FileHandler fileHandler = new FileHandler("write: ");
        fileHandler.setLevel(Level.SEVERE);
        fileHandler.setFormatter(new MyCustomFormatter());
        logger.addHandler(fileHandler);

        try {
            throw new RemoteException();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "xatolik yuz berdi: ", e);
        }

    }

}
