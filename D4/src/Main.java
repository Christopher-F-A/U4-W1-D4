public class Main {
    public static void main(String[] args) {
        // Creazione istanze
        Dipendente ft = new DipendenteFullTime("FT01", 1800, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente pt = new DipendentePartTime("PT01", Dipendente.Dipartimento.VENDITE, 80, 15.5);
        Dipendente dir = new Dirigente("DIR01", 2500, Dipendente.Dipartimento.AMMINISTRAZIONE, 1000);

        // Array polimorfico
        Dipendente[] dipendenti = { ft, pt, dir };

        double totaleStipendi = 0;

        System.out.println("--- Dettaglio Pagamenti ---");
        for (Dipendente d : dipendenti) {
            double salario = d.calculateSalary();
            totaleStipendi += salario;

            System.out.println("Matricola: " + d.getMatricola() +
                    " | Tipo: " + d.getClass().getSimpleName() +
                    " | Salario: €" + salario);
        }

        System.out.println("---------------------------");
        System.out.println("Totale complessivo da pagare: €" + totaleStipendi);
    }
}
