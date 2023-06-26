package low_level_design;

class Main {
    public static void main(String[] args){
        EvenOdd eo = new EvenOdd();
        Thread t1 = new Thread(() -> {
            eo.printEvenNumber();
        });
        Thread t2 = new Thread(() -> {
            eo.printOddNumber();
        });
        t1.setName("Even: ");
        t2.setName("Odd: ");
        t1.start();
        t2.start();
    }
}

class EvenOdd {
    int n = 100;
    int index = 1;
    public void printEvenNumber(){
        while (index <= n){
            synchronized(EvenOdd.class) {
                try{
                    while(index%2 == 1){
                        wait();
                    }
                    System.out.println(Thread.currentThread().getName() + index);
                    index++;
                    notify();
                } catch (Exception e){
                }
            }
        }

    }

    public void printOddNumber(){
        while (index < n){
            synchronized(EvenOdd.class) {
                try {
                    while(index%2 == 0){
                        wait();
                    }
                    System.out.println(Thread.currentThread().getName() + index);
                    index++;
                    notify();
                } catch (Exception e){
                }
            }
        }
    }
}
