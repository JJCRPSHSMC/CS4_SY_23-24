public class Ribuyaco_CS4_1EX1 {
    public static class friend {
        String name;
        int yearsKnown;
        char friendGroup;
    }
    public static void main(String[] args) {
        friend Andre = new friend();
        Andre.name = "Andre";
        Andre.yearsKnown = 5;
        Andre.friendGroup = 'a';

        friend Nala = new friend();
        Nala.name = "Nala";
        Nala.yearsKnown = 1;
        Nala.friendGroup = 'b';

        friend Farah = new friend();
        Farah.name = "Farah";
        Farah.yearsKnown = 3;
        Farah.friendGroup = 'b';

        System.out.println("Friend 1\r\nName: "+Andre.name+"\r\nYears Known: "+Andre.yearsKnown+"\r\nSocial Circle: " +Andre.friendGroup+"\r\n");
        System.out.println("Friend 2\r\nName: "+Nala.name+"\r\nYears Known: "+Nala.yearsKnown+"\r\nSocial Circle: " +Nala.friendGroup+"\r\n");
        System.out.println("Friend 3\r\nName: "+Farah.name+"\r\nYears Known: "+Farah.yearsKnown+"\r\nSocial Circle: " +Farah.friendGroup+"\r\n");

        System.out.println("Total years of Friendship: " + ((int)Andre.yearsKnown+Nala.yearsKnown+Farah.yearsKnown));
        boolean circleSame = Nala.friendGroup==Farah.friendGroup;
        System.out.println("Are Nala and Farah from the same social circle: " + circleSame);
        boolean yearsMore = Farah.yearsKnown>Andre.yearsKnown;
        System.out.println("Was Farah known longer than Andre: " + yearsMore);
    }
}