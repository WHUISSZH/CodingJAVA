public class TestPrintf {
    public void text(){
        boolean b = true;
        double amount = 1234.456;
        double rate = 0.1;
        double interest = amount* rate;
        System.out.println(interest);
        System.out.printf("%e %s %b", interest, "java is the best", b);
    }
}
