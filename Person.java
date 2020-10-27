//Person.java from package Promillerechner
//Michele Biondi
//Last updated 21.10.2020

class Person {
    
    //Variables
    
    public int maenlich = 0;
    public int weiblich = 1;
    private final double AbbauWartezeitStunde = 1.0;
    private final double AbbauProStunde = 0.1;
    private final double AnteilWasserImBlut = 0.8;
    private final double DichteBlutGrammProCcm = 1.055;
    
    private double  koepergroesse;
    private double koepermasse;
    private int gender;
    private double promille = 0;
    private int alter = 0;

    public Person(double koepergroesse, double koepermasse, int gender, int alter) {
        this.koepergroesse = koepergroesse;
        this.koepermasse = koepermasse;
        this.gender = gender;
        this.alter = alter;
    }
            
            
            

    
    
    

    public Person() {
    }
    
    private int koerpermasse(){
        return 0;
        
        
    
    }
    
    private double koerpergroesse(){
        return 0.0;
        
    }
    
    
    private java.util.Date geburtstagdatum(){
        return null;
    
    }
    
    private int geschlecht(){
        return 0;
    }
    
    private double alkoholPromille(){
        return 0.0;
    
    
    }
    
    
    
    //Getters and Setters
    
    public Person(double koerpermasse, double koerpergroesse, java.util.Date geburtstagdatum, int geschlecht){
        
        
    }
    
    private double getAlterinJahren(){
        return 0;
        
    }
    
    public void trinke(AlkoholischesGetraenk AlkoholischesGetraenk){
        
    }
   //Rechnung Promille
    public double getAlkoholPromille(){
        

        promille = (0.8) / (1.055 * getGKW());
        return promille;

    }
    //Rechnung getGW
    private double getGKW(){
         double gkw = 0;

        switch (gender) {
            case 0:
                gkw = 2.447 - 0.09516 * alter + 0.1074 * koepergroesse + 0.3362 + koepermasse;
                break;

            case 1:
                gkw = 0.203 - 0.07 * alter + 0.1069 * koepergroesse + 0.2466 + koepermasse;
                break;

        }
        return gkw;
    
    }


}
    
        
        
