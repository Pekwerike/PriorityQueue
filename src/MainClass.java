public class MainClass {

    public static void main(String[] args){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(10);

        priorityQueue.insertElement("Prosper");
        priorityQueue.insertElement("Chiemela");
        priorityQueue.insertElement("Ekwerike");
        priorityQueue.insertElement("Zfancy");
        priorityQueue.insertElement("Ojuko");
        priorityQueue.insertElement("Jobo");
        priorityQueue.insertElement("Xiam");
        priorityQueue.insertElement("Adoraa");


        System.out.println(priorityQueue.deleteElement());
        System.out.println(priorityQueue.deleteElement());
        System.out.println(priorityQueue.deleteElement());
        System.out.println(priorityQueue.deleteElement());
        System.out.println(priorityQueue.deleteElement());
        System.out.println(priorityQueue.deleteElement());
        System.out.println(priorityQueue.deleteElement());
        System.out.println(priorityQueue.deleteElement());



    }
}
