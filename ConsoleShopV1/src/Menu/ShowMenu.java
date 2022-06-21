package Menu;

public class ShowMenu {

    public void showFirstMenu(){
        System.out.println("Podaj co chcesz zrobic");
        System.out.println("ponizej opcje wyboru");
        System.out.println("1. Dodaj produkt");
        System.out.println("2. Usun produkt");
        System.out.println("3. Lista produktww");
        System.out.println("4. Pokaz menu ponownie");
        System.out.println("5. Wyjscie");
    }

    public void showRoleMenu(){
        System.out.println("Wybierz do kogo się chcesz zalogować");
        System.out.println("1. Manager");
        System.out.println("2. Sprzedawca");
        System.out.println("3. Magazynier");
        System.out.println("4. Koniec programu");
    }

    public void showSecondMenu(){
        System.out.println("1. Dodaj, 2. Usun, 3.Pokaz produkty, 4. Menu, 5. Wroc");
        System.out.println("Co chcesz zrobic dalej ?");
    }

    public void managerMenuUser() {
        System.out.println("1. Dodaj, 2. Usun, 3.Pokaz uzytkownikow, 4. Menu, 5. Wroc");
        System.out.println("Co chcesz zrobic dalej ?");
    }



}
