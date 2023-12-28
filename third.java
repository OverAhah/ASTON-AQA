public class third {
    public static void main(String[] args) {
        int[] numbers = {3, 12, 15, 18, 4, 6, 7, 10, 9, 13}; 
        
        System.out.println("Элементы массива, кратные 3:");
        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
