package sesion3;
import ico.fes.poo2.Reloj;

public class Sesion3 {

    
    public static void main(String[] args) {
        Reloj wacho=new Reloj(12, 44, 30);
        wacho.mostrarHora(); 
        Reloj hora1=new Reloj(22, 30, 40);
        Reloj hora2= new Reloj(13, 21, 45);
                
        int horaA = hora1.getHora();
        int minutoA = hora1.getMinuto();
        int segundoA = hora1.getSegundo();
        
        int horaB = hora2.getHora();
        int minutoB = hora2.getMinuto();
        int segundoB = hora2.getSegundo();
        
        int hor1 = (horaA+segundoA+minutoA);
        int hor2 = (horaB+minutoB+segundoB);
        
        int hora3 = (horaB*3600 + minutoB*60 + segundoB) - (horaA*3600 + minutoA*60 + segundoA*1);                           
        int hora = hora3/3600;
        int min=(hora3-(3600*hora))/60;
        int seg=hora3-((hora*3600)+(min*60));
        
        int hora4 = (horaB*3600 + minutoB*60 + segundoB) + (86400-(horaA*3600 + minutoA*60 + segundoA));;
        int horac = hora4/3600;
        int minc=(hora4-(3600*horac))/60;
        int segc=hora4-((horac*3600)+(minc*60));
           
        
        while(hor1<86400 && hor2<86400 && horaA<24 && horaB<24 && minutoA<60 && minutoB<60 && segundoA<60 && segundoB<60){        
            hor1++; hor2++; horaA++; horaB++; minutoA++; minutoB++; segundoA++; 
            segundoB++; hora3++; hora4++; min++; seg++; hora++; hor2++; 
            if (horaB>=horaA){
                System.out.println("han pasado "+hora+"horas, "+min+" minutos y "+seg+" segundos");           
     }
                    else if (horaA>=horaB){
                        System.out.println("Han pasado "+horac+"horas, "+minc+" minutos y "+segc+" segundos");
                 
        }
        
    }
}
}
