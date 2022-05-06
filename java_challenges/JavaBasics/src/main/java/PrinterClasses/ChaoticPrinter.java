package PrinterClasses;

import basic_implementations.ChaoticControl;

public class ChaoticPrinter {

    public static void chaoPrinting(){
        // TODO: IF number is 1, return 3. IF number is less than 9, return 2. IF number is greater than 10 return 1. 9 or 10 returns 0.


        System.out.println("----------------------------------------------------");
        System.out.println("------------------Chaotic Start---------------------");

        ChaoticControl chaoticControl = new ChaoticControl();

        boolean check1 = (chaoticControl.ifChecks(1) == 3);
        boolean check4 = (chaoticControl.ifChecks(4) == 2) ;
        boolean check5 = (chaoticControl.ifChecks(5) == 2);
        boolean check9 = (chaoticControl.ifChecks(9) == 0);
        boolean check10 = (chaoticControl.ifChecks(10) == 0);

        System.out.printf("Your ifChecks test passed if the follow all prints true: \n %s \n %s \n %s \n %s",check1,check4,check5,check9,check10).println();
        System.out.println("--------------------ifChecks method End---------------------");


        boolean checkMonday = (chaoticControl.switchCentral("Monday").equals("Weekday"));
        boolean checkTuesday = (chaoticControl.switchCentral("Tuesday").equals("Weekday"));
        boolean checkWednesday = (chaoticControl.switchCentral("Wednesday").equals("Weekday"));
        boolean checkThursday = (chaoticControl.switchCentral("Thursday").equals("Weekday"));
        boolean checkFriday = (chaoticControl.switchCentral("Friday").equals("Weekday"));
        boolean checkSaturday = (chaoticControl.switchCentral("Saturday").equals("Weekend"));
        boolean checkSunday = (chaoticControl.switchCentral("Sunday").equals("Weekend"));


        System.out.printf("Your switchCentral test passed if the follow all prints true: \n %s \n %s \n %s \n %s \n %s \n %s",checkMonday,checkTuesday,checkWednesday,checkThursday,checkFriday,checkSaturday,checkSunday).println();
        System.out.println("--------------------switchCentral method End---------------------");


        System.out.println("----------------------------------------------------");
        System.out.println("--------------------Chaotic End---------------------");
    };
}
