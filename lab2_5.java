import javax.swing.JOptionPane;

public class lab2_5 {
    public static void main(String[] args) {
        double totAbsent, totLate, gross, deduc, net, sss = 175.89, phil = 300;
        
        String rate = JOptionPane.showInputDialog(null, "Enter your rate per hour: ");
        String hour = JOptionPane.showInputDialog(null, "Enter hours worked: ");
        String absence = JOptionPane.showInputDialog(null, "Enter days absent: ");
        String late = JOptionPane.showInputDialog(null, "Enter hours late: ");

        double r = Double.parseDouble(rate);
        double h = Double.parseDouble(hour);
        double a = Double.parseDouble(absence);
        double l = Double.parseDouble(late);

        totAbsent = a * 5.75;
        totLate = l * 3.25;
        gross = r * h;
        deduc = totAbsent + totLate + sss + phil;
        net = gross - deduc;


        JOptionPane.showMessageDialog(null, 
        "Rate per hour: " +r+
        "\nHours worked: " +h+ 
        "\nTotal absences: " +totAbsent+
        "\nTotal lateness: " +totLate+
        "\nGross: " +gross+
        "\nTotal Deduction: " +deduc+
        "\nNet: " +net);

    }
}
