import java.util.Scanner;

/**
 * Created by veraivanova on 03.09.16.
 */
public class NotebookEntry {

    String[] a = new String[100];

    int n = 0;

    private int findingASlot(){
        for (int i = 0; i < 100; i++){
            if (a[i] == null) {

                n = i;
                break;
            }

        }

        if (n == 99)
            System.out.println("Нет свободного места для новых записей");

        return n;

    }

    void makingAChoice () {

        for (int work = 0; work < 100; work++){

            int choice = -1;
            int mainchoice = -1;

            if (work == 0) {
                System.out.println("Введите цифру, чтобы сделать выбор\n " +
                        "1 - чтобы добавить запись \n " +
                        "2 - чтобы удалить запись \n " +
                        "3 - чтобы редактировать запись \n " +
                        "4 - чтобы посмотреть все записи");

                Scanner scchoice = new Scanner(System.in);
                choice = scchoice.nextInt();

                switch (choice) {
                    case 1: addEntry();
                        break;
                    case 2: deleteEntry();
                        break;
                    case 3: editEntry();
                        break;
                    case 4: viewAllEntries();
                        break;

                }
            }

            else {

                System.out.println("Хотите ли вы продолжить работу?\n" +
                        "1 - если да\n" +
                        "0 - если нет");
                Scanner scmainchoice = new Scanner(System.in);
                mainchoice = scmainchoice.nextInt();

                if (mainchoice == 1) {

                    System.out.println("Введите цифру, чтобы сделать выбор\n " +
                            "1 - чтобы добавить запись \n " +
                            "2 - чтобы удалить запись \n " +
                            "3 - чтобы редактировать запись \n " +
                            "4 - чтобы посмотреть все записи \n" +
                            "0 - чтобы закончить работу");

                    Scanner scchoice = new Scanner(System.in);
                    choice = scchoice.nextInt();

                    switch (choice) {
                        case 1:
                            addEntry();
                            break;
                        case 2:
                            deleteEntry();
                            break;
                        case 3:
                            editEntry();
                            break;
                        case 4:
                            viewAllEntries();
                            break;
                        case 0:
                            System.exit(0);
                    }
                }

                else
                    System.exit(0);


            }
        }

    }

    private void viewAllEntries() {

        for (int i = 0; i < 100; i++){
            if (a[i] != null) {
                System.out.println("Запись " + i +" - " + a[i]);
            }
        }

    }

    private void editEntry() {

        System.out.println("Введите номер записи, которую Вы хотите отредактировать");
        Scanner scentrynumber = new Scanner(System.in);
        int entrynumber = scentrynumber.nextInt();
        System.out.println("Отредактируйте запись " + entrynumber);
        Scanner sceditentry = new Scanner(System.in);
        String editEntry = sceditentry.nextLine();
        a[entrynumber] = editEntry;

    }

    private void deleteEntry() {

        System.out.println("Введите номер записи, которую Вы хотите удалить");
        Scanner scentrynumber = new Scanner(System.in);
        int entrynumber = scentrynumber.nextInt();
        a[entrynumber] = null;
    }

    private void addEntry (){

        this.findingASlot();
        int place = n;

        System.out.println("Введите текст");
        Scanner scnewentry = new Scanner(System.in);
        String newentry = scnewentry.nextLine();
        a[place] = newentry;
    }


}
