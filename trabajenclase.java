import javax.swing.JOptionPane;
import javax.swing.JTextArea;
 public class TareaAra {
    public static void main(String[] args) {
        String marca[];
        String modelo[];
        double vel[];
        String tipo[];
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int res=4;
        String salida= "Orden\t"+"Marca\t"+"Modelo\t"+"Velocidad\t"+"Tipo\n";

  do{
         int n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos autos desea cargar"));
         marca = new String[n];
         modelo = new String[n];
         vel = new double[n];
         tipo =new String[n];
      for (int i = 0; i < n; i++) {

            marca[i] = JOptionPane.showInputDialog("Ingrese la marca del vehiculo: ");
            modelo[i] = JOptionPane.showInputDialog("Ingrese el modelo del auto: ");
            vel[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su velocidad"));
            if (vel[i] <= 120) {
                contador1 = contador1 +1;      
                tipo[i]= "Para Paseo";
            } else if ((vel[i] > 120) && (vel[i] <= 250)) {
                contador2 = contador2 +1;  
                tipo[i]= "Para Diversion";
            } else if (vel[i] > 250) {
                contador3 = contador3 +1;  
                tipo[i]= "Para Diversion";
            }
        }
       
     for (int i=0;i<n;i++){ 
       // salida+= (i+1)+"\t"+marca[i]+"\t"+modelo[i]+"\t"+vel[i]+"\t"+tipo[i]+"\n";
          if(res==1){
           salida+= (i+2)+"\t"+marca[i]+"\t"+modelo[i]+"\t"+vel[i]+"\t"+tipo[i]+"\n";
          }else {
            salida+= (i+1)+"\t"+marca[i]+"\t"+modelo[i]+"\t"+vel[i]+"\t"+tipo[i]+"\n";
          }   
     }
     salida=salida+"\n"+"Cantidad Para Paseo: "+contador1+"\n"+"Cantidad Para Diversion: "+contador2+"\n"+"Cantidad Para Carrera: "+contador3;
 
    JTextArea areaSalida=new JTextArea();
    areaSalida.setText(salida);
    JOptionPane.showMessageDialog(null,areaSalida,"TareaAra",JOptionPane.INFORMATION_MESSAGE);
    res= Integer.parseInt(JOptionPane.showInputDialog("Ingresar mas datos? 1=SI 999=No "));    


 }while (res!=999);

        
    }

}