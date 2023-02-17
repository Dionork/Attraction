import java.util.*;


public class Main {
    public static void main(String[] args) {
        Queue <Person> queue = new ArrayDeque<>();
        for (Person e: generateClient()) {
            queue.offer(e);
        }
        System.out.println("Карусель запустилась!");
        while (!queue.isEmpty()){
            if (queue.peek().getTicket() > 0){
            System.out.println((queue.peek()) + " прокатился!");
            queue.peek().setTicket(queue.peek().getTicket()-1);
            queue.offer(queue.poll());
            }
            else {
                System.out.println(queue.poll()+ " билеты закончились!");
            }
        }
        System.out.println("Билеты у всех закончились!");
    }

        public static List<Person> generateClient() {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("Vasya", "Bublichkin", 4));
        list.add(new Person("Kolyan", "Nosov", 1));
        list.add(new Person("Vinni", "Puch", 6));
        list.add(new Person("Admin", "Rutovich", 3));
        list.add(new Person("Krasavchik", "Jo", 2));
        return list;
    }
}
