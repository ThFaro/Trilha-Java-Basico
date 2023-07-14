public class ExemploForArray {
    public static void main(String[] args) throws Exception {

        // em arrays o indice inicia em ZERO
        String alunos[]={"Joao", "Felipe", "Jonas", "Julia", "Marcos"};

        for(int x=0;x<alunos.length;x++){
            System.out.println("O aluno no indice x="+x+" é "+alunos[x]);
        }
    }
}
