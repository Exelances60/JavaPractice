public class Main {
    public static void main(String[] args) {
   /* BaseLogger[] loggers = new BaseLogger[]{new EmailLogger(), new FileLogger(), new DatabaseLogger()};
        for (BaseLogger logger : loggers) {
            logger.log("Log message");
        }*/
        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.add();

    }
}