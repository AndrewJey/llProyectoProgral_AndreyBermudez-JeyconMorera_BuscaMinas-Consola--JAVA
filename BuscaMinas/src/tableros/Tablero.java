/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquetes
package tableros;
//Importes
import javax.swing.JOptionPane;
/**
 **
 ** @author Andrey B & Jeycon M
 ** @date 2016-07-07 Jueves
 **/
public class Tablero extends Object{
    //Variavles globales
        public String[][] tablero;
        public String[][] minas;
        public int lados;
        public int x;
        public int y;
    /**
     * Constructor de la clase Tablero
     * @param tablero
     * @param minas
     * @param lados
     * @param x
     * @param y
     **/
    public Tablero(String[][] tablero, String[][] minas, int lados, int x, int y) {
        this.tablero = tablero;
        this.minas = minas;
        this.lados = lados;
        this.x = x;
        this.y = y;
    }        
    /**
     * Método get para la variable x
     * @return variable x 
     **/
    public int getX() {
        return x;
    }
    /**
     * Método set para la variable x
     * @param x
     **/
    public void setX(int x) {
        this.x = x;
    }
    /**
     * Método get para la variable y
     * @return variable y
     **/
    public int getY() {
        return y;
    }
    /**
     * Método set para variable y
     * @param y
     **/
    public void setY(int y) {
        this.y = y;
    }
    /**
     * Método get para variable tablero
     * @return tablero
     **/
    public String[][] getTablero() {
        return tablero;
    }
    /**
     * Método set para variable tablero
     * @param tablero
     **/
    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }
    /**
     * Método get para la variable minas
     * @return minas
     **/
    public String[][] getMinas() {
        return minas;
    }
    /**
     * Método set para la variable minas
     * @param minas
     **/
    public void setMinas(String[][] minas) {
        this.minas = minas;
    }
    /**
     * Método get para la variable lados
     * @return lados
     **/
    public int getLados() {
        return lados;
    }
    /**
     * Método set para la variable lados
     * @param lados
     **/
    public void setLados(int lados) {
        this.lados = lados;
    }
    /**
     * Método para llenar tablero
     * @param lados
     * @param tablero
     * @return tablero
     **/
    public String[][] llenarTablero(int lados,String[][] tablero){            
            for(int i = 0;i<lados;i++){
               for(int j = 0;j<lados;j++){
                tablero[i][j] = "[ ]";          
            }
        }
        return tablero;
     }
    /**
     * Método ceroD que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroD(String[][] minas,int x,int y,String[][] tablero, int lados){
           if("[0]".equals(minas[x][y])){
                while((y<=lados-1)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];
                this.ceroA(minas, x, y, tablero, lados);
                this.ceroB(minas, x, y, tablero, lados);
                y++;
              } 
              if(y<=lados-1){
                  tablero[x][y] = minas[x][y];
              }
            }
     }
    /**
     * Método ceroI que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroI(String[][] minas,int x,int y,String[][] tablero, int lados){
           if("[0]".equals(minas[x][y])){
                while((y>=0)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];
                this.ceroA(minas, x, y, tablero, lados);
                this.ceroB(minas, x, y, tablero, lados);
                y--;
              } 
              if(y>=0){
                  tablero[x][y] = minas[x][y];
              }
            }
     }
    /**
     * Método ceroA que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroA(String[][] minas,int x,int y,String[][] tablero, int lados){
           if("[0]".equals(minas[x][y])){
                while((x>=0)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];
                this.ceroD0(minas, x, y, tablero, lados);
                this.ceroI0(minas, x, y, tablero, lados);
                x--;
              } 
              if(x>=0){
                  tablero[x][y] = minas[x][y];
              }
            }
     }
    /**
     * Método ceroB que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroB(String[][] minas,int x,int y,String[][] tablero, int lados){
           if("[0]".equals(minas[x][y])){
                while((x<=lados-1)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];
                this.ceroD0(minas, x, y, tablero, lados);
                this.ceroI0(minas, x, y, tablero, lados);
                x++;
              } 
              if(x<=lados-1){
                  tablero[x][y] = minas[x][y];
              }
            }
     } 
    /**
     * Método ceroD0 que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroD0(String[][] minas,int x,int y,String[][] tablero, int lados){
           if("[0]".equals(minas[x][y])){
                while((y<=lados-1)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];
                this.ceroA0(minas, x, y, tablero, lados);
                this.ceroB0(minas, x, y, tablero, lados);
                this.ceroAD(minas, x, y, tablero, lados);
                this.ceroAI(minas, x, y, tablero, lados);
                this.ceroBD(minas, x, y, tablero, lados);
                this.ceroBI(minas, x, y, tablero, lados);
                y++;
              } 
              if(y<=lados-1){
                  tablero[x][y] = minas[x][y];
              }
            }
     }
    /**
     * Método ceroI0 que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroI0(String[][] minas,int x,int y,String[][] tablero, int lados){
           if("[0]".equals(minas[x][y])){
                while((y>=0)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];
                this.ceroA0(minas, x, y, tablero, lados);
                this.ceroB0(minas, x, y, tablero, lados);
                this.ceroAD(minas, x, y, tablero, lados);
                this.ceroAI(minas, x, y, tablero, lados);
                this.ceroBD(minas, x, y, tablero, lados);
                this.ceroBI(minas, x, y, tablero, lados);
                y--;
              } 
              if(y>=0){
                  tablero[x][y] = minas[x][y];
              }
            }
     }
    /**
     * Método ceroA0 que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroA0(String[][] minas,int x,int y,String[][] tablero, int lados){
           if("[0]".equals(minas[x][y])){
                while((x>=0)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];
                this.ceroD1(minas, x, y, tablero, lados);
                this.ceroI1(minas, x, y, tablero, lados);
                x--;
              } 
              if(x>=0){
                  tablero[x][y] = minas[x][y];
              }
            }
     }
    /**
     * Método ceroB0 que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroB0(String[][] minas,int x,int y,String[][] tablero, int lados){
           if("[0]".equals(minas[x][y])){
                while((x<=lados-1)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];
                this.ceroD1(minas, x, y, tablero, lados);
                this.ceroI1(minas, x, y, tablero, lados);
                x++;
              } 
              if(x<=lados-1){
                  tablero[x][y] = minas[x][y];
              }
            }
     }
    /**
     * Método ceroD1 que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroD1(String[][] minas,int x,int y,String[][] tablero, int lados){
           if("[0]".equals(minas[x][y])){
                while((y<=lados-1)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];
                this.ceroA1(minas, x, y, tablero, lados);
                this.ceroB1(minas, x, y, tablero, lados);
                y++;
              } 
              if(y<=lados-1){
                  tablero[x][y] = minas[x][y];
              }
            }
     }
    /**
     * Método ceroI1 que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroI1(String[][] minas,int x,int y,String[][] tablero, int lados){
           if("[0]".equals(minas[x][y])){
                while((y>=0)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];
             this.ceroA1(minas, x, y, tablero, lados);
                this.ceroB1(minas, x, y, tablero, lados);
                y--;
              } 
              if(y>=0){
                  tablero[x][y] = minas[x][y];
              }
            }
     }
    /**
     * Método ceroA1 que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroA1(String[][] minas,int x,int y,String[][] tablero, int lados){
           if("[0]".equals(minas[x][y])){
                while((x>=0)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];            
                x--;
              } 
              if(x>=0){
                  tablero[x][y] = minas[x][y];
              }
            }
     }
    /**
     * Método ceroB1 que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroB1(String[][] minas,int x,int y,String[][] tablero, int lados){
           if("[0]".equals(minas[x][y])){
                while((x<=lados-1)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];
                x++;
              } 
              if(x<=lados-1){
                  tablero[x][y] = minas[x][y];
              }
            }
     }
    /**
     * Método ceroAD que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroAD(String[][] minas,int x,int y,String[][] tablero, int lados){
                if("[0]".equals(minas[x][y])){
                while((x>=0)&&(y<=lados-1)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];
                this.ceroA1(minas, x, y, tablero, lados);
                this.ceroB1(minas, x, y, tablero, lados);
                this.ceroD1(minas, x, y, tablero, lados);
                this.ceroI1(minas, x, y, tablero, lados);
                x--;
                y++;
              } 
              if((x>=0)&&(y<=lados-1)){
                  tablero[x][y] = minas[x][y];
              }
            }
     }
    /**
     * Método ceroAI que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroAI(String[][] minas,int x,int y,String[][] tablero, int lados){
           if("[0]".equals(minas[x][y])){
                while((x>=0)&&(y>=0)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];
                this.ceroA1(minas, x, y, tablero, lados);
                this.ceroB1(minas, x, y, tablero, lados);
                this.ceroD1(minas, x, y, tablero, lados);
                this.ceroI1(minas, x, y, tablero, lados);
                x--;
                y--;
              } 
              if((x>=0)&&(y>=0)){
                  tablero[x][y] = minas[x][y];
              }
            }
     }
    /**
     * Método cero BD que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroBD(String[][] minas,int x,int y,String[][] tablero, int lados){
                if("[0]".equals(minas[x][y])){
                while((x<=lados-1)&&(y<=lados-1)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];
                this.ceroA1(minas, x, y, tablero, lados);
                this.ceroB1(minas, x, y, tablero, lados);
                this.ceroD1(minas, x, y, tablero, lados);
                this.ceroI1(minas, x, y, tablero, lados);
                x++;
                y++;
              } 
              if((x<=lados-1)&&(y<=lados-1)){
                  tablero[x][y] = minas[x][y];
              }
            }
     }
    /**
     * Método ceroBI que nos da la facilitacion de deliverar los cuadros que contengan 0 y a su alrededor hasta colicionar con un nunmero que no sea 0
     * @param minas
     * @param x
     * @param y
     * @param tablero
     * @param lados
     **/
    public void ceroBI(String[][] minas,int x,int y,String[][] tablero, int lados){
           if("[0]".equals(minas[x][y])){
                while((x<=lados-1)&&(y>=0)&&("[0]".equals(minas[x][y]))){ 
                tablero[x][y] = minas[x][y];
                this.ceroA1(minas, x, y, tablero, lados);
                this.ceroB1(minas, x, y, tablero, lados);
                this.ceroD1(minas, x, y, tablero, lados);
                this.ceroI1(minas, x, y, tablero, lados);
                x++;
                y--;
              } 
              if((x<=lados-1)&&(y>=0)){
                  tablero[x][y] = minas[x][y];
              }
            }
     }
    /**
     * Método marca que funciona por si se marcan todas las minas, que se gane
     * @param minas
     * @param tablero
     * @param x
     * @param y
     * @param lados
     * @return
     */
    public int marca(String[][] minas, String [][] tablero, int x, int y,  int lados){
        int marca = 0;
        for(int i = 0;i<lados;i++){
            for(int j = 0;j<lados;j++){
                if("[x]".equals(tablero[i][j])){
                    marca++;
                }
            }
        }
        return marca;
    }
    /**
     * Método que reune los demas metodos para la ejecucion del juego y que muestra el encabezado
     * @param tablero
     * @param minas
     * @param lados
     * @param ganadas
     * @param perdidas
     * @param x
     * @param y
     **/
    public void tableroJuego(String tablero[][],String[][] minas,int lados,int ganadas, int perdidas,int x, int y){
        //Variables
        boolean jugar = true;
        int aciertos = 0;
        int marcas = 0;
        while(jugar==true){
        //Encabezado
        System.out.println(" =======´BUSCA MINAS´=======");
        System.out.println("jugadas:"+(ganadas+perdidas)+" Ganadas:"+ganadas+" Perdidas:"+perdidas);
        System.out.println("Minas:"+(lados*2)+" Espacios sin minas:"+marcas+"/"+((lados*lados)-(lados*2)));
        String columnasC = " ";
        //Impresion del cuadro que se mostrara al usuario mientras juega
        for(int i = 0;i<=lados-1;i++){
            if(i==0){
                columnasC += "   "+i;
            }else if(i<10){
                columnasC += "  "+i;
            }else
                columnasC += " "+i;
        }
        System.out.println(columnasC);
        for(int i = 0;i<lados;i++){
            String tableroM = " ";
            for(int j = 0;j<lados;j++){
                tableroM += tablero[i][j];
            }
            if(i>=10){
                System.out.println(i+tableroM);
            }else
                System.out.println(i+" "+ tableroM);
        }
        //Menú
        boolean el = true;
        int opc1 = 0;
        while(el==true){
            try{//Revisa si hay errores
            opc1 = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción\n1.Mostrar \n2.Marcar \n3.Desmarcar \n4.Salir del juego"));  
            }catch(Exception e){//Atrapa los errores de este bloque
              JOptionPane.showMessageDialog(null,"Solo se aceptan numeros y que no sean decimales");  
            }
            el = false;
        }
        switch(opc1){//Menu que abarca las opciones de mostrar, marcar, desmarcar y salir del juego
            case 1:{//Caso para destapar los recuadros que contienen el tablero
         //Variables del menú       
         aciertos = 0;
         boolean pedir = true;
        while(pedir==true){
            try{//Revisa si hay un error
            x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna"));         
            }catch(Exception e){//Atrapa los errores que estan es este bloque
              JOptionPane.showMessageDialog(null,"Solo se aceptan numeros y que no sean decimales");   
            }
             if((x>lados-1)||(y>lados-1)){//Verifica si las coordenadas ingresadas concuerdan con el recuadro que se juega
                JOptionPane.showMessageDialog(null,"Las cordenadas no coinciden \ncon el tamaño del tablero\ningrese nuevas coordenadas","Error",JOptionPane.WARNING_MESSAGE);
            }else
            if((x<=lados-1)||(y<=lados-1)){
                pedir = false;
            }
        }
        if(!"[x]".equals(tablero[x][y])){
           if("[1]".equals(minas[x][y])){
             tablero[x][y] = "[1]";    
         }
           if("[2]".equals(minas[x][y])){
             tablero[x][y] = "[2]";
         }
            if("[3]".equals(minas[x][y])){
             tablero[x][y] = "[3]";
         }
            if("[4]".equals(minas[x][y])){
             tablero[x][y] = "[4]";
         }
            if("[5]".equals(minas[x][y])){
             tablero[x][y] = "[5]";
         }
            if("[6]".equals(minas[x][y])){
             tablero[x][y] = "[6]";
         }
            if("[7]".equals(minas[x][y])){
             tablero[x][y] = "[7]";
         }
            if("[8]".equals(minas[x][y])){
             tablero[x][y] = "[8]";
         }
            if("[0]".equals(minas[x][y])){
              tablero[x][y] = "[0]";
         }
        }
            //Llamada de los métodos para que se ejecute dentro del método tableroJuego
            this.ceroD(minas, x, y, tablero, lados);
            this.ceroI(minas, x, y, tablero, lados);
            marcas = 0;
            for (int i = 0; i<lados;i++){
            for (int j = 0; j<lados;j++){
                 if(!"[ ]".equals(tablero[i][j])||("[x]".equals(tablero[i][j]))){
                    marcas++;
                 }
             }
        }
            //Ciclo que se ejucata cuando se gana
             for (int i = 0; i<lados;i++){
            for (int j = 0; j<lados;j++){
                 if("[ ]".equals(tablero [i][j])||("[x]".equals(tablero[i][j]))){
                    aciertos++;
                 }
             }
        }
        if(aciertos == lados*2){
            //Mostramos el tablero completo
            String columnasM = " ";
            for(int i = 0;i<=lados-1;i++){
                if(i==0){
                    columnasM += "   "+i;
                }else if(i<10){
                    columnasM += "  "+i;
                }else
                    columnasM+= " "+i;
            }
            System.out.println(columnasM);
            for(int i = 0;i<lados;i++){
                String tableroM = " ";
                for(int j = 0;j<lados;j++){
                tableroM += minas[i][j];
                }
                if(i>=10){
                    System.out.println(i+tableroM);
                }else
                    System.out.println(i+" "+tableroM);
            }
            JOptionPane.showMessageDialog(null,"¡Has ganado felicidades!");
            jugar = false;//Condicion para salir de la partida
            ganadas++;
            //Mostramos el registro
            JOptionPane.showMessageDialog(null,"jugadas:"+(ganadas+perdidas)+" Ganadas:"+ganadas+" Perdidas:"+perdidas);
        }
            //Ciclo que se ejecuta cuando se pierde
            if(("[M]".equals(minas[x][y]))&&(!"[x]".equals(tablero[x][y]))){
            System.out.println("====Has perdido====");
            String columnasM = " ";
            for(int i = 0;i<=lados-1;i++){
                if(i==0){
                    columnasM += "   "+i;
                }else if(i<10){
                    columnasM += "  "+i; 
                }else
                    columnasM += " "+i;
            }
            System.out.println(columnasM);
            for(int i = 0;i<lados;i++){
                String tableroM = " ";
                for(int j = 0;j<lados;j++){
                tableroM += minas[i][j];
            }
                if(i>=10){
                    System.out.println(i+tableroM);
                }else
                    System.out.println(i+" "+tableroM);
            }
            JOptionPane.showMessageDialog(null,"<html><font color = red>Has perdido","Mensaje",JOptionPane.WARNING_MESSAGE);
            jugar = false;
            perdidas++;
            JOptionPane.showMessageDialog(null,"jugadas:"+(ganadas+perdidas)+" Ganadas:"+ganadas+" Perdidas:"+perdidas);
        }else if("[x]".equals(tablero[x][y])){
            tablero[x][y]="[x]";
        }
         }break;
            case 2:{//Caso para marcar donde se crea que este la mina
            boolean pedir = true;
        while(pedir==true){
             try{//Verifica si hay un error 
            x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna"));         
            }catch(Exception e){//Atrapa cualquier error encontrado en este bloque
              JOptionPane.showMessageDialog(null,"Solo se aceptan numeros y que no sean decimales");   
            }
             if((x>lados-1)||(y>lados-1)){//Verifica si las coordenadas ingresar son validas con el recuadro correspodiente
                JOptionPane.showMessageDialog(null,"Las cordenadas no coinciden \ncon el tamaño del tablero\ningrese nuevas coordenadas","Error",JOptionPane.WARNING_MESSAGE);
            }else
            if((x<=lados-1)||(y<=lados-1)){
                pedir = false;
            }
        }
        if(lados*2 > this.marca(minas, tablero, x, y, lados)){
            while("[ ]".equals(tablero[x][y])){
            if("[ ]".equals(tablero[x][y])){
             tablero[x][y]="[x]";
            }
            if("[M]".equals(minas[x][y])){
             tablero[x][y] = "[x]";
            }
            if("[1]".equals(minas[x][y])){
             tablero[x][y] = "[x]";
            }
            if("[2]".equals(minas[x][y])){
             tablero[x][y] = "[x]";
            }
            if("[3]".equals(minas[x][y])){
             tablero[x][y] = "[x]";
            } 
            if("[4]".equals(minas[x][y])){
             tablero[x][y] = "[x]";
            }
            if("[5]".equals(minas[x][y])){
             tablero[x][y] = "[x]";
            }
            if("[6]".equals(minas[x][y])){
             tablero[x][y] = "[x]";
            }
            if("[7]".equals(minas[x][y])){
             tablero[x][y] = "[x]";
            }
            if("[8]".equals(minas[x][y])){
             tablero[x][y] = "[x]";
            }
            if("[M]".equals(minas[x][y])){
             tablero[x][y]="[x]";
            }  
         } 
        }
        //Este ciclo que cuenta cuantas veces tapamos una mina corectamente para ganar.
        int mg = 0;
        for(int i = 0; i<lados;i++){
            for(int j = 0; j<lados; j++){
              if(("[M]".equals(minas[i][j]))&&(tablero[i][j]=="[x]")){
                 mg++;  
              }                 
            }
        }        
            if(mg == lados*2){
              jugar = false;//Condicion para salir de la partida
              //Mostramos el tablero completo
              String columnasM = " ";
           for(int i = 0;i<=lados-1;i++){
                if(i==0){
                    columnasM += "   "+i;
                }else if(i<10){
                    columnasM += "  "+i;
                }else
                    columnasM+= " "+i;
            }
            System.out.println(columnasM);
            for(int i = 0;i<lados;i++){
                String tableroM = " ";
                for(int j = 0;j<lados;j++){
                tableroM += minas[i][j];
                }
                if(i>=10){
                    System.out.println(i+tableroM);
                }else
                    System.out.println(i+" "+tableroM);
            }
            JOptionPane.showMessageDialog(null,"¡Has Marcado todas las minas correctamente felicidades ganastes!");
            ganadas++;
            JOptionPane.showMessageDialog(null,"jugadas:"+(ganadas+perdidas)+" Ganadas:"+ganadas+" Perdidas:"+perdidas);       
         }          
       }break;
         case 3:{//Caso para desmarcar la mina ya marcada
         boolean pedir = true;
         while(pedir==true){
             try{//Para revisar si se encuentra un error
            x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna"));         
            }catch(Exception e){//Atrapa los errores que ocurrieron en esete bloque
              JOptionPane.showMessageDialog(null,"Solo se aceptan numeros y que no sean decimales");   
            }
             if((x>lados-1)||(y>lados-1)){//If para que verifica si las coordenadaas ingresadas se encuentra en el recuadro jugado
                JOptionPane.showMessageDialog(null,"Las cordenadas no coinciden \ncon el tamaño del tablero\ningrese nuevas coordenadas","Error",JOptionPane.WARNING_MESSAGE);
            }else
            if((x<=lados-1)||(y<=lados-1)){
                pedir = false;
            }
         }            
            if("[x]".equals(tablero[x][y])){
             tablero[x][y] = "[ ]";
            }              
          }break;
            case 4:{//Caso para salir del juego mientras se este ejecutando
                System.out.println("Has salido del juego");
                jugar = false;//condicion para salir de la partida 
            }break;
       }
    }   
}
    /**
     * Método usado para gabar
     * @param lados
     * @param y
     * @param x
     * @param minas
     * @param tablero
     * @param ganadas
     * @param perdidas
     **/
    public void tableroJugar1(int lados, int y, int x, String[][] minas, String[][] tablero,int ganadas, int perdidas){
        for(int i = 0;i<lados;i++){
            for(int j = 0;j<lados;j++){
                if("[M]".equals(minas[i][j])){
                 tablero[i][j] = "[x]";            
                }
            }
        }
        //Variables utilizadas para el caso 10010
        boolean jugar = true;
        int marcas = 0;
        while(jugar==true){
        int aciertos = 0;        
        //Encabezado, lo que se mostrara cuando se ejecute este caso
        System.out.println(" =======´BUSCA MINAS´=======");
        System.out.println("jugadas:"+(ganadas+perdidas)+" Ganadas:"+ganadas+" Perdidas:"+perdidas);
        System.out.println("Minas:"+(lados*2)+" Espacios sin minas:"+marcas+"/"+((lados*lados)-(lados*2)));
        String columnasC = " ";
        for(int i = 0;i<=lados-1;i++){
            if(i==0){
                columnasC += "   "+i;
            }else if(i<10){
                columnasC += "  "+i;
            }else
                columnasC += " "+i;
        }
        System.out.println(columnasC);
        for(int i = 0;i<lados;i++){
            String tableroM = " ";
            for(int j = 0;j<lados;j++){
             tableroM += tablero[i][j];
            }
            if(i>=10){
             System.out.println(i+tableroM);
            }else
             System.out.println(i+" "+ tableroM);
        }
        boolean pedir = true;
        while(pedir==true){
            x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila"));//Donde se pide la fila
            y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna"));//Donde se pide la columna
            if((x>lados-1)||(y>lados-1)){//If para verificar si las cordenadas ingresadas son validas al recuadro en el que se juega
                JOptionPane.showMessageDialog(null,"Las cordenadas no coinciden \ncon el tamaño del tablero\ningrese nuevas coordenadas","Error",JOptionPane.WARNING_MESSAGE);
            }
            if((x<=lados-1)||(y<=lados-1)){
                pedir = false;
            }
        }
            if(!"[x]".equals(tablero[x][y])){
            if("[1]".equals(minas[x][y])){
             tablero[x][y] = "[1]";   
            }
            if("[2]".equals(minas[x][y])){
             tablero[x][y] = "[2]";
            }
            if("[3]".equals(minas[x][y])){
             tablero[x][y] = "[3]";
            }
            if("[4]".equals(minas[x][y])){
             tablero[x][y] = "[4]";
            }
            if("[5]".equals(minas[x][y])){
             tablero[x][y] = "[5]";
            }
            if("[6]".equals(minas[x][y])){
             tablero[x][y] = "[6]";
            }
            if("[7]".equals(minas[x][y])){
             tablero[x][y] = "[7]";
            }
            if("[8]".equals(minas[x][y])){
             tablero[x][y] = "[8]";
            }
            if("[0]".equals(minas[x][y])){
              tablero[x][y] = "[0]";
            }
            //Llamada de los métodos para que se ejecute dentro del método tableroJuego1
            this.ceroD(minas, x, y, tablero, lados);
            this.ceroI(minas, x, y, tablero, lados);         
            marcas = 0;
            for (int i = 0; i<lados;i++){
            for (int j = 0; j<lados;j++){
                 if(!"[ ]".equals(tablero[i][j])&&(!"[x]".equals(tablero[i][j]))){
                  marcas++;
                 }
            }
        }
            //Ciclo que se ejecuta cuando gana
           for (int i = 0; i<lados;i++){
            for (int j = 0; j<lados;j++){
                 if("[ ]".equals(tablero [i][j])||("[x]".equals(tablero[i][j]))){
                  aciertos++;
                 }
            }
        }
        if(aciertos == lados*2){
            String columnasM = " ";
            for(int i = 0;i<=lados-1;i++){
                if(i==0){
                    columnasM += "   "+i;
                }else if(i<10){
                    columnasM += "  "+i;
                }else
                    columnasM+= " "+i;
            }
            System.out.println(columnasM);
            for(int i = 0;i<lados;i++){
                String tableroM = " ";
                for(int j = 0;j<lados;j++){
                tableroM += minas[i][j];
                }
                if(i>=10){
                    System.out.println(i+tableroM);
                }else
                    System.out.println(i+" "+tableroM);
            }
            JOptionPane.showMessageDialog(null,"¡Has ganado felicidades!");
            ganadas++;
            jugar = false;
        }
            //Ciclo que se ejecuta cuando pierde
            if(("[M]".equals(minas[x][y]))&&(!"[x]".equals(tablero[x][y]))){
            System.out.println("====Has perdido====");
            String columnasM = " ";
            for(int i = 0;i<=lados-1;i++){
                if(i==0){
                    columnasM += "   "+i;
                }else if(i<10){
                    columnasM += "  "+i; 
                }else
                    columnasM += " "+i;
            }
            System.out.println(columnasM);
            for(int i = 0;i<lados;i++){
                String tableroM = " ";
                for(int j = 0;j<lados;j++){
                tableroM += minas[i][j];
            }
                if(i>=10){
                    System.out.println(i+tableroM);
                }else
                    System.out.println(i+" "+tableroM);
            }
            JOptionPane.showMessageDialog(null,"<html><font color = red>Has perdido","Mensaje",JOptionPane.ERROR_MESSAGE);
            perdidas++;
            jugar = false;
        }else if("[x]".equals(tablero[x][y])){
          tablero[x][y]="[x]";
          }
       }
    }   
  }
     /**
     * Método toString de la clase Tablero, (no se utiliza)
     * @return Tablero,tablero,minas,lados,x,y
     **/
    @Override
    public String toString() {
        return "Tablero{" + "tablero=" + tablero + ", minas=" + minas + ", lados=" + lados + ", x=" + x + ", y=" + y + '}';
    }
}
