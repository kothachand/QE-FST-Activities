public class age {
    public static void main(String[] args) {
        double seconds=1000000000;
        double earth=31557600;
        double mercury=0.2408467;
        double venus=0.61519726;
        double mars=1.8808158;
        double jupiter=11.862615;
        double saturun=29.447498;
        double uranus=84.016846;
        double neptune=164.79132;
        System.out.println("Age of earth is "+(seconds/earth));
        System.out.println("Age of mercury is "+(seconds/(earth*mercury)));
        System.out.println("Age of venus is "+(seconds/(earth*venus)));
        System.out.println("Age of mars is "+(seconds/(earth*mars)));
        System.out.println("Age of jupiter is "+(seconds/(earth*jupiter)));
        System.out.println("Age of saturun is "+(seconds/(earth*saturun)));
        System.out.println("Age of uranus is "+(seconds/(earth*uranus)));
        System.out.println("Age of neptune is "+(seconds/(earth*neptune)));
    }
}
