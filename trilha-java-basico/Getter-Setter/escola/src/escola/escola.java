package escola;

public class escola{

public static void main(String[] args) {
      Aluno felipe = new Aluno();
      felipe.setIdade(13);
      felipe.setNome("Felipe");  
      felipe.setSexo("masculino");

    System.out.println("O aluno "+felipe.getNome()+" tem "+ felipe.getIdade()+" anos, e é do sexo "+felipe.getSexo()+".");

    }
    
}