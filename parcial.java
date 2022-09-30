import javax.swing.JOptionPane;
public class parcial{
 public static void main(String [] args){

 String resul = ""; 
 //int i ;
 //int repetir = Integer.parseInt(JOptionPane.showInputDialog("Cuantas veces lo desea utilizar? : "));
 int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
 int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
 // for(i = 1 ; i == repetir ; i++){
 if(num > num2){
   resul  = "El numero:  "+ num + " es mayor que: " + num2 ;
   }
 else if(num2 > num){
     resul = "El numero: " + num2 + " es mayor que " + num ;
   }
 else if(num == num2){
     resul = num + " y " + num2 + "Son iguales" ;
   }
 else{
     resul = "Nada";
    }
//}
 JOptionPane.showMessageDialog(null,resul); 
 }
}