public class calentador{
    public int temperatura;
    public int incremento;
        public void estandar(){
            temperatura=15;
            incremento=3;
        }
        
        public int sube(){
            if(temperatura < 30){
            temperatura = temperatura + incremento;
        }
            return temperatura;
        } 
        
        public int baja(){
            if (temperatura > -10){
            temperatura = temperatura - incremento;
            }return temperatura;
        }
        
        public int muestra(){
            return temperatura;
        }
    }