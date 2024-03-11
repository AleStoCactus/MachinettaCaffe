public class Studente {
    int eta;
    String materiaPreferita;
    String nome;
    String cognome;

    public static void main(String[] args) {
        Studente studente1 = new Studente();
        studente1.eta = 17;
        studente1.nome = "Mario";
        studente1.cognome = "Rossi";
        studente1.materiaPreferita = "Educazione Fisica";

        System.out.printf("Lo studente ha " + studente1.eta + " anni, si chiama " + studente1.nome + ", di cognome fa " + studente1.cognome + " e la sua materia preferita è " + studente1.materiaPreferita);
    }
}