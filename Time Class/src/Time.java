public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int h, int m, int s){
        hour = ((h>=0 && h < 24) ? h : 0);
        minute =((m>=0 && m < 60) ? m : 0);
        second = ((s>=0 && s < 60) ? s : 0);
    }

    @Override
    public String toString() {
        String hh = this.hour < 10 ? "0" + this.hour : this.hour+"";
        String mm = this.minute < 10 ? "0" + this.minute : this.minute+"";
        String ss = this.second < 10 ? "0" + this.second : this.second+"";
        return hh + ":" + mm + ":" + ss;
    }
    public Time nextSecond(){


        if(this.second < 59){
            this.second = this.second + 1;
            return this;
        }

        this.second = 0;
        this.minute++;

        if(this.minute < 59) {
            return this;
        }

        this.minute = 0;
        this.hour++;

        if(this.hour < 23){
            return this;
        }

        this.hour = 0;

        return this;
    }

    public Time previousSecond(){

        if(this.second > 0){
            this.second = this.second - 1;
            return this;
        }

        this.second = 59;
        this.minute--;

        if(this.minute > 0){
            return this;
        }

        this.minute = 59;
        this.hour--;

        if(this.hour > 0) {
            return this;
        }

        this.hour = 23;

        return this;

    }
}
