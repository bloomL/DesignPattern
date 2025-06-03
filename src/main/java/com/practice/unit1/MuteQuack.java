public class MuteQuack implements QuackBehavor {
    @Override
    public void quack() {
        System.out.println("<<沉默...>>");
    }
}