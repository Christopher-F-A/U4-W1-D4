public class Dirigente extends Dipendente {
    private double bonus;

    public Dirigente(String matricola, double stipendioBase, Dipartimento dipartimento, double bonus) {
        super(matricola, stipendioBase, dipartimento);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getStipendioBase() + bonus;
    }
}