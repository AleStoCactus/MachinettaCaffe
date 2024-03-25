public class Studente {
    int eta;
    String materiaPreferita;
    String nome;
    String cognome;
    String profPreferito;
    float ultimoVoto;

    public Studente(int age, String name, String surname, String favoriteSubject, String favoriteProf) {
        this.eta = age;
        this.materiaPreferita = favoriteSubject;
        this.nome = name;
        this.cognome = surname;
        this.profPreferito = favoriteProf;
        this.ultimoVoto = EseguiVerifica(favoriteSubject,favoriteProf);
    }

    public float EseguiVerifica(String nomeMateria, String prof) {
        float voto = 0.0F;
        if (materiaPreferita == nomeMateria && profPreferito == prof) {
            voto = 10.0F;
        } else if (materiaPreferita != nomeMateria && profPreferito != prof) {
            voto = 4.0F;
        } else {
            voto = 8.0F;
        }
        return voto;
    }

    public void StampaInfo() {
        System.out.printf("Lo studente ha " + this.eta + " anni, si chiama " + this.nome + ", di cognome fa " + this.cognome + " e la sua materia preferita è " + this.materiaPreferita + " il voto dello studete è " + this.ultimoVoto + "\n");
    }

    public static void main(String[] args) {
        Studente studente1 = new Studente(17, "Mario", "Rossi", "Educazione Fisica", "Imbesi");
        Studente studente2 = new Studente(18, "Rylee", "Calleri", "Informatica", "Marino");
        studente1.ultimoVoto = studente1.EseguiVerifica("Informatica", "Marino");
        studente2.ultimoVoto = studente2.EseguiVerifica("Informatica", "Marino");

        System.out.println("\nDati Studente1");
        studente1.StampaInfo();
        System.out.println("\nDati Studente2");
        studente2.StampaInfo();
    }
}