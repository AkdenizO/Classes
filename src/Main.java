public class Main {

    public static void main(String[] args) {

        CustumerManager custumerManager = new CustumerManager();
        custumerManager.Add();
        custumerManager.Remove();
        custumerManager.Update();

        // value
        int zahl1 = 10;
        int zahl2 = 20;
        zahl2 = zahl1;
        zahl1 = 30;
        System.out.println(zahl2);

        int[] zahlen1 = {1, 2, 3};
        int[] zahlen2 = {4, 5, 6};
        zahlen2 = zahlen1;
        zahlen1[0] = 10;
        System.out.println(zahlen2[0]);





    }
}

