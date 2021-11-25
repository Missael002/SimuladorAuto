package carrera;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Carrera extends Thread{
     
    //creamos las variables
     private JLabel etiqueta;
     private frmCarrera auto;

     
    //constructor
    public Carrera(JLabel etiqueta, frmCarrera auto) {
        this.etiqueta = etiqueta;
        this.auto = auto;
    }
     
    
    @Override
    public void run(){
        
        int auto1 = 0;
        
        
         while(true){
             try{
                 
                  sleep((100));
                  
                  auto1 = auto.getPrimerAuto().getLocation().x;
                  
                  
                  if(auto1 < auto.getBarrera().getLocation().x - 125 ){
                      etiqueta.setLocation(etiqueta.getLocation().x +5,etiqueta.getLocation().y);
                      auto.repaint();
                  }else{
                      break;
                  }
                  
             }catch(InterruptedException e){
                 System.out.println(e);
             }
            
             if(etiqueta.getLocation().x >= auto.getBarrera().getLocation().x - 125){
                  {
                      JOptionPane.showMessageDialog(null,"limite alcanzado");
                  }
             }
                  else{
                      
                  }
             }
                   
        } 
    }

