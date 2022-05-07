public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1/№2/№3/№4");
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        for (int i = 0; i < box.length; i++) {
            if (i < box.length - 1)
                System.out.print(box[i] + ",");
            else
                System.out.print(box[i]);
        }
        System.out.println(" ");
        for (int i = box.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(box[i] + ",");
            else
                System.out.print(box[i]);
        }
        System.out.println(" ");

        double[] box2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < box2.length; i++) {
            if (i < box2.length - 1)
                System.out.print(box2[i] + ",");
            else
                System.out.print(box2[i]);
        }
        System.out.println(" ");
        for (int i = box2.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(box2[i] + ",");
            else
                System.out.print(box2[i]);
        }
        System.out.println(" ");

        int[] box3 = {1, 3, 5, 7, 9};
        for (int i = 0; i < box3.length; i++) {
            if (i < box3.length - 1)
                System.out.print(box3[i] + ",");
            else
                System.out.print(box3[i]);
        }
        System.out.println(" ");
        for (int i = box3.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(box3[i] + ",");
            else
                System.out.print(box3[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < box3.length; i++) {
            if (i < box3.length + 1)
                System.out.print(box3[i] + 1 + ",");
            else
                System.out.print(box3[i]);
        }

    }

}