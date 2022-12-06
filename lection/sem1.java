// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.util.Calendar;
// import java.util.GregorianCalendar;
// import java.util.Scanner;

// public class sem1 {
//     public static void main(String[] args) {
//         LocalDateTime now = LocalDateTime.now();
//         Calendar calendar = new GregorianCalendar();
//         System.out.println(now);
//         System.out.print(calendar);
//     }
// }

// public class sem1 { 
//     public static void main(String[] args) {
//         System.out.println("Введите иия! ");
//         Scanner in = new Scanner(System.in);
//         String name = in.nextLine();
//         in.close();
//         if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12.00)
//         System.out.println("Доброе утро " + name);
//         else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12.00 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18.00)
//         System.out.println("Добрый день " + name);
//         else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18.00 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23.00)
//         System.out.println("Добрый вечер " + name);
//         else System.out.println("Доброй ночи " + name);
//     }
// }

// public class sem1 {

//     public static void main(String[] args) {
//         Example myObject = new Example();
//         myObject.maxOfOnes();
//     }

// }

// class Example {

//     int n;
//     int[] array; // = new int[] { 1, 1, 1, 0, 1, 1 };

//     Example() {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Введите размер массива:");
//         n = input.nextInt();
//         array = new int[n];
//         System.out.println("Введите размер массива:");
//         for (int i = 0; i < n; i++) {
//             array[i] = input.nextInt();
//         }
//         input.close();
//     }

//     void maxOfOnes() {

//         int count = 0;
//         int anotherCount = 0;
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] == 1)
//                 anotherCount++;
//             else if (count < anotherCount) {
//                 count = anotherCount;
//                 anotherCount = 0;
//             }
//         }
//         // if (count < anotherCount) ? System.out.println(anotherCount) :
//         // System.out.println(count);
//         if (count < anotherCount) {
//             System.out.println(anotherCount);
//         } else {
//             System.out.println(count);
//         }
//     }

// }
