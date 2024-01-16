package Lab6;

import java.util.Date;

public class TimestampedReport extends Report {

    public TimestampedReport(String x) {
        super(x);
    }

    public String getReport(String s) {

        Date date = new Date(System.currentTimeMillis());
        reportNumber++;
        return reportNumber + ": " + date + " " + s;
    }

}
