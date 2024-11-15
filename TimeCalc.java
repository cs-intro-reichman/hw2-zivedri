public class TimeCalc {
    public static void main(String[] args) {
        String s;
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        /*System.out.println(hours);
        System.out.println(minutes);
        System.out.println(minutesToAdd);*/
        minutes = minutesToAdd + minutes + (hours * 60);
        int newHours = minutes/60;
        int newMinutes = minutes - (newHours*60);
        newHours = newHours%24;
        if (newHours >= 10) {
            s = "" + newHours;
        }
        else {
            s ="0"+newHours;
        }
        if (newMinutes >= 10) {
            s = s + ":" + newMinutes;
        }
        else {
            s = s + ":0" + newMinutes;
        }
        System.out.println(s);
    }
}
