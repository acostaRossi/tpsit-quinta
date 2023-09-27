package itis.rossi.it.es1;

public class Es {
    public void start() {
        System.out.println("Es 1 start");

        Studente stud = new Studente("Alberto", "Costa");

        System.out.println(stud);
    }
    class Studente {
        private String nome;
        private String cognome;
        public Studente(String nome, String cognome) {
            this.nome = nome;
            this.cognome = cognome;
        }
        public String toString() {
            return "Studente: " + cognome + " " + nome;
        }
    }
}
