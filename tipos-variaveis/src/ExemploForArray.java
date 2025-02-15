public class ExemploForArray {
    public static void main(String[] args){
        String alunos [] = {"Ana", "Maria", "José", "Pedro"};
        for (int x = 0 ; x<alunos.length; x++){
        System.out.println("o aluno no indice x="+x+" é " + alunos[x]);
        }
//exempo 2
        for(String aluno : alunos){
            System.out.println("Aluno: " + aluno);
        }
    }
}

