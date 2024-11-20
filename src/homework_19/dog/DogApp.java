package homework_19.dog;

import java.util.Arrays;
import java.util.Random;

public class DogApp {
    public static void main(String[] args) {

        Dog[] dogs = new Dog[5];
        double[] barrierArray = new double[7];
        int[] result = new int[5];

        Random random = new Random();
        for (int j = 0; j < dogs.length; j++) {
            dogs[j] = new Dog("Dog" + j, random.nextInt(51) + 30);
        }

        for (int i = 0; i < barrierArray.length; i++) {
            barrierArray[i] = random.nextInt(101) + 70;
//            System.out.println(barrierArray[i]);
        }

        for (int j = 0; j < dogs.length; j++) {
            Dog dog = dogs[j];
            int count = 0;
            for (int i = 0; i < barrierArray.length; i++) {
                dog.jumpBarrier(barrierArray[i]);
                if (dog.getJumpHeight() >= barrierArray[i]){
                    count += 1;
                }
             }
//            System.out.println(dogs[j].getJumpHeight());
            result[j] = count;

        }
        System.out.println("******************\n");
        System.out.println("The number of barriers each dog managed to overcome\n" + Arrays.toString(result));


    }
}
