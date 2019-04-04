public class gooddog {
    private  int size ;
    public int getSize(){
        return size ;
    }

    public void setSize(int s){
        size = s;
    }

    void bark(){
        if (size>60){
            System.out.println("Гав гав");
        } else if (size>16){
            System.out.println("Вуф Вуф");
        } else {
            System.out.println("Тяф Тяф");
        }
    }
}
class GoodDogTestDrive {
    public static void main(String[] args){
        gooddog one = new gooddog();
        System.out.println("Первая собака:" + one.getSize());
        one.setSize(70);
        gooddog two = new gooddog();
        two.setSize(8);
        System.out.println("Первая собака:" + one.getSize());
        System.out.println("Вторая собака:" + two.getSize());
        one.bark();
        two.bark();
        System.out.println("Проверка GIT");
        }
}





















