import java.util.Scanner; 
 
public class PuntuacionTenis { 
    public static void main(String[] arg){ 
         String JugadorA = "Nadal"; 
         String JugadorB = "Federer"; 
         int PuntoPara=0; 
         int PuntuacionA=0, PuntosA = 0; 
         int PuntuacionB=0, PuntosB = 0; 
         String Puntuaciones[] = {"0","15","30","40","Iguales","Ventaja","Desventaja"}; 
         boolean FinSet = false; 
          
         Scanner teclado=new Scanner(System.in); 
          
         do{ 
            System.out.println(JugadorA + "(1), " + JugadorB+ "(2)\nPunto para el jugador:"); 
             PuntoPara = teclado.nextInt(); 
          
             if (PuntoPara==1){ 
                 PuntosA++; 
             }else if (PuntoPara==2){ 
                 PuntosB++;   
             }else{ 
                 System.out.println("El jugador es desconocido."); 
             } 
          
              
             if ((PuntosA >=3 && PuntosB< 3) || (PuntosB <=3 && PuntosA<3)){ 
                 PuntuacionA = PuntosA; 
                 PuntuacionB = PuntosB; 
                 if ((PuntosA>3 && PuntosB<(PuntosA-1))||(PuntosB>3 && PuntosA<(PuntosB-1))){ 
                     FinSet=true; 
                     PuntuacionA = PuntosA; 
                     PuntuacionB = PuntosB; 
                 } 
             } else if(PuntosA == PuntosB && PuntosA>=3){ 
                 PuntuacionA=4; 
                 PuntuacionB=4; 
             }else if(PuntosA>(PuntosB+1)||PuntosB>(PuntosA+1)){ 
                 FinSet=true; 
             }else if (PuntosA>PuntosB){ 
                 PuntuacionA=5; 
                 PuntuacionB=6; 
             }else if (PuntosB>PuntosA){ 
                 PuntuacionA=6; 
                 PuntuacionB=5; 
             } 
              
             System.out.println(JugadorA + ": " + Puntuaciones[PuntuacionA] + " | " + JugadorB + ": " + Puntuaciones[PuntuacionB]+"\n"); 
              
         }while(FinSet==false); 
          
         if (PuntosA>PuntosB){ 
             System.out.println("Ganador del set "+ JugadorA); 
         }else{ 
             System.out.println("Ganador del set "+ JugadorB); 
         }         
    } 
} 