
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//GUI.java from package Promillerechner
//Michele Biondi
//Last updated 21.10.2020


public class GUI {
    
    private Person askPersonData() {
       JFrame frame = new JFrame();
       
       String name = (JOptionPane.showInputDialog(frame, "Wie heissen sie?"));
       int alter = Integer.parseInt(JOptionPane.showInputDialog(frame, "Wann sind sie Geboren? (in 1000)"));
       double koepergroesse = Double.parseDouble(JOptionPane.showInputDialog(frame, "Wie gross sind sie in cm?"));
       double koepermasse = Double.parseDouble(JOptionPane.showInputDialog(frame, "Wie schwer sind sie in kg?"));
       int gender = Integer.parseInt(JOptionPane.showInputDialog(frame, "Was sind sie? 1 für Mann 0 für Frau"));
        
       
       
       
       
      
       
        
       Person newPerson = new Person(koepergroesse, koepermasse, gender, alter);
       return newPerson;
        
    }
    
    private AlkoholischesGetraenk askAlkoholischesGetraenkData(){
        JFrame frame = new JFrame();
        
        String getraenke[] = {
            "Wein", "Bier", "Schnapps"
        };
        
        double gehalt = 0;
        
        String getraenk = (String) JOptionPane.showInputDialog(frame,
          
                "What did you drink?",
                "Select the drink you had",
                JOptionPane.QUESTION_MESSAGE,
                null,
                getraenke,
                getraenke[0]);
        
        int getrunkenAm = Integer.parseInt(JOptionPane.showInputDialog(frame, "Wann haben sie Getrunken ? (vor wieviel Stunden)"));
        int volumenInMilliter = Integer.parseInt(JOptionPane.showInputDialog(frame, "Wie viel haben sie getrunken in ml)"));
        
        switch (getraenk) {
            case "Bier":
                gehalt = 0.05;
                break;
            case "Wein":
                gehalt = 0.1;
                break;
            case "Schnaps":
                gehalt = 0.4;
                break;
                
                
        }
        
        
       
        

        
        AlkoholischesGetraenk abc = new AlkoholischesGetraenk(getrunkenAm, volumenInMilliter, gehalt);
        return abc;
    
    }

    
    public void promilleRechner(){
       Person person = askPersonData();
       AlkoholischesGetraenk irgendeis = askAlkoholischesGetraenkData();
       
        
        
        
    }
    
    
}
