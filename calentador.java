public class calentador{
    private int temperatura;
    private int incremento;
    private int min;
    private int max;
        public void estandar(){
            temperatura=15;
            incremento=3;
            min=0;
            max=40;
        }
        
        public int sube(){
            if(temperatura<max){             
                    temperatura = temperatura + incremento;
            }
            return temperatura;
        } 
        
        public int baja(){
            if (temperatura < min){
            temperatura = temperatura - incremento;
            }return temperatura;
        }
        
        public int muestra(){
            return temperatura;
        }
    }