import java.util.Date;

public class Quarter {

    int month;

    public Quarter(int month) {
        this.month = month;
    }

    int getQuarter () {
        int quarter;

        if (this.month == 1 ||  this.month == 2 || this.month == 3) {
            return quarter = 1;
        } else if (this.month == 4 ||  this.month == 5 || this.month == 6) {
            return quarter = 2;
        } else if (this.month == 7 ||  this.month == 8 || this.month == 9) {
            return quarter = 3;
        } else return quarter = 4;
    }
}
