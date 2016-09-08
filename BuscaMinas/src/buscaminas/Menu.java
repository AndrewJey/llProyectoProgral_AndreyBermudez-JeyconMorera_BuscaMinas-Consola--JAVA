/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquetes
package buscaminas;
//Importes
import javax.swing.JOptionPane;
/**
 **
 ** @author Andrey B & Jeycon M
 ** @date 2016-07-07 Jueves
 **/
public class Menu extends Object{
    //Variables globales
    int opc;
    int ganadas = 0;
    int perdidas = 0;
    public Menu(int opc){
        this.opc = opc;
    }
    /**
     * Constructor vacio
     **/
    public Menu(){}
    /**
     * Método menu que me instancia las clase Tablero,TableroMinas, para ejecutar correctamente el juego
     **/
    public void menu(){
        boolean comenzar = true; 
        while(comenzar==true){ //Ciclo que mantiene el juego activo
            try{ //Me trata cualquier error que se presente durante la ejecucion del juego, en este bloque de codigo 
             this.opc = Integer.parseInt(JOptionPane.showInputDialog("Elija una de las opciones\n1.Jugar \n2.Salir"));
             switch(opc){//Contenido de el menu jugar y salir
                 case 1:{//Caso 1 para darle inicio al juego
                  //Variables del caso 1
                  String [] [] minas = null;
                  String [] [] elegida = null;
                  String [] [] tablero = null;
                  int lados = 0;
                  int x = 0;
                  int y = 0;
                  //Instancias del paquete tableros para instanciar las clases Tablero, TableroMinas
                  tableros.Tablero t = new tableros.Tablero(tablero, minas, lados, x, y);                 
                  tableros.TableroMinas tm = new tableros.TableroMinas(tablero, minas, lados, x, y);
                  while((lados<=3)||(lados>22)){//Ciclo para limitar el tamaño del tablero tanto como con el minimo o el maximo
                  lados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del tablero\nEl minimo es de 4 y el maximo de 22")); 
                  if((lados<=3)||(lados>22)){//If que muestras un mensaje si te equivocas en los limites del tablero
                      JOptionPane.showMessageDialog(null,"El tamaño ingresado no es valido, el mìnimo es 4 y el maximo de 22","Error",JOptionPane.WARNING_MESSAGE);
                     }
                  }
                  tablero = new String[lados][lados];//Aqui le damos un tamaño a el tablero, igual a lo que seria lado*lado.
                  minas = new String[lados][lados];//Aqui le damos un tamaño a el tablero minas, igual a lo que seria lado*lado.
                  //Lamadas de los metodos de las clases Tablero y TableroMinas
                  t.llenarTablero(lados, tablero);
                  tm.llenarMinas(minas, lados);                
                  t.tableroJuego(tablero, minas, lados, ganadas, perdidas, x, y);
                  //Ciclo para contabilizar cuantas veces gana o pierde
                  int aciertos1 = 0;                 
                  for (int i = 0; i<lados;i++){
                     for (int j = 0; j<lados;j++){
                         if("[ ]".equals(tablero [i][j])||("[x]".equals(tablero[i][j]))){
                          aciertos1++;
                         }
                     }
                   }
                  int aciertos2 = 0;
                  for (int i = 0; i<lados;i++){
                     for (int j = 0; j<lados;j++){
                         if("[x]".equals(tablero [i][j])&&("[M]".equals(minas[i][j]))){
                          aciertos2++;
                         }
                     }
                   }
                  if((aciertos1 == lados*2)||(aciertos2==lados*2)){
                     ganadas++;
                     }else 
                     perdidas++;
                 }break;
                 //caso 2 para salir del juego
                 case 2:{                    
                 JOptionPane.showMessageDialog(null,"Has salido del juego");
                 }break;
                 case 10010:{
                  //Variables del caso 10010   
                  String [] [] minas = null;
                  String [] [] elegida = null;
                  String [] [] tablero = null;
                  int lados = 0;
                  int x = 0;
                  int y = 0;
                  //Instancias del paquete tableros para instanciar las clases Tablero, TableroMinas
                  tableros.Tablero t = new tableros.Tablero(tablero, minas, lados, x, y);                 
                  tableros.TableroMinas tm = new tableros.TableroMinas(tablero, minas, lados, x, y);
                   while((lados<=3)||(lados>22)){//Ciclo para limitar el tamaño del tablero tanto como con el minimo o el maximo
                      lados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del tablero\nEl minimo es de 4 y el maximo de 22")); 
                   if((lados<=3)||(lados>22)){//If que muestras un mensaje si te equivocas en los limites del tablero
                      JOptionPane.showMessageDialog(null,"El tamaño ingresado no es valido, el mìnimo es 4 y el maximo es de 22","Error",JOptionPane.WARNING_MESSAGE);
                     }
                  }
                  //Lamadas de los metodos de las clases Tablero y TableroMinas 
                  tablero = new String[lados][lados];
                  minas = new String[lados][lados];
                  t.llenarTablero(lados, tablero);
                  tm.llenarMinas(minas, lados);                 
                  t.tableroJugar1(lados, y, x, minas, tablero, ganadas, perdidas);
                  //Ciclo para contabilizar cuantas veces gana o pierde
                  int aciertos1 = 0;
                  for (int i = 0; i<lados;i++){
                     for (int j = 0; j<lados;j++){
                         if("[ ]".equals(tablero [i][j])||("[x]".equals(tablero[i][j]))){
                          aciertos1++;
                         }
                     }
                   }
                  if(aciertos1 == lados*2){
                     ganadas++;
                     }else 
                     perdidas++;
                 }break;
                 default:{
                     System.out.println("Has ingresado un número incorrecto");
                 }
             }
            }catch(Exception e){ //catch para tratar los posibles errores que pueda tener el proyecto
                System.out.println("Has ingresado un dato no numérico, o un numero con decimales");
            }
             int reiniciar = JOptionPane.showConfirmDialog(null,"Quieres volver a jugar");//Opcion que se presenta y pregunta que si desea jugar otra ves
             if(reiniciar==JOptionPane.YES_OPTION){
                 comenzar = true;
             }else
                 comenzar = false;             
          }
        JOptionPane.showMessageDialog(null,"Has terminado el Juego");
        }
    /**
     * Método toString de la clase Menu, (no se utiliza)
     * @return  Menu,opc,ganadas,perdidas
     **/
    @Override
    public String toString() {
        return "Menu{" + "opc=" + opc + ", ganadas=" + ganadas + ", perdidas=" + perdidas + '}';
    }   
 }