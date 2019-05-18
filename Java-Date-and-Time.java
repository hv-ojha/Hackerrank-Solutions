

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar c=Calendar.getInstance();
        c.set(year,month-1,day);
        int v=c.get(Calendar.DAY_OF_WEEK);
        String week[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        System.out.println(week[v - 1]);
        return week[v-1];
    }

}

