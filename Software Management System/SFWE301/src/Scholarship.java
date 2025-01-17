import java.util.Date;

public class Scholarship {
    String Name;
    int Monetary_Amount;
    int No_of_Recipient;
    String Preferred_Major;
    double Minimum_GPA;
    Date Application_due_date;
    String Require_Essay;

    public Scholarship(String name, int monetary_Amount, int no_of_Recipient, String preferred_Major, double minimum_GPA, Date application_due_date, String require_Essay) {
        Name = name;
        Monetary_Amount = monetary_Amount;
        No_of_Recipient = no_of_Recipient;
        Preferred_Major = preferred_Major;
        Minimum_GPA = minimum_GPA;
        Application_due_date = application_due_date;
        Require_Essay = require_Essay;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMonetary_Amount() {
        return Monetary_Amount;
    }

    public void setMonetary_Amount(int monetary_Amount) {
        Monetary_Amount = monetary_Amount;
    }

    public int getNo_of_Recipient() {
        return No_of_Recipient;
    }

    public void setNo_of_Recipient(int no_of_Recipient) {
        No_of_Recipient = no_of_Recipient;
    }

    public String getPreferred_Major() {
        return Preferred_Major;
    }

    public void setPreferred_Major(String preferred_Major) {
        Preferred_Major = preferred_Major;
    }

    public double getMinimum_GPA() {
        return Minimum_GPA;
    }

    public void setMinimum_GPA(double minimum_GPA) {
        Minimum_GPA = minimum_GPA;
    }

    public Date getApplication_due_date() {
        return Application_due_date;
    }

    public void setApplication_due_date(Date application_due_date) {
        Application_due_date = application_due_date;
    }

    public String getRequire_Essay() {
        return Require_Essay;
    }

    public void setRequire_Essay(String require_Essay) {
        Require_Essay = require_Essay;
    }
}
