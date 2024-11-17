/*
Task 2 * (Опционально)
Написать класс Собака (Dog).
Каждая Собака обязательно должна иметь имя и высоту прыжка
Должна уметь прыгать и должна уметь тренироваться.
За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров
Максимальная высота прыжка, которую может натренировать собака, не может быть больше,
чем двукратная высота первоначального прыжка.
Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера.
Если собака в состоянии преодолеть этот барьер - прыгает.
Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
Если да -> идем тренироваться -> берет барьер
 */

package homework_18.dog;

public class Dog {

    private String name;
    private double jumpHeight;
    private final double maxJumpHeight;

    public Dog(String name, double startingJumpHeight) {
        this.name = name;
        this.jumpHeight = startingJumpHeight;
        this.maxJumpHeight = 2 * startingJumpHeight;
    }

     public String getName() {
        return name;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void jump(){
            System.out.printf("The dog %s is jumping on the height %.2f cm\n", name, jumpHeight );
        }

    public void     train(){
        if ((jumpHeight + 10) > maxJumpHeight) {
            System.out.printf("The dog %s has reached its maximum jump height of %.2f cm. No more training possible.\n", name, maxJumpHeight);
        } else{
            jumpHeight += 10;
            System.out.printf("The dog %s is training. New jump height: %.2f cm.\n", name, jumpHeight);
            }
    }

    public void jumpBarrier(double barrierHeight){
        if (barrierHeight <= 0) {
            System.out.println("Barrier height must be bigger than zero.");
            return;
        }
        System.out.printf("Trying to jump over a barrier of height: %.2f cm.\n", barrierHeight);
        if (jumpHeight >=  barrierHeight){
            System.out.printf("The dog %s easily jumped over the barrier!\n", name);
            jump();
        } else {
            System.out.printf("The dog %s cannot jump over the barrier right now. Training required.\n", name);
            while (jumpHeight < barrierHeight && jumpHeight + 10 <= maxJumpHeight){
                train();
            }
            if (jumpHeight >=  barrierHeight){
                System.out.printf("The dog %s successfully jumped over the barrier after training!\n", name);
            } else {
                System.out.printf("The dog %s cannot jump over the barrier of height %.2f cm even after training.\n", name, barrierHeight);
            }

        }

    }
}
