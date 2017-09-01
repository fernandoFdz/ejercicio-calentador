/*
 * clase de tipo calentador
 */
public class calentador{
    /*
     * variables de instancia 
     */
    private int temperatura;
    private int incremento;
    private int min;
    private int max;
    
        /*
         * constructor: inicializa las variables a utilizar
         */
        
        public calentador(){
            temperatura=10;
            incremento=3;
            min=0;
            max=40;
        }
        
        /*
         * metodo que aumenta la temperatura
         */
            public int sube(){
                if(temperatura<max){             
                    temperatura = temperatura + incremento;
            }
            return temperatura;
        } 
        
        /*
         *  metodo que dismiye la temperatura
         */
        public int baja(){
            if (temperatura < min){
            temperatura = temperatura - incremento;
            }return temperatura;
        }
        
        /*
         * metodo que retorna la variable
         */
        public int muestra(){ 
            return temperatura;
        }
        
        
        /* 
         * aqui se aplica la encapsulacion ya que solo manda a llamar ciertos metodos
         */
        public void modificarIncremento(){
            
            if(incremento <0){
            incremento=incremento*(-1);
            }
            incremento = 2;
        }
    }