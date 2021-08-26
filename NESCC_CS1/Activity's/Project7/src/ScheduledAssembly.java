

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class ScheduledAssembly {

    private int quantity = 0;
    private Assembly assembly;
    private Date dueDate;

    public ScheduledAssembly(int quantity, Assembly assembly, Date dueDate) {
        this.quantity = quantity;
        this.assembly = assembly;
        this.dueDate = dueDate;
    }

    public ScheduledAssembly() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Assembly getAssembly() {
        return assembly;
    }

    public void setAssembly(Assembly assembly) {
        this.assembly = assembly;
    }

    public String getStringDate(){
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(dueDate);
        return date;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "ScheduledAssembly{" + "quantity=" + quantity + ", assembly=" + assembly + ", dueDate=" + dueDate + '}';

    }

}

class SortByDate implements Comparator<ScheduledAssembly>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(ScheduledAssembly a, ScheduledAssembly b)
    {
        return a.getDueDate().compareTo(b.getDueDate());
    }
}
