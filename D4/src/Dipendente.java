public abstract class Dipendente {
    private String matricola;
    private double stipendioBase;
    private Dipartimento dipartimento;

    public enum Dipartimento { PRODUZIONE, AMMINISTRAZIONE, VENDITE }

    public Dipendente(String matricola, double stipendioBase, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendioBase = stipendioBase;
        this.dipartimento = dipartimento;
    }

    // Metodo astratto: ogni sottoclasse DEVE implementarlo
    public abstract double calculateSalary();

    // Getter comuni
    public String getMatricola() { return matricola; }
    public double getStipendioBase() { return stipendioBase; }
}
