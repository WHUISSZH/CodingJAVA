/**
 * @author callmezh
 */
class ChainedExceptionDemo {
    void printResult() {
        try {
            method1();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void method1() throws Exception {
        try {
            method2();
        } catch (Exception ex) {
            //捕获method2抛出的异常，并被包装成一个新异常
            throw new Exception("New information from method1", ex);
        }
    }

    static void method2() throws Exception{
        throw new Exception("New information from method2");
    }
}