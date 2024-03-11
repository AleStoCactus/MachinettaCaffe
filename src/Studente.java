public class Studente {
    int eta;
    String materiaPreferita;
    String nome;
    String cognome;

    public Studente(int age, String name, String surname, String favoriteSubject) {
        this.eta = age;
        this.materiaPreferita = favoriteSubject;
        this.nome = name;
        this.cognome = surname;
    }

    public void StampaInfo() {
        System.out.printf("Lo studente ha " + this.eta + " anni, si chiama " + this.nome + ", di cognome fa " + this.cognome + " e la sua materia preferita è " + this.materiaPreferita);
    }

    public static void main(String[] args) {
        Studente studente1 = new Studente(17, "Mario", "Rossi", "Educazione Fisica");
        Studente studente2 = new Studente(18, "Rylee", "Calleri", "Qt");
//        studente1.eta = 17;
//        studente2.eta = 18;
//        studente1.nome = "Mario";
//        studente2.nome = "Rylee";
//        studente1.cognome = "Rossi";
//        studente2.cognome = "Calleri";
//        studente1.materiaPreferita = "Educazione Fisica";
//        studente2.materiaPreferita = "Qt";
        System.out.println("Dati Studente1");
        studente1.StampaInfo();
        System.out.println("Dati Studente2");
        studente2.StampaInfo();
    }
}