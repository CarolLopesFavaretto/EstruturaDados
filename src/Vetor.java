public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0; // inicializando o tamanho, estabelecendo o valor 0;
    }

    //Adicionando elementos no vetor

//        public void addVetor(String elementos){
//
//            for(int i=0; i<elementos.length(); i++){
//               if(this.elementos[i] == null){
//                   this.elementos[i] = elementos;
//                   break;
//               }
//            }
//
//        }

    // adicionando elementos de acordo com o tamanho do array e tratativa
    public void addVetor(String elementos) throws Exception {
      if(this.tamanho < this.elementos.length){
          this.elementos[this.tamanho] = elementos;
          tamanho++;
      }else {
          throw new Exception("Tamanho de array já não comporta mais elementos.");
      }
    }
}
