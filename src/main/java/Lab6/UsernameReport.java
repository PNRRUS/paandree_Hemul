package Lab6;

public class UsernameReport extends Report {

    public UsernameReport(String x) {
        super(x);
    }

    public String getReport(String s) {
        reportNumber++;
        return reportNumber + ": " + System.getProperty("user.name") + " " + s;
    }
}
