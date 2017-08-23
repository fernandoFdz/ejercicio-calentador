public class calentador{
    public int temperatura;
    public int incremento;
        public void estandar(){
            temperatura=15;
            incremento=3;
        }
        
        public int sube(){
            temperatura = temperatura + 5;
            return temperatura;
        } 
        
        public int baja(){
            temperatura = temperatura -5;
            return temperatura;
        }
        
        public int muestra(){
            return temperatura;
        }
    }