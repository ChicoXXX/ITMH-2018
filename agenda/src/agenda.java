import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class agenda {
    public static void main(String[] args) {
        
        ArrayList z1 = new ArrayList();
        ArrayList z2 = new ArrayList();
        ArrayList z3 = new ArrayList();
        int opc = 0;
        String x1,x2,x3,x4,x5,x6;
        x6 = JOptionPane.showInputDialog("Escribe Nombre y Apellido");
        JOptionPane.showMessageDialog(null, " Bienvenido "  +x6+  " Ha ingresado a su orgnizador de eventos");
        JOptionPane.showMessageDialog(null,"jueves, 8 de Noviembre de 2018");
        opc = JOptionPane.showConfirmDialog(null,"Desea ingresar algun evento");
        while (opc == 0) {
            x1 = JOptionPane.showInputDialog(null, "Ingrese el nombre del evento");
            x2 = JOptionPane.showInputDialog(null, " Ingrese la fecha de evento: DD/MM/AAAA");
            x5 = "\n\n Prioridad del evento"+" \n"+"\n\n A.- Baja" +" \n\n B.- Media"+"\n\n C.- Urgente";
            x3 = JOptionPane.showInputDialog(null, x5);
            x4 = "Evento:"+x1+"\t Fecha"+x2+"\t Prioridad";
            
            if(x3.equals("A"))
            {z1.add(x4+" Baja");}
            else if(x3.equals("B"))
            {z1.add(x4+" Media");}
            else if (x3.equals("C"))
                    {z1.add(x4+" Urgente");}
            else {System.out.println("");
            return;}
            
            opc = JOptionPane.showConfirmDialog(null, "¿Deseas agregar otro evento?");
        }
        Iterator y1 = z1.iterator();
        Iterator y2 = z2.iterator();
        Iterator y3 = z3.iterator();
        
        while(y3.hasNext())
        {JOptionPane.showMessageDialog(null, y3.next() );}
        
        while(y2.hasNext())
        {JOptionPane.showMessageDialog(null, y2.next());}
        
        while(y1.hasNext())
        {JOptionPane.showMessageDialog(null, y1.next());}
            }
        }
    

