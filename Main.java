public class Main {
    public static void main(String[] args) {
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        for(int i = 10; i < 15; i++) {
            schedule[1][i] = true;
        }



        schedule = new boolean[8][60];
        for(int i = 25; i < 30; i++) schedule[1][i] = true;
        for(int i = 0; i < 15; i++) schedule[1][i] = true;
        for(int i = 41; i < 60; i++) schedule[1][i] = true;
        for(int i = 5; i < 30; i++) schedule[1][i] = true;
        for(int i = 44; i < 60; i++) schedule[1][i] = true;
        AppointmentBook b = new AppointmentBook(schedule);


        System.out.println(b.makeAppointment(2,4,22));
        b.printPeriod(4);
    }
}
