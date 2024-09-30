package question4;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyCustomFormatter extends Formatter {

    public String format(LogRecord record) {
        Throwable thrown = record.getThrown();
        if (thrown != null) {

            StringWriter stringWriter = new StringWriter();
            thrown.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            return string + "yyyy.MM.dd";
        }
        return "not exception";
    }

}
