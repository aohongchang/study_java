package constructor;

class Randomteset {
    public static void main(String[] args) {
        double d1 = Math.random();

        System.out.println(d1);
        System.out.println((int)(d1*100));
        System.out.println((int)(Math.random()*(7-5+1))+5);

 //公式【a,b]范围的随机整数
        //(int)(Math.random()*(b-a+1)) + a
    }
}
