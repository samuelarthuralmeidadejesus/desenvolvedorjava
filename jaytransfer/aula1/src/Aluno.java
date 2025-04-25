/*encapsulamento */
// public
// private
// protected
// package
public class Aluno { //classe

   //variáveis = atributos
   //características
   private String nome; //atributo do tipo texto
   private int idade; //atributo do tipo número
   private boolean temFaculdade; //atributo do tipo booleano (0 e 1)

   public Aluno(){

   }
   public Aluno(String nome,int idade, boolean temFaculdade){
       this.nome = nome;
       this.idade = idade;
       this.temFaculdade = temFaculdade;
   }
   public String getnome(){ //método para pegar nome
     return nome;
   }
   public int getIdade(){ //método para pegar idade
    return idade;
   }
   public boolean gettemFaculdade(){ //método para pegar temFaculdade
    return temFaculdade;
   }
   //classes Wrappers
   /* 
   *Considerando a explicação do professor
   *tipo primitivo x classes wrappers
   *
   * Você tem que descobrir quantos alunos
   * tem faculdade (sim ou não)
   * temFaculdade
   * sim/não - 0 ou 1
   * Como declarar um atributo booleano?
   * 2 minutos  
    */

}
