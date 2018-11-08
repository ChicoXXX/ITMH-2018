import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class Cronometro extends JFrame implements Runnable, ActionListener
{
    public static int onoff = 0;
    public Cronometro()
    {
        setTitle("Cronometro");
        setSize( 300, 200 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLayout( new BorderLayout() );

        
        tiempo = new JLabel( "00:00:000" );
        tiempo.setFont( new Font( Font.SERIF, Font.BOLD, 50 ) );
        tiempo.setHorizontalAlignment( JLabel.CENTER );
        tiempo.setForeground( Color.BLUE );
        tiempo.setBackground( Color.WHITE );
        tiempo.setOpaque( true );

        add( tiempo, BorderLayout.CENTER );

        //Boton iniciar
        JButton btn = new JButton( "Iniciar" );
        btn.addActionListener( this );
        add( btn, BorderLayout.NORTH );

        //Boton reiniciar inicia nuevamente desde 0
        JButton btnP = new JButton( "Reiniciar" );
        btnP.addActionListener( this );
        add( btnP, BorderLayout.SOUTH );

        this.setLocationRelativeTo( null );
        setVisible( true );
    }

    public void run(){
        Integer minutos = 0 , segundos = 0, milesimas = 0;
        //min es minutos, seg es segundos y mil es milesimas de segundo
        String min="", seg="", mil="";
        try
        {
            
            while( cronometroActivo )
            {
                Thread.sleep( 4 );
                
                milesimas += 4;

                
                if( milesimas == 1000 )
                {
                    milesimas = 0;
                    segundos += 1;
                   
                    if( segundos == 60 )
                    {
                        segundos = 0;
                        minutos++;
                    }
                }

                
                if( minutos < 10 ) min = "0" + minutos;
                else min = minutos.toString();
                if( segundos < 10 ) seg = "0" + segundos;
                else seg = segundos.toString();

                if( milesimas < 10 ) mil = "00" + milesimas;
                else if( milesimas < 100 ) mil = "0" + milesimas;
                else mil = milesimas.toString();

                //Colocamos en la etiqueta la informacion
                tiempo.setText( min + ":" + seg + ":" + mil );
            }
        }catch(Exception e){}
        tiempo.setText( "00:00:000" );
    }

    
    public void actionPerformed( ActionEvent evt ) {
        Object o = evt.getSource();
        if( o instanceof JButton )
        {
            JButton btn = (JButton)o;
            if( btn.getText().equals("Iniciar") ){
                if(onoff == 0){
                   onoff = 1;
                   iniciarCronometro();
                }
            }
            if( btn.getText().equals("Reiniciar") ) {
                if (onoff == 1){
                   onoff = 0;
                   pararCronometro();
                }
            }
        }
    }

    
    public void iniciarCronometro() {
        cronometroActivo = true;
        hilo = new Thread( this );
        hilo.start();
    }

    //Esto es para parar el cronometro
    public void pararCronometro(){
        cronometroActivo = false;
    }

    public static void main(String[] args) {
        
        new Cronometro();
    }

    JLabel tiempo;
    Thread hilo;
    boolean cronometroActivo;
}
