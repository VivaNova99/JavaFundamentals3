import java.util.Scanner;

/**
 * Класс NotebookEntry реализует функционал по предложению выбора варианта работы с записями,
 * а так же реализует саму работу с записями.
 */
public class NotebookEntry {

    private String[] a = new String[100];

    private int freePlace = 0;

    /**
     * Поиск первого по порядку пустого элемента в массиве для хранения новой записи.
     * @return freePlace - возвращает индекс пустого элемента.
     */
    private int getFreeSlot(){
        for (int i = 0; i < 100; i++){
            if (a[i] == null) {

                freePlace = i;
                break;
            }

        }

        if (freePlace == 99)
            System.out.println("Нет свободного места для новых записей");

        return freePlace;

    }

    /**
     * Метод makingAChoice() предлагает сделать выбор и вызывает методы, работающие с записями, в соответствии со сделанным выбором
     * либо завершает работу программы.
     */
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

    /**
     * Метод viewAllEntries() выводит на консоль все непустые элементы массива записей.
     */
    private void viewAllEntries() {

        for (int i = 0; i < 100; i++){
            if (a[i] != null) {
                System.out.println("Запись " + i +" - " + a[i]);
            }
        }

    }

    /**
     * Метод editEntry() заменяет выбранную запись в массиве записей на новую.
     */
    private void editEntry() {

        System.out.println("Введите номер записи, которую Вы хотите отредактировать");
        Scanner scentrynumber = new Scanner(System.in);
        int entrynumber = scentrynumber.nextInt();
        System.out.println("Отредактируйте запись " + entrynumber);
        Scanner sceditentry = new Scanner(System.in);
        String editEntry = sceditentry.nextLine();
        a[entrynumber] = editEntry;

    }

    /**
     * Метод deleteEntry() присваивает значение null выбранному элементу массива
     */
    private void deleteEntry() {

        System.out.println("Введите номер записи, которую Вы хотите удалить");
        Scanner scentrynumber = new Scanner(System.in);
        int entrynumber = scentrynumber.nextInt();
        a[entrynumber] = null;
    }

    /**
     * Метод addEntry() записывает введенную строку в первый по порядку пустой элемент массива.
     */
    private void addEntry (){

        System.out.println("Введите текст");
        Scanner scnewentry = new Scanner(System.in);
        String newentry = scnewentry.nextLine();
        a[getFreeSlot()] = newentry;
    }


}
