public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String matricola, double stipendioBase, Dipartimento dipartimento) {
        super(matricola, stipendioBase, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendioBase(); // Stipendio fisso
    }
}
