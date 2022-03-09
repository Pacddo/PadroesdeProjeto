package Subsistema2;

public class Cepapi {
        private static Cepapi instacia = new Cepapi();
        private Cepapi() {
            super ();
        }
        public static Cepapi getInstacia(){
            return instacia;
        }
        public String recuperarCidade(String cep){
        return "São José";
        }
}
