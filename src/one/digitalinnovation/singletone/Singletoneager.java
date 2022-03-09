package one.digitalinnovation.singletone;


    public class Singletoneager {
        private static Singletoneager instacia = new Singletoneager();

        private Singletoneager() {
            super ();
        }

        public static Singletoneager getInstacia(){
            return instacia;
        }

    }


