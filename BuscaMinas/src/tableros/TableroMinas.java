/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquetes
package tableros;
/**
 *
 ** @author Andrey B & Jeycon M
 ** @date 2016-07-07 Jueves
 **/
public class TableroMinas extends Tablero{
    /**
     * Constructor heredado de la clase Tablero
     * @param tablero
     * @param minas
     * @param lados
     * @param x
     * @param y
     **/
    public TableroMinas(String[][] tablero, String[][] minas, int lados, int x, int y) {
        super(tablero, minas, lados, x, y);
    }
    /**
     * Método para llenar tablero, con minas y numeros
     * @param minas
     * @param lados
     * @return minas
     **/
    public String[][] llenarMinas(String[][] minas, int lados){
         int contador = 0;
            for(int i = 0;i<lados;i++){
               for(int j = 0;j<lados;j++){
                 minas[i][j] = "[0]";
            }
        }
        //Ciclo que elige 2 cordenadas aleatorias para colocar las minas
         while(contador<lados*2){            
           int minaAleatoria1 = (int) (Math.random()*lados);
           int minaAleatoria2 = (int) (Math.random()*lados);
           if(!"[M]".equals(minas[minaAleatoria1][minaAleatoria2])){
               minas[minaAleatoria1][minaAleatoria2] = "[M]";
               contador++;
           }          
         }
        //Ciclo que me localiza una mina y me traslada hacia su derecha para coloar un numero dependientemente al que ya este
         for(int i = 0; i<lados;i++){
             for(int j = 0; j<lados;j++){
                 if("[M]".equals(minas[i][j])){
                       j++;
                     if(j<=(lados-1)){
                        if("[0]".equals(minas[i][j])){
                         minas[i][j] = "[1]";
                         j--;
                     }else if("[1]".equals(minas[i][j])){
                         minas[i][j] = "[2]";
                         j--;
                     }else if("[2]".equals(minas[i][j])){
                         minas[i][j]="[3]";
                         j--;
                     }else if("[3]".equals(minas[i][j])){
                         minas[i][j]="4";
                         j--;
                     }else if("[4]".equals(minas[i][j])){
                         minas[i][j]="[5]";
                         j--;
                     }else if("[5]".equals(minas[i][j])){
                         minas[i][j]="[6]";
                         j--;
                     }else if("[6]".equals(minas[i][j])){
                         minas[i][j]="[7]";
                         j--;
                     }else if("[7]".equals(minas[i][j])){
                         minas[i][j]="[8]";
                         j--;
                     }else if("[M]".equals(minas[i][j])){
                         j--;
                     }
                    }
                     if(j>=lados){
                         j--;
                     }
                 }              
             }
         }
        //Ciclo que me localiza una mina y me traslada hacia su izquierda para coloar un numero dependientemente al que ya este
          for(int i = 0; i<lados;i++){
             for(int j = 0; j<lados;j++){
                 if("[M]".equals(minas[i][j])){
                       j--;
                     if(j >= 0){
                        if("[0]".equals(minas[i][j])){
                         minas[i][j] = "[1]";
                         j++;
                     }else if("[1]".equals(minas[i][j])){
                         minas[i][j] = "[2]";
                         j++;
                     }else if("[2]".equals(minas[i][j])){
                         minas[i][j]="[3]";
                         j++;
                     }else if("[3]".equals(minas[i][j])){
                         minas[i][j]="4";
                         j++;
                     }else if("[4]".equals(minas[i][j])){
                         minas[i][j]="[5]";
                         j++;
                     }else if("[5]".equals(minas[i][j])){
                         minas[i][j]="[6]";
                         j++;
                     }else if("[6]".equals(minas[i][j])){
                         minas[i][j]="[7]";
                         j++;
                     }else if("[7]".equals(minas[i][j])){
                         minas[i][j]="[8]";
                         j++;
                     }else if("[M]".equals(minas[i][j])){
                         j++;
                     }
                    }
                     if(j<0){
                         j++;
                     }
                 }              
             }
         }
        //Ciclo que me localiza una mina y me traslada hacia arriba para coloar un numero dependientemente al que ya este
              for(int i = 0; i<lados;i++){
                for(int j = 0; j<lados;j++){
                 if("[M]".equals(minas[i][j])){
                       i--;
                     if(i >= 0){
                        if("[0]".equals(minas[i][j])){
                         minas[i][j] = "[1]";
                         i++;
                     }else if("[1]".equals(minas[i][j])){
                         minas[i][j] = "[2]";
                         i++;
                     }else if("[2]".equals(minas[i][j])){
                         minas[i][j]="[3]";
                         i++;
                     }else if("[3]".equals(minas[i][j])){
                         minas[i][j]="4";
                         i++;
                     }else if("[4]".equals(minas[i][j])){
                         minas[i][j]="[5]";
                         i++;
                     }else if("[5]".equals(minas[i][j])){
                         minas[i][j]="[6]";
                         i++;
                     }else if("[6]".equals(minas[i][j])){
                         minas[i][j]="[7]";
                         i++;
                     }else if("[7]".equals(minas[i][j])){
                         minas[i][j]="[8]";
                         i++;
                     }else if("[M]".equals(minas[i][j])){
                         i++;
                     }
                         }
                     if(i<0){
                         i++;
                     }
                 }              
             }
         }
        //Ciclo que me localiza una mina y me traslada hacia abajo para coloar un numero dependientemente al que ya este
            for(int i = 0; i<lados;i++){
             for(int j = 0; j<lados;j++){
                 if("[M]".equals(minas[i][j])){
                       i++;
                     if(i < lados){
                        if("[0]".equals(minas[i][j])){
                         minas[i][j] = "[1]";
                         i--;
                     }else if("[1]".equals(minas[i][j])){
                         minas[i][j] = "[2]";
                         i--;
                     }else if("[2]".equals(minas[i][j])){
                         minas[i][j]="[3]";
                         i--;
                     }else if("[3]".equals(minas[i][j])){
                         minas[i][j]="[4]";
                         i--;
                     }else if("[4]".equals(minas[i][j])){
                         minas[i][j]="[5]";
                         i--;
                     }else if("[5]".equals(minas[i][j])){
                         minas[i][j]="[6]";
                         i--;
                     }else if("[6]".equals(minas[i][j])){
                         minas[i][j]="[7]";
                         i--;
                     }else if("[7]".equals(minas[i][j])){
                         minas[i][j]="[8]";
                         i--;
                     }else if("[M]".equals(minas[i][j])){
                         i--;
                     }
                          }
                     if(i>lados-1){
                         i--;
                     }
                 } 
             }
         }
        //Ciclo que me localiza una mina y me traslada hacia el noreste para coloar un numero dependientemente al que ya este
            for(int i = 0; i<lados;i++){
             for(int j = 0; j<lados;j++){
                 if("[M]".equals(minas[i][j])){
                       j++;
                       i--;
                     if((i >= 0) && (j<=lados-1)){
                        if("[0]".equals(minas[i][j])){
                         minas[i][j] = "[1]";
                         i++;
                         j--;
                     }else if("[1]".equals(minas[i][j])){
                         minas[i][j] = "[2]";
                         i++;
                         j--;
                     }else if("[2]".equals(minas[i][j])){
                         minas[i][j]="[3]";
                         i++;
                         j--;
                     }else if("[3]".equals(minas[i][j])){
                         minas[i][j]="[4]";
                         i++;
                         j--;
                     }else if("[4]".equals(minas[i][j])){
                         minas[i][j]="[5]";
                         i++;
                         j--;
                     }else if("[5]".equals(minas[i][j])){
                         minas[i][j]="[6]";
                         i++;
                         j--;
                     }else if("[6]".equals(minas[i][j])){
                         minas[i][j]="[7]";
                         i++;
                         j--;
                     }else if("[7]".equals(minas[i][j])){
                         minas[i][j]="[8]";
                         i++;
                         j--;
                     }else if("[M]".equals(minas[i][j])){
                         i++;
                         j--;
                     }
                    }
                     if((i<0)||(j>lados-1)){
                         i++;
                         j--;
                     }
                 } 
             }
         }
        //Ciclo que me localiza una mina y me traslada hacia el noroeste para coloar un numero dependientemente al que ya este
             for(int i = 0; i<lados;i++){
             for(int j = 0; j<lados;j++){
                 if("[M]".equals(minas[i][j])){
                       j--;
                       i--;
                     if((i >= 0) && (j>=0)){
                        if("[0]".equals(minas[i][j])){
                         minas[i][j] = "[1]";
                         i++;
                         j++;
                     }else if("[1]".equals(minas[i][j])){
                         minas[i][j] = "[2]";
                         i++;
                         j++;
                     }else if("[2]".equals(minas[i][j])){
                         minas[i][j]="[3]";
                         i++;
                         j++;
                     }else if("[3]".equals(minas[i][j])){
                         minas[i][j]="[4]";
                         i++;
                         j++;
                     }else if("[4]".equals(minas[i][j])){
                         minas[i][j]="[5]";
                         i++;
                         j++;
                     }else if("[5]".equals(minas[i][j])){
                         minas[i][j]="[6]";
                         i++;
                         j++;
                     }else if("[6]".equals(minas[i][j])){
                         minas[i][j]="[7]";
                         i++;
                         j++;
                     }else if("[7]".equals(minas[i][j])){
                         minas[i][j]="[8]";
                         i++;
                         j++;
                     }else if("[M]".equals(minas[i][j])){
                         i++;
                         j++;
                     }
                    }
                     if((i<0)||(j<0)){
                         i++;
                         j++;
                     }
                 } 
             }
         }
        //Ciclo que me localiza una mina y me traslada hacia el sureste para coloar un numero dependientemente al que ya este
             for(int i = 0; i<lados;i++){
             for(int j = 0; j<lados;j++){
                 if("[M]".equals(minas[i][j])){
                       j++;
                       i++;
                     if((i <= lados-1) && (j<=lados-1)){
                        if("[0]".equals(minas[i][j])){
                         minas[i][j] = "[1]";
                         i--;
                         j--;
                     }else if("[1]".equals(minas[i][j])){
                         minas[i][j] = "[2]";
                         i--;
                         j--;
                     }else if("[2]".equals(minas[i][j])){
                         minas[i][j]="[3]";
                         i--;
                         j--;
                     }else if("[3]".equals(minas[i][j])){
                         minas[i][j]="[4]";
                         i--;
                         j--;
                     }else if("[4]".equals(minas[i][j])){
                         minas[i][j]="[5]";
                         i--;
                         j--;
                     }else if("[5]".equals(minas[i][j])){
                         minas[i][j]="[6]";
                         i--;
                         j--;
                     }else if("[6]".equals(minas[i][j])){
                         minas[i][j]="[7]";
                         i--;
                         j--;
                     }else if("[7]".equals(minas[i][j])){
                         minas[i][j]="[8]";
                         i--;
                         j--;
                     }else if("[M]".equals(minas[i][j])){
                         i--;
                         j--;
                     }
                    }
                     if((i>lados-1)||(j>lados-1)){
                         i--;
                         j--;
                     }
                 } 
             }
         }
        //Ciclo que me localiza una mina y me traslada hacia el suroeste para coloar un numero dependientemente al que ya este
             for(int i = 0; i<lados;i++){
             for(int j = 0; j<lados;j++){
                 if("[M]".equals(minas[i][j])){
                       j--;
                       i++;
                     if((i <= lados-1) && (j>=0)){
                        if("[0]".equals(minas[i][j])){
                         minas[i][j] = "[1]";
                         i--;
                         j++;
                     }else if("[1]".equals(minas[i][j])){
                         minas[i][j] = "[2]";
                         i--;
                         j++;
                     }else if("[2]".equals(minas[i][j])){
                         minas[i][j]="[3]";
                         i--;
                         j++;
                     }else if("[3]".equals(minas[i][j])){
                         minas[i][j]="[4]";
                         i--;
                         j++;
                     }else if("[4]".equals(minas[i][j])){
                         minas[i][j]="[5]";
                         i--;
                         j++;
                     }else if("[5]".equals(minas[i][j])){
                         minas[i][j]="[6]";
                         i--;
                         j++;
                     }else if("[6]".equals(minas[i][j])){
                         minas[i][j]="[7]";
                         i--;
                         j++;
                     }else if("[7]".equals(minas[i][j])){
                         minas[i][j]="[8]";
                         i--;
                         j++;
                     }else if("[M]".equals(minas[i][j])){
                         i--;
                         j++;
                     }
                    }
                     if((i>lados-1)||(j<0)){
                         i--;
                         j++;
                     }
                 } 
             }
         }
        return minas;
     }
    /**
     * Método toString de mi clase TableroMinas, (no se utiliza)
     * @return TableroMinas
     **/
    @Override
    public String toString() {
        return "TableroMinas{" + '}';
    }
}
