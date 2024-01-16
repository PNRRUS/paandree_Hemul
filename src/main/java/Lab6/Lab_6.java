package Lab6;

/*
Создать иерархию классов Report. При конструировании принимает на вход некую Строку. Этот
класс имеет метод getReport(), который возвращает эту строку, предваряя порядковым номером отчета.
Количество отчетов он хранит.
Создать дочерний класс TimestampedReport, который переопределяет метод getReport() таким образом,
что возвращается строка, содержащая порядковый номер, а затем текущую дату
(получает ее с помощью new Date(System.currentTimeMillis()).
Потом этот объект можно выводить на консоль)
Создать дочерний класс UsernameReport, который переопределяет метод getReport() таким образом, что возвращается строка,
содержащая порядковый номер, а затем имя пользователя (получает его  с помощью System.getProperty("user.name")
Создать класс Reporter, который содержит метод report(), принимающий на вход объект типа Report,
вызывающий его метод getReport() и выводящий строки вида “My current report: ” + report.getReport()

Пример:
Report report1 = new Report(“Cool stuff”);
Report report2 = new TimestampedReport(“Cool stuff2”);
Report report3 = new UsernameReport(“Cool stuff3”);

Reporter reporter = new Reporter();

reporter.report(report1);
My current report: 1: Cool stuff
reporter.report(report2);
My current report: 2: Thu Nov 28 18:41:22 MSK 2019: Cool stuff2
reporter.report(report3);
My current report: 3: nipetrov: Cool stuff3

 */
public class Lab_6 {

    public static void main(String[] args) {
        Report report1 = new Report("Cool stuff");
        Report report2 = new TimestampedReport("Cool stuff2");
        Report report3 = new UsernameReport("Cool stuff3");

        Reporter reporter = new Reporter();
        reporter.report(report1);
        reporter.report(report2);
        reporter.report(report3);


    }
}
