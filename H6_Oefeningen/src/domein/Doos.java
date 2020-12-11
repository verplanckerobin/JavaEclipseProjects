package domein;

public class Doos {

    private double lengte, breedte, hoogte;
    private String kleur;
    private String code;
    private static int aantalDozen;
    
    public Doos(){
        this(1.0, 1.0, 1.0, "rood");
    }
    
    public Doos(double lengte, double breedte, double hoogte, String kleur) {
        setLengte(lengte);
        setBreedte(breedte);
        setHoogte(hoogte);
        setKleur(kleur);
        aantalDozen++;
        genereerCode();
    }

    @Override
    public String toString(){
        return String.format("Een doos met lengte %.2f, met hoogte %.2f, met "
                + "breedte %.2f en kleur %s.%nDeze doos heeft als unieke code %s.%n", lengte,hoogte,breedte, kleur, code);
    }
    
    private void controleerAfmeting(String afmeting, double minWaarde, double waarde) {
        if (waarde <= minWaarde) {
            throw new IllegalArgumentException(String.format("De %s is te klein.", afmeting));
        }
    }

    public static int getAantalDozen() {
        return aantalDozen;
    }

    
    public double getLengte() {
        return lengte;
    }

    public final void setLengte(double lengte) {
        controleerAfmeting("lengte", 0, lengte);
        this.lengte = lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    private void setBreedte(double breedte) {
        controleerAfmeting("breedte", 0, breedte);
        this.breedte = breedte;
    }

    public double getHoogte() {
        return hoogte;
    }

    private void setHoogte(double hoogte) {
        controleerAfmeting("hoogte", 0, hoogte);
        this.hoogte = hoogte;
    }

    public String getKleur() {
        return kleur;
    }

    private void setKleur(String kleur) {
        if (kleur == null || kleur.isEmpty()) {
            throw new IllegalArgumentException("Kleur moet ingevuld worden.");
        }
        this.kleur = kleur;
    }

    private void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    
    private void genereerCode() {
        setCode(String.format("D%015d", aantalDozen));
    }

}
