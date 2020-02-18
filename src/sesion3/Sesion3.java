package sesion3;
import ico.fes.poo2.Reloj;

public class Sesion3 {

    public static void main(String[] args) {
        Reloj wacho=new Reloj(12, 44, 30);
        wacho.mostrarHora();
                
        int hora = wacho.getHora();
        int min = wacho.getMinuto();
        int seg = wacho.getSegundo();
        
        int i;
        
        while (seg<59&& min<59 && hora<24){
            seg++; 
            if (seg==60){
                seg=00;
                int minA= min+1;
                System.out.println(hora+":"+minA+":"+seg);
            }
            else if (seg<60){
                   
                System.out.println(hora+":"+min+":"+seg);
            }

            if(min==60){
               min=00; 
               int horA = hora+1;
                System.out.println(horA":"+min+":"+seg);
           
            }
                else if (min<60){
                System.out.println(hora+":"+min+":"+seg);
                     
                        }   
            if (hora==24){
            hora=00;
            }
            else if (hora<60){
                System.out.println(hora+":"+min+":"+seg);
            }
            
              }
                
            }
}
                        


            
    

        