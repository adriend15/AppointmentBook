public class AppointmentBook {

    private boolean[][] schedule;

    public AppointmentBook(boolean[][] schedule) {
        this.schedule = schedule;
        }

    private boolean isMinuteFree(int period, int minute) {
        return schedule[period-1][minute];
    }


    private void reserveBlock(int period, int startMinute, int duration) {
        for (int i = startMinute; i < startMinute + duration; i++) {
            schedule[period-1][i] = false;
        }
    }

    public int findFreeBlock(int period, int duration)
    {
        int freeInARow = 0;

        for(int minute = 0; minute <= 59; minute++)
        {
            if(isMinuteFree(period, minute))
                freeInARow++;
            else
                freeInARow = 0;

            if(freeInARow == duration)
                return minute - freeInARow + 1;
        }

        return -1;
    }


    public boolean makeAppointment(int startPeriod, int endPeriod,
                                   int duration)
    {
        for(int period = startPeriod; period <= endPeriod; period++)
        {
            int startMinute = findFreeBlock(period, duration);

            if(startMinute != -1)
            {
                reserveBlock(period, startMinute, duration);
                return true;
            }
        }

        return false;
    }

    public void printPeriod(int period) {
        for(int i = 0; i < schedule[period-1].length; i++) {
            System.out.println(i + " " + schedule[period-1][i]);
        }
    }
}


// There may be instance variables, constructors, and methods that are not shown.
