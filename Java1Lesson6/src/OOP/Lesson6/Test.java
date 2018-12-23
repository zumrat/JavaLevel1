package OOP.Lesson6;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("Tuzik", 0.5f, 500, 10);
        Cat c = new Cat("Barsik", 2, 200, 1);

        Animal[] arr = {c, d};
        float toJump = 1.5f;
        float toRun = 350;
        float toSwim = 5;

        for (int i = 0; i < arr.length; i++) {
            String nameString = arr[i].getType() + " " + arr[i].getName() + " can ";

            String eventName = String.format("jump max %.2fm. Tries to jump ", arr[i].getMaxJump());
            String eventResult = (arr[i].jump(toJump)) ? "succeed" : "fails";
            System.out.println(nameString + eventName + toJump + "m and " + eventResult);

            eventName = String.format("run max %.2fm. Tries to run ", arr[i].getMaxRun());
            eventResult = arr[i].run(toRun) ? "succeed" : "fails";
            System.out.println(nameString + eventName + toRun + "m and " + eventResult);

            int swimResult = arr[i].swim(toSwim);
            eventName = String.format("swim max %.2fm. Tries to swim ", arr[i].getMaxSwim());
            eventResult = (swimResult == Animal.SWIM_SUCCESS) ? "succeed" : "fails";
            if (swimResult == Animal.SWIM_WTH)
                eventResult = "too scared to enter the water";
            System.out.println(nameString + eventName + toSwim + "m and " + eventResult);
        }
    }
}