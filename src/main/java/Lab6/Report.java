package Lab6;

public class Report {
     String x;
     static int reportNumber = 0;

    public Report(String x) {
        this.x = x;

    }

    public String getReport(String x) {

        reportNumber++;
        return reportNumber + ": " + x;
    }

    }
