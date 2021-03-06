
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.day++;
        if (this.day > 30) {
            this.day = 01;
            this.month++;
            if (this.month > 12) {
                this.month = 01;
                this.year++;
            }
        }
    }

    public void advance(int numOfDays) {
        while (numOfDays > 0) {
            this.advance();
            numOfDays--;
        }
    }

    public MyDate afterNumberOfDays(int days) {
        MyDate myNewDate = new MyDate(this.day, this.month, this.year);
        myNewDate.advance(days);   //respuesta propuesta: mi codigo usar el metodo advence(con parametro) en
                                    /* vez de usar un while. Muchisimo mejor el mio
                                   int counter = 0;
                                   while (counter < days) {
                                        date.advance();
                                        counter = counter + 1;
                                    }
 
                                    return date;
                                    */
        return myNewDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
