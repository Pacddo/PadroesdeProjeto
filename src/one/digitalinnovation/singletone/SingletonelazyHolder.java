package one.digitalinnovation.singletone;

public class SingletonelazyHolder {


        private static class Holder {
            public static SingletonelazyHolder instancia = new SingletonelazyHolder();
        }

        private SingletonelazyHolder() {
        }

        public static SingletonelazyHolder getInstacia(){

            return Holder.instancia;

        }

    }


